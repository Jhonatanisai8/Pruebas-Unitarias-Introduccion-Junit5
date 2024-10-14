package com.jhonatan.junit35app.ejemplos.models;

import java.math.BigDecimal;

public class Cuenta {

    //atributos
    private String persona;
    private BigDecimal saldo;

    //constructor
    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona.toUpperCase();
        this.saldo = saldo;
    }

    //getters y setters
    public String getPersona() {
        return persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
