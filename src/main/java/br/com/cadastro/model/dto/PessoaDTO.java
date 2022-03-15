package br.com.cadastro.model.dto;

import br.com.cadastro.model.Pessoa;
import br.com.cadastro.model.enums.TipoPessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO {
    private String nome;
    private String email;
    private Integer tipoDocumento;
    private String documento;
    private Integer telefone;

    public PessoaDTO(String nome, String email, Integer tipoDocumento, String documento, Integer telefone) {
        this.nome = nome;
        this.email = email;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.telefone = telefone;
    }

    public static Pessoa toEntity(PessoaDTO pessoaDTO) {
        return new Pessoa(pessoaDTO.getNome(), pessoaDTO.getEmail(),
                TipoPessoa.toEnum(pessoaDTO.getTipoDocumento()).getTipoDocumento(),pessoaDTO.getDocumento(),
                pessoaDTO.getTelefone());
    }
}
