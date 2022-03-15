package br.com.cadastro.controllers;

import br.com.cadastro.model.Pessoa;
import br.com.cadastro.model.dto.PessoaDTO;
import br.com.cadastro.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public List<Pessoa> getPessoas(){
        return pessoaRepository.findAll();
    }

    @GetMapping(value="/pessoas/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Pessoa não encontrada! Id: " + id)
        );

        return ResponseEntity.ok().body(pessoa);
    }

    @PostMapping("/pessoas")
    public Pessoa insertPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/pessoas/{id}")
    public ResponseEntity<Pessoa> updatePessoaById(@PathVariable Long id, @RequestBody PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(()
                -> new RuntimeException(" " + id));

        final Pessoa updatedPessoa = pessoaRepository.save(PessoaDTO.toEntity(pessoaDTO));
        return ResponseEntity.ok().body(updatedPessoa);
    }

    @DeleteMapping("/pessoas/{id}")
    public ResponseEntity<Boolean> deletePessoa(@PathVariable Long id){
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(()
                -> new RuntimeException(" " + id));

        pessoaRepository.delete(pessoa);
        return ResponseEntity.ok().body(true);
    }

}
