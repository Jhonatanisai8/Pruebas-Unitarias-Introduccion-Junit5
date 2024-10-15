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
       
        //para que un valor no se null
        assertNotNull(real);

        //hacemos un test osea comparamos
        assertEquals(esperado, real);

        //otro metodo  devuelve true o false
        assertTrue(real.equals("Andrez"));

    }

    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        //para que un valor no se null
        assertNotNull(cuenta.getSaldo());

        //el salo se convierte a double
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());

        //otro metodo de Assertions que el saldo no sea negativo
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta miCuenta01 = new Cuenta("Jhon Doe", new BigDecimal("8900.999"));
        Cuenta miCuenta02 = new Cuenta("Jhon Doe", new BigDecimal("8900.999"));

        //metodo para comparar objetos por referencia 
        //assertNotEquals(miCuenta01, miCuenta02);
        //metodo para comparar por valor
        assertEquals(miCuenta01, miCuenta02);

    }

    @Test
    void testDebitoCuenta() {
        Cuenta miCuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));

        //llamamos al metodo credito de la clase cuenta
        miCuenta.debito(new BigDecimal(100));

        //para que un valor no se null
        assertNotNull(miCuenta.getSaldo());

        //intValue = duelve el monto entero
        assertEquals(900, miCuenta.getSaldo().intValue());

        // toPlainString = devuelve un String plano
        assertEquals("900.12345", miCuenta.getSaldo().toPlainString());
    }
    @Test
    void testCreditoCuenta() {
        Cuenta miCuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));

        //llamamos al metodo credito de la clase cuenta
        miCuenta.credito(new BigDecimal(100));

        //para que un valor no se null
        assertNotNull(miCuenta.getSaldo());

        //intValue = duelve el monto entero
        assertEquals(1100, miCuenta.getSaldo().intValue());

        // toPlainString = devuelve un String plano
        assertEquals("1100.12345", miCuenta.getSaldo().toPlainString());
    }

}
