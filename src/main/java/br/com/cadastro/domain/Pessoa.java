package br.com.cadastro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.cadastro.domain.enums.TipoPessoa;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	private Integer tipoDocumento;
	private String documento;
	private Integer telefone;

	public Pessoa(Long id, String nome, String email, String tipoDocumento, Integer telefone) {
		this.nome = nome;
		this.email = email;
		this.tipoDocumento = TipoPessoa.toEnum(tipoDocumento).getCod();
		this.telefone = telefone;
	}

	public Pessoa() {

	}
}
