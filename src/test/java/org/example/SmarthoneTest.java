package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class SmarthoneTest {

    @Mock
    Calcilator calcilator;

    @InjectMocks
    Smarthone smarthone;//создание и внедрение смартфона в calcilator

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void plus() {
        when(calcilator.add(10,20)).thenReturn(30);
        Assertions.assertEquals(30,smarthone.plus(10,20));
    }
}