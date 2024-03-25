package com.cestay.login.app;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private long perfil;
    private List<Direccion> direcciones;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String apellido, String email, String password, long perfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.perfil = perfil;
        this.direcciones = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getPerfil() {
        return perfil;
    }

    public void setDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

}
