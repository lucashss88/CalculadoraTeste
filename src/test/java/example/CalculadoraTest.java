package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        double resultado = calc.somar(3,5);
        assertEquals(8, resultado);
    }

    @Test
    void testSubtracao() {
        double resultado = calc.subtrair(10,5);
        assertEquals(5, resultado);
    }

    @Test
    void testMultiplicacao() {
        double resultado = calc.multiplicar(3,5);
        assertEquals(15, resultado);
    }

    @Test
    void testDivisao() {
        double resultado = calc.dividir(15,5);
        assertEquals(3, resultado);
    }
}
