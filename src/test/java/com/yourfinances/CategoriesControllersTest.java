package com.yourfinances;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CategoriesControllersTest {
String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZ3VzdGluIiwiaWF0IjoxNzQyMzEzNDE3LCJleHAiOjE3NDIzMTQ4NTd9.HkMqbly0fHjCUebFOsF5qq0so7EXjXgZTgqUPN7rv_w";
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getCategories() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/categorie/all")
                        .header("Authorization", "Bearer " + token)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}
