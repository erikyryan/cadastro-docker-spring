package br.com.cadastro.model;

import javax.persistence.*;

import br.com.cadastro.model.enums.TipoPessoa;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name= "pessoas")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nome;

	@Column
	private String email;

	@Column
	private Integer tipoDocumento;

	@Column
	private String documento;

	@Column
	private Integer telefone;

	public Pessoa(Long id, String nome, String email, String tipoDocumento, Integer telefone) {
		this.nome = nome;
		this.email = email;
		this.tipoDocumento = TipoPessoa.toEnum(tipoDocumento).getCod();
		this.telefone = telefone;
	}

	public Pessoa(String nome, String email, String tipoDocumento, String documento, Integer telefone) {
		this.nome = nome;
		this.email = email;
		this.tipoDocumento = TipoPessoa.toEnum(tipoDocumento).getCod();
		this.documento = documento;
		this.telefone = telefone;
	}

}
