package org.example.service.impl;

import org.example.domain.enums.Unit;
import org.example.service.Operation;

public class OperationImpl implements Operation {
    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    @Override
    public double tempConversion(double temperature, Unit unit) {
        return switch (unit){
            case F -> (temperature-32)*(5.0/9.0);
            case C-> (temperature)*(9.0/5.0)*32;
        };
    }
}
