package com.example.demo.service;

import com.example.demo.model.Logradouro;
import com.example.demo.repository.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogradouroService {

    @Autowired
    private LogradouroRepository logradouroRep;

    public List<Logradouro> findAllLogradouro(int faixaInicial, int faixaFinal){
        return this.logradouroRep.findFaixaLogradouro(
          faixaInicial,
          faixaFinal,
          PageRequest.ofSize(1000)
        );
    }

    public Logradouro findOneLogradouro(String cep) {
        return this.logradouroRep.cep(cep);
    }
}
