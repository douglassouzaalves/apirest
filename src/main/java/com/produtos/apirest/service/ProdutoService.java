package com.produtos.apirest.service;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto findById(Long Id) {
        return this.produtoRepository.findById(Id);
    }

    public List<Produto> findAll() {
        List<Produto> listaProdutos = this.produtoRepository.select();
        return listaProdutos;
        
    }
    
    public void deletaProduto(Long Id) {
        this.produtoRepository.deleta(Id);
    }    

    

}
