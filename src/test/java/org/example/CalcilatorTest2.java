package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalcilatorTest2 {

    @BeforeEach
    public void init () {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Calcilator calcilator;



    @Test
    public void testAdd() {
        when(calcilator.add(10,5)).thenReturn(15);
        Assertions.assertEquals(15, calcilator.add(10,5));

    }


}
