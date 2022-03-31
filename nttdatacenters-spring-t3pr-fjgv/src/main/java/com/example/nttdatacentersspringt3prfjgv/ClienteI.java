package com.example.nttdatacentersspringt3prfjgv;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteI extends JpaRepository<Cliente, Long>{
	
	public Cliente findByID(Long ID);
	
	public List<Cliente> findByName(String nombre);
	
	public List<Cliente> findByNameAndLastname1AndLastname2(String nombre, String apellido1, String apellido2);
}
