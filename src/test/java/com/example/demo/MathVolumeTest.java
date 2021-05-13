package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MathVolume.class)
public class MathVolumeTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testVolume() throws Exception {

        RequestBuilder volume1 = MockMvcRequestBuilders.post("/math/volume/3/4/5");

        this.mvc.perform(volume1)
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 3x4x5 rectangle is 60"));

        RequestBuilder volume2 = MockMvcRequestBuilders.post("/math/volume/6/7/8");

        this.mvc.perform(volume2)
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 6x7x8 rectangle is 336"));

    }

}
