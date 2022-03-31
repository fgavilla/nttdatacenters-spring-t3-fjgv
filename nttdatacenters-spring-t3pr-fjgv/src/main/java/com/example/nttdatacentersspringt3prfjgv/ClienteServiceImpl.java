package com.example.nttdatacentersspringt3prfjgv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteServiceI {

	@Autowired
	private ClienteI customerI;
	
	@Override
	public void insertCustomer(Cliente cliente) {
		customerI.save(cliente);
	}
	
	@Override
	@Transactional
	public Cliente searchByID(Long ID) {
		Cliente result = customerI.findByID(ID);
		return result;
	}

	@Override
	public List<Cliente> searchAll() {
		List<Cliente> result = customerI.findAll();
		return result;
	}

	@Override
	public List<Cliente> searchByName(String nombre) {
		List<Cliente> result = customerI.findByName(nombre);
		return result;
	}

	@Override
	public List<Cliente> searchByFullName(String nombre, String apellido1, String apellido2) {
		List<Cliente> result = customerI.findByNameAndLastname1AndLastname2(nombre, apellido1, apellido2);
		return result;
	}

	@Override
	public void updateCustomer(Cliente customer) {
		customerI.save(customer);
	}

	@Override
	public void deleteCustomer(Cliente customer) {
		customerI.delete(customer);
	}

}
