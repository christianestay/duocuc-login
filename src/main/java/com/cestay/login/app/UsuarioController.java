package com.cestay.login.app;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private List<Usuario> usuarios ;


    public UsuarioController() {

        Usuario usuario1 = new Usuario(1L, "Christian", "Estay", "cestay@mail.cl", "1234", 1);
        Direccion direccion1 = new Direccion("Calle Falsa", "123", "Valparaíso", "Viña del Mar");
        usuario1.setDireccion(direccion1);
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario(2L, "Homero", "Simpson", "homero@mail.cl", "123456", 1);
        Direccion direccion2 = new Direccion("Avenida Siempreviva", "742", "Springfield", "Springfield");
        usuario2.setDireccion(direccion2);
        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario(3L, "Marcelo", "Salas", "msalas@mail.cl", "qwerty", 2);
        Direccion direccion3 = new Direccion("Calle 7", "123", "Santiago", "Santiago");
        usuario3.setDireccion(direccion3);
        usuarios.add(usuario3);
    
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsers() {
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getUser(@PathVariable Long id) {
        return usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/usuarios/{id}/direcciones")
    public List<Direccion> getAddresses(@PathVariable Long id) {
        return usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().map(Usuario::getDirecciones).orElse(null);
    }

}