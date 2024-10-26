package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import ua.edu.ucu.apps.FlowerStore.delivery.DeliveryController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DeliveryController.class)
public class DeliveryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetDeliveries() throws Exception {
        mockMvc.perform(get("/delivery"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Post delivery"))
                .andExpect(jsonPath("$[1].name").value("DHLDelivery"));
    }
}

