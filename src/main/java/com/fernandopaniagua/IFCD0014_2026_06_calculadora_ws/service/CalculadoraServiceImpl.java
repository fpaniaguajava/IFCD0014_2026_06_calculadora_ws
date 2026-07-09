package com.fernandopaniagua.IFCD0014_2026_06_calculadora_ws.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
    @Override
    public int suma(int s1, int s2) {
        return s1 + s2;
    }

    @Override
    public int resta(int r1, int r2) {
        return r1 - r2;
    }
}
