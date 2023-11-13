package com.example.demo.controller;

import com.example.demo.model.Logradouro;
import com.example.demo.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="logradouro")
public class LogradouroResource {

    @Autowired
    private LogradouroService service;

    @GetMapping("{initial}/{termino}")
    public List<Logradouro> getLogradouro(@PathVariable int initial, @PathVariable int termino ) {
        return this.service.findAllLogradouro(initial, termino);
    }

    @GetMapping("{cep}")
    public Logradouro getOneLogradouro(@PathVariable("cep") String cep) {
        return this.service.findOneLogradouro(cep);
    }
}
