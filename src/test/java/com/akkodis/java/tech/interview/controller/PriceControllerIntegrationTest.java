package com.akkodis.java.tech.interview.controller;

import com.akkodis.java.tech.interview.repository.PriceRepository;
import com.akkodis.java.tech.interview.service.PriceService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private PriceRepository repository;
    @MockBean
    private PriceService service;
    @MockBean
    private ModelMapper modelMapper;

    @Test
    public void test1() throws Exception{
        mvc.perform(get("/prices")
                        .param("date", "2020-06-14-10.00.00")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .content(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].productId", Matchers.is("35455")));
    }


}
