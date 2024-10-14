package com.jhonatan.junit35app.ejemplos.models;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    //creamos un metodo test
    @Test
    void testNombreCuenta() {
        Cuenta c = new Cuenta("Andrez", new BigDecimal("1000.12345"));
        //c.setPersona("Andrez");

        String esperado = "Andrez";
        String real = c.getPersona();

        //hacemos un test osea comparamos
        assertEquals(esperado, real);

        //otro metodo  devuelve true o false
        assertTrue(real.equals("Andrez"));

    }

    @Test
    void saldoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        //el saldo se convierte a double
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());

        //otro metodo de Assertions que el saldo no sea negativo
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }
}
