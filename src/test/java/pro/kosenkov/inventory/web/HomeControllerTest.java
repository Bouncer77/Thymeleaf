package pro.kosenkov.inventory.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import pro.kosenkov.inventory.web.controllers.HomeController;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HomeController.class) // Указываем контроллер, который тестируем
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk()) // Правильный синтаксис вызова isOk()
                .andExpect(view().name("home")) // Проверяем, что рендерится правильное представление (home.html)
                .andExpect(content().string(containsString("Welcome to ...")));
    }
}

