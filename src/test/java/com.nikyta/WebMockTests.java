package com.nikyta;

import com.nikyta.Controller.StudentController;
import com.nikyta.Entity.Student;
import com.nikyta.Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class WebMockTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private static Student fakeStudent;

    @MockBean
    private StudentService studentService;


    private void formFakeStudent(){
        fakeStudent.setId(1);
        fakeStudent.setName("Zamokaniy");
        fakeStudent.setCourse("MOCKthisBITCH");
    }

    @Test
    public void returnStudentById() throws Exception{
        formFakeStudent();
        System.out.println(fakeStudent.getName());


        when(studentService.getStudentById(1))
                .thenReturn(fakeStudent);
        this.mockMvc.perform(get("/students/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("MOCKthisBITCH")));

    }

}
