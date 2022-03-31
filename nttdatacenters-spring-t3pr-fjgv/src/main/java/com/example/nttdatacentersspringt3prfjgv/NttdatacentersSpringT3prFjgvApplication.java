package com.example.nttdatacentersspringt3prfjgv;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NttdatacentersSpringT3prFjgvApplication implements CommandLineRunner{

	@Autowired
	private ClienteServiceI clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT3prFjgvApplication.class, args);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.setID(1L);
		c1.setNombre("Francisco");
		c1.setApellido1("Garcia");
		c1.setApellido2("Villalon");
		c1.setDni("01223333E");
		c1.setFechaNacimiento(new Date(101, 3, 8));
		
		c2.setID(1L);
		c2.setNombre("Antonio");
		c2.setApellido1("Gallardo");
		c2.setApellido2("Rodriguez");
		c2.setDni("01223333E");
		c2.setFechaNacimiento(new Date(101, 3, 8));
		
		c3.setID(1L);
		c3.setNombre("Jesus");
		c3.setApellido1("Moreno");
		c3.setApellido2("Perez");
		c3.setDni("01223333E");
		c3.setFechaNacimiento(new Date(101, 3, 8));
		
		
		
		clienteService.insertCustomer(c1);
		clienteService.insertCustomer(c2);
		clienteService.insertCustomer(c3);
		
		
		
		System.out.println("Buscar todos los clientes:");

		clienteService.searchAll().forEach(System.out::println);
		
		System.out.println("Buscar por nombre:");

		clienteService.searchByName("Francisco").forEach(System.out::println);

		System.out.println("Busqueda por nombre y apellidos");

		clienteService.searchByFullName("Francisco", "Garcia", "Villalon").forEach(System.out::println);
		
	}

}
