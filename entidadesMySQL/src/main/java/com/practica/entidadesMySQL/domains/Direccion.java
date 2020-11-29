package com.practica.entidadesMySQL.domains;

import javax.persistence.*;

@Entity
@Table(name="direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre_direccion")
    private String nombreDireccion;
    //@Column(name="id_cliente")
    //private String idCliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDireccion() {
        return nombreDireccion;
    }

    public void setNombreDireccion(String nombreDireccion) {
        this.nombreDireccion = nombreDireccion;
    }


}
