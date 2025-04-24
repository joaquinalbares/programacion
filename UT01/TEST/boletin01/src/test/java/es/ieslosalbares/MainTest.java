package es.ieslosalbares;

import static es.ieslosalbares.Main.ejercicio01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class MainTest {
    @Test
    @DisplayName("pruenba del ejercicio 1")
    public void testEjercicio01() {
        String resultado = ejercicio01 (5,6);
        assertEquals("6 es mayor que 5" , resultado);  
        resultado = ejercicio01 (9,6); 
        assertEquals("9 es mayor que 6" , resultado);   
        resultado = ejercicio01 (9,9); 
        assertEquals("9 y 9 son iguales" , resultado);        
    }
}
