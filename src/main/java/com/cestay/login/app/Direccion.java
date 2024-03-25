package com.cestay.login.app;

public class Direccion {

    private String calle;
    private String numero;
    private String ciudad;
    private String comuna;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String ciudad, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getComuna() {
        return comuna;
    }

}
