package madstodolist.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AcercaController.class)
public class AboutWebTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVistaAcercaDeNosotros() throws Exception {
        mockMvc.perform(get("/nosotros"))
                .andExpect(status().isOk())
                .andExpect(view().name("acercaDeNosotros"));
    }
}
