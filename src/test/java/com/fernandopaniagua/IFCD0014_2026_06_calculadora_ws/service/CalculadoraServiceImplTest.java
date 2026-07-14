package com.fernandopaniagua.IFCD0014_2026_06_calculadora_ws.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test unitarios para CalculadoraServiceImpl")
class CalculadoraServiceImplTest {

    private CalculadoraServiceImpl calculadoraService;

    @BeforeEach
    void setUp() {
        calculadoraService = new CalculadoraServiceImpl();
    }

    // Tests para la operación SUMA
    @Test
    @DisplayName("suma: dos números positivos")
    void testSumaPositivos() {
        int resultado = calculadoraService.suma(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    @DisplayName("suma: dos números negativos")
    void testSumaNegativos() {
        int resultado = calculadoraService.suma(-5, -3);
        assertEquals(-8, resultado);
    }

    @Test
    @DisplayName("suma: número positivo y negativo")
    void testSumaPositivoNegativo() {
        int resultado = calculadoraService.suma(5, -3);
        assertEquals(2, resultado);
    }

    @Test
    @DisplayName("suma: número negativo y positivo")
    void testSumaNegativoPositivo() {
        int resultado = calculadoraService.suma(-5, 3);
        assertEquals(-2, resultado);
    }

    @Test
    @DisplayName("suma: con ceros")
    void testSumaConCeros() {
        assertEquals(0, calculadoraService.suma(0, 0));
        assertEquals(5, calculadoraService.suma(5, 0));
        assertEquals(5, calculadoraService.suma(0, 5));
    }

    @Test
    @DisplayName("suma: números grandes")
    void testSumaNumerosGrandes() {
        int resultado = calculadoraService.suma(1000000, 2000000);
        assertEquals(3000000, resultado);
    }

    // Tests para la operación RESTA
    @Test
    @DisplayName("resta: dos números positivos")
    void testRestaPositivos() {
        int resultado = calculadoraService.resta(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    @DisplayName("resta: dos números negativos")
    void testRestaNegativos() {
        int resultado = calculadoraService.resta(-5, -3);
        assertEquals(-2, resultado);
    }

    @Test
    @DisplayName("resta: número positivo menos negativo")
    void testRestaPositivoMenosNegativo() {
        int resultado = calculadoraService.resta(5, -3);
        assertEquals(8, resultado);
    }

    @Test
    @DisplayName("resta: número negativo menos positivo")
    void testRestaNegativoMenosPositivo() {
        int resultado = calculadoraService.resta(-5, 3);
        assertEquals(-8, resultado);
    }

    @Test
    @DisplayName("resta: con ceros")
    void testRestaConCeros() {
        assertEquals(0, calculadoraService.resta(0, 0));
        assertEquals(5, calculadoraService.resta(5, 0));
        assertEquals(-5, calculadoraService.resta(0, 5));
    }

    @Test
    @DisplayName("resta: números grandes")
    void testRestaNumerosGrandes() {
        int resultado = calculadoraService.resta(3000000, 1000000);
        assertEquals(2000000, resultado);
    }

    @Test
    @DisplayName("resta: resultado negativo")
    void testRestaResultadoNegativo() {
        int resultado = calculadoraService.resta(3, 5);
        assertEquals(-2, resultado);
    }

    // Tests combinados
    @Test
    @DisplayName("suma y resta secuencial")
    void testSumaYRestaSecuencial() {
        int suma = calculadoraService.suma(10, 5);
        int resta = calculadoraService.resta(suma, 3);
        assertEquals(12, resta);
    }

}
