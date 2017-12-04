package com.nikyta;


import com.nikyta.Controller.StudentController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
//@WebMvcTest(StudentController.class)
public class WebLayerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void shouldReturnAllFakeStudents() throws Exception{
//        this.mockMvc.perform(get("/students"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("id")));
//
//
//    }
//
//    @Test
//    public void shouldReturnFakeStudentById() throws Exception{
//
//        this.mockMvc.perform(get("/students/1"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Perviy")));
//
//    }


}
