package br.com.cadastro.services;

import br.com.cadastro.domain.Pessoa;
import br.com.cadastro.repositories.PessoaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa findPessoa(Integer id) {
        Optional<Pessoa> obj = pessoaRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Pessoa não encontrada! Id: " + id));
    }

}
