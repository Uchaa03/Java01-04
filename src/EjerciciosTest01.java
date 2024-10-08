import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosTest01 {
    //Ejercicio 2
    @Test
    public void testEurosAPesetas() {
        assertEquals(16638.6, EjerciciosES.eurosAPesetas(100), 0.1);
    }
    //Ejercicio 5
    @Test
    public void testAreaRectangulo() {
        assertEquals(20, EjerciciosES.areaRectangulo(4, 5), 0.001);
    }
    //Ejercicio 8
    @Test
    public void testCalcularSalarioSemanal() {
        assertEquals(480, EjerciciosES.calcularSalarioSemanal(40), 0.001);
    }

    //Ejercicio 11

}
