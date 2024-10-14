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
        
        //otro metodo 
        assertTrue(real.equals("Andrez"));
        
    }

}
