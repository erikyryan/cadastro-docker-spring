package br.com.cadastro.entitys.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum TipoPessoa {

	CPF (1,"CPF"),
	CNPJ(2,"CNPJ");

	private int cod;
	private String tipoDocumento;

	TipoPessoa(int cod, String tipoDocumento) {
		this.cod = cod;
		this.tipoDocumento = tipoDocumento;
	}

	public static TipoPessoa toEnum(String tipoDocumento) {
		if(tipoDocumento == null) {
			return null;
		}

		for(TipoPessoa x : TipoPessoa.values()) {
			if(tipoDocumento.equals(x.getTipoDocumento())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: " + tipoDocumento);
	}

}
