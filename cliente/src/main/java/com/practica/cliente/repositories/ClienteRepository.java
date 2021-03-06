package com.practica.cliente.repositories;

import com.practica.entidadesMySQL.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
