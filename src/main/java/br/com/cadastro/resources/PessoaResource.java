package br.com.cadastro.resources;

import br.com.cadastro.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {

    @Autowired
    PessoaService pessoaService;


}
