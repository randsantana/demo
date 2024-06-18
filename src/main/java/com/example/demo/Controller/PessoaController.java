package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Pessoa;
import com.example.demo.Repository.PessoaRepository;


@Controller
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoa/create")
    public String creat() {
        return "pessoa/create";
    }   
    @PostMapping("/pessoa/create")
    public String create(Pessoa pessoa) {

        pessoaRepository.save(pessoa);

        return "/pessoa/create";
    }
    
}