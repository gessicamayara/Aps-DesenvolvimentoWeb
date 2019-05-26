package br.com.locadoravideogames.dao;

import org.junit.Test;

import br.com.locadoravideogames.entity.Cliente;

public class ClienteDAOTest {
	
	@Test
	public void salvar() {
		Cliente cliente  = new Cliente();
		
		cliente.setNome("Géssica Mayara");
		cliente.setEndereco("Rua Tomas Gonzaga");
		cliente.setNumero("385");
		cliente.setBairro("Cristo Redentor");
		cliente.setCidade("Fortaleza");
		cliente.setEstado("CE");
		cliente.setCep("60336210");
		cliente.setComplemento("Ao lado do Hospital Infantil");
		cliente.setCelular("85997096241");
		cliente.setCpf("04510723326");
		cliente.setEmail("gessica.mayara@programmer.net");
		  
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
	}
}
