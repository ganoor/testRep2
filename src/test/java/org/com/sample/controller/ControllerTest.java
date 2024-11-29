package org.com.sample.controller;

import static org.junit.Assert.assertEquals;

import org.com.sample.controller.Controller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ControllerTest {
	
	@InjectMocks
	Controller dmapController;


    @Test
    void testGetAllDeadCodeDetails() {

        // Calling the controller method
        String actualResult = dmapController.getAPIStatus();

        // Verifying the result
        assertEquals("success", actualResult);
    }
    
}
