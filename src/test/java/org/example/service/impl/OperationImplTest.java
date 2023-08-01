package org.example.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationImplTest {

    @Test
    void sum() {
        OperationImpl operation= new OperationImpl();
        double expected = 10.0;
        double result = operation.sum(8.0,2.0);
        assertEquals(expected, result,"la operacion de suma no se realiza correctamente");

    }

    @Test
    void tempConversion() {
    }
}