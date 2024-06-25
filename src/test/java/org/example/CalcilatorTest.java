package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalcilatorTest {

    @Test
    void add() {
        Calcilator calcilator = mock(Calcilator.class);

        when(calcilator.add(5,5)).thenReturn(10);
        when(calcilator.add(57,57)).thenReturn(114);
        int result =  calcilator.add(57,57);


        Assertions.assertEquals(114,result);
        verify(calcilator).add(57,57);
    }
}