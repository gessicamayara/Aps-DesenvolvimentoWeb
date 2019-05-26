package br.com.locadoravideogames.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//É Necessário implementar a interface Serializable por causa dos frameworks que tentam serializar os objetos
//Esta classe não é uma tabela no banco, apenas será utilizada pelas outras tabelas
@SuppressWarnings("serial")
@MappedSuperclass 
public class EntidadeGenerica implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
