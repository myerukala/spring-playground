package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MathService.class)
public class MathServiceTest {

        @Autowired
        private MockMvc mvc;

        @Test
        public void testCalculator() throws Exception {

            RequestBuilder add = MockMvcRequestBuilders.get("/math/calculate?operation=add&x=4&y=6");

            this.mvc.perform(add)
                    .andExpect(status().isOk())
                    .andExpect(content().string("4 + 6 = 10"));

            RequestBuilder subtract = MockMvcRequestBuilders.get("/math/calculate?operation=subtract&x=4&y=6");

            this.mvc.perform(subtract)
                    .andExpect(status().isOk())
                    .andExpect(content().string("4 - 6 = -2"));


            RequestBuilder multiply = MockMvcRequestBuilders.get("/math/calculate?operation=multiply&x=4&y=6");

            this.mvc.perform(multiply)
                    .andExpect(status().isOk())
                    .andExpect(content().string("4 * 6 = 24"));

            RequestBuilder divide = MockMvcRequestBuilders.get("/math/calculate?operation=divide&x=30&y=5");

            this.mvc.perform(divide)
                    .andExpect(status().isOk())
                    .andExpect(content().string("30 / 5 = 6"));
        }


    @Test
    public void testSum() throws Exception {
        mvc.perform(post("/math/sum")
                .accept(MediaType.TEXT_PLAIN)
                .param("n","20")
                .param("n","30")
                .param("n","40"))
                .andExpect(status().isOk())
                .andExpect(content().string(" 20 + 30 + 40 = 90"));

    }

}
