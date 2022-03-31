package com.example.nttdatacentersspringt3prfjgv;

import java.util.List;

public interface ClienteServiceI {

	public void insertCustomer(Cliente cliente);

	public Cliente searchByID(Long ID);

	public List<Cliente> searchAll();

	public List<Cliente> searchByName(String nombre);

	public List<Cliente> searchByFullName(String nombre, String apellido1, String apellido2);

	public void updateCustomer(Cliente cliente);

	public void deleteCustomer(Cliente cliente);

}
