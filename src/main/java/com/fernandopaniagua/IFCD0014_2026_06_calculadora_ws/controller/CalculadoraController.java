package com.fernandopaniagua.IFCD0014_2026_06_calculadora_ws.controller;


import com.fernandopaniagua.IFCD0014_2026_06_calculadora_ws.service.ICalculadoraService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    private ICalculadoraService iCalculadoraService;

    public CalculadoraController(ICalculadoraService iCalculadoraService) {
        this.iCalculadoraService = iCalculadoraService;
    }

    @Operation(summary = "Suma dos números enteros")
    @GetMapping("sumar")
    public int sumar(@RequestParam int s1, @RequestParam int s2) {
        return iCalculadoraService.suma(s1, s2);
    }
    @GetMapping("restar")
    public int restar(@RequestParam int r1, @RequestParam int r2) {
        return iCalculadoraService.resta(r1, r2);
    }
}
