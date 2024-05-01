/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GIU;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }

    @Test
    public void testCalcular() {
        System.out.println("suma");
        String num1 = "3";
        String num2 = "2";
        String operador = "+";
        String expResult = "5.0";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }

  @Test
    public void testResta() {
        System.out.println("resta");
        String num1 = "5";
        String num2 = "3";
        String operador = "-";
        String expResult = "2.0";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        String num1 = "4";
        String num2 = "3";
        String operador = "*";
        String expResult = "12.0";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivision() {
        System.out.println("division");
        String num1 = "10";
        String num2 = "2";
        String operador = "/";
        String expResult = "5.0";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testModulo() {
        System.out.println("modulo");
        String num1 = "10";
        String num2 = "3";
        String operador = "%";
        String expResult = "1.0";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }


    @Test
    public void testVerificarPunto() {
        System.out.println("verificarPunto");
        String numero = "";
        boolean expResult = false;
        boolean result = Operaciones.verificarPunto(numero);
        assertEquals(expResult, result);
    }
    
}
