package com.epam.edp.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DemoApplicationTests {

    @Test
    public void testMain() {
        // Arrange
        String[] args = new String[]{"arg1", "arg2"};

        // Act
        DemoApplication.main(args);

        // Assert
        // UNKNOWN
    }
}
