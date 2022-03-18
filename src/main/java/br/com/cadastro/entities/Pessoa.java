package br.com.cadastro.entities;

import javax.persistence.*;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "pessoas")
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

}
