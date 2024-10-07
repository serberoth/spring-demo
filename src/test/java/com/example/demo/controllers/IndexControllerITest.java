package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerITest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getIndex() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo(IndexController.TEXT);
    }

    @Test
    public void getGreet() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/greet", String.class);
        assertThat(response.getBody()).isEqualTo(IndexController.getGreeting("World"));
    }

    @Test
    public void getGreetWithName() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/greet?name=Spring", String.class);
        assertThat(response.getBody()).isEqualTo(IndexController.getGreeting("Spring"));
    }

}
