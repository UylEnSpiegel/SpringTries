package com.nikyta;


import com.nikyta.Controller.StudentController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;

@AutoConfigureRestDocs(outputDir = "target/snippets")
@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class TryingDocks {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAllStudents() throws Exception{
        this.mockMvc.perform(get("/students/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("id")))
                .andDo(document("home", responseFields(
                        fieldWithPath("id").description("The id of the student"),
                        fieldWithPath("name").description("The id of the student"),
                        fieldWithPath("course").description("The id of the student")
                )));
    }

}
