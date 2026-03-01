package com.testeTecnico.desafio_todolist;

import com.testeTecnico.desafio_todolist.entity.Todo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.awt.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class DesafioTodolistApplicationTests {

	public DesafioTodolistApplicationTests() {}

	@LocalServerPort
	private int port;
	private WebTestClient webTestClient;

	@BeforeEach
	void setUp() {
		// Cria o WebTestClient manualmente - SEM @Autowired
		this.webTestClient = WebTestClient.bindToServer()
						.baseUrl("http://localhost:" + port)
						.build();
	}

	@Test
	void testeCreateTodoSuccess() {
		var todo = new Todo("Todo 1", "desc todo 1", false, 1);

		webTestClient
						.post()
						.uri("/todo")
						.bodyValue(todo)
						.exchange()
						.expectStatus().isOk()
						.expectBody()
						.jsonPath("$").isArray()
						.jsonPath("$.length()").isEqualTo(1)
						.jsonPath("$[0].name").isEqualTo(todo.getName())
						.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
						.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
						.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}
	@Test
	void testeCreateTodoFailure() {
		webTestClient
						.post()
						.uri("/todo")
						.bodyValue(
										new Todo("", "", false, 0)
						).exchange()
						.expectStatus().isBadRequest();
	}

}
