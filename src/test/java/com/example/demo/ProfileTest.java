package com.example.demo;

import com.example.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ProfileTest {

    @Autowired
    private MyService myService;

    @Test
    void testWithTestProfile() {
        assertEquals("test-behavior", myService.performAction());
    }
}