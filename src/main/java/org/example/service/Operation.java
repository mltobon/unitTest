package org.example.service;

import org.example.domain.enums.Unit;

public interface Operation {
    double sum(double a, double b);
    double tempConversion(double temperature, Unit unit);
}
