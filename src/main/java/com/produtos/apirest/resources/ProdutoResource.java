package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import com.produtos.apirest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoResource {
    @Autowired
    ProdutoService service;


    @GetMapping(path = "/{Id}")
    public Produto retornaProduto(@PathVariable(value = "Id") Long Id) {
        return this.service.findById(Id);
    }

    @GetMapping(path = "/")
    public List<Produto> consultaProdutos() {
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> deletaProduto(@PathVariable(value = "Id") Long Id) {
        this.service.deletaProduto(Id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}