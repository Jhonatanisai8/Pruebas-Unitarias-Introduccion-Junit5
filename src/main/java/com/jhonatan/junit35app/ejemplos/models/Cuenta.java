package com.jhonatan.junit35app.ejemplos.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Cuenta {

    //atributos
    private String persona;
    private BigDecimal saldo;

    //constructor
    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        return Objects.equals(this.saldo, other.saldo);
    }

    public void debito(BigDecimal monto){
        
    }
    
    public void credito(BigDecimal monto){
        
    }
}
