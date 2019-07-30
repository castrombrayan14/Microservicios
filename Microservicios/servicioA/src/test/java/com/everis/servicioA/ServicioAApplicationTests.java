package com.everis.servicioA;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ServicioAApplicationTests {

      @Autowired
      private MockMvc mockMvc;
      
      @Test
      public void findAllClasses()throws Exception{
    	  
    	  this.mockMvc.perform(get("/listClass")).andExpect(status().isOk())
    	  .andExpect(content().contentType("application/json;charset=utf-8"));
    	  
      }
      
      @Test
      public void findIdClasses()throws Exception{
    	  
    	  this.mockMvc.perform(get("/listClass/1")).andExpect(status().isOk())
    	  .andExpect(content().contentType("application/json;charset=utf-8"));
    	  
      }
}
