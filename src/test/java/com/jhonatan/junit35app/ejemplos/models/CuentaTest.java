package com.jhonatan.junit35app.ejemplos.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    //creamos un metodo test
    @Test
    void testNombreCuenta() {
        Cuenta c = new Cuenta();
        c.setPersona("Andrez");

        String esperado = "Andrez";
        String real = c.getPersona();
        
        //hacemos un test osea comparamos
        Assertions.assertEquals(esperado, real);
    }
}
