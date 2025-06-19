package com.simplilearn.springjenkins.springjenkins;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(NewsController.class)
class NewsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetLatestBusinessNewsHeadline() throws Exception {
        mockMvc.perform(get("/news/headline"))
                .andExpect(status().isOk())
                .andExpect(content().string("Starlight, star bright: Coca-Cola introduces a 1st-of-its-kind flavor, inspired by space - KSL.com"));
    }
}