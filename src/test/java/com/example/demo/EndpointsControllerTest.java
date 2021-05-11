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

import java.net.ServerSocket;

    @WebMvcTest(EndpointsController.class)
    public class EndpointsControllerTest {

        @Autowired
        private MockMvc mvc;

        @Test
        public void testMathPI() throws Exception {
            RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");

            this.mvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().string("3.141592653589793"));
        }

    }
