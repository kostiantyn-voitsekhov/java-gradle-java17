package com.epam.edp.demo.conroller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloEdpControllerTests {

    @Test
    public void helloTest() {
        // GIVEN
        HelloEdpController helloEdpController = new HelloEdpController();

        // WHEN
        String result = helloEdpController.hello();

        // THEN
        assertEquals("Hello, EDP!", result);
    }
}