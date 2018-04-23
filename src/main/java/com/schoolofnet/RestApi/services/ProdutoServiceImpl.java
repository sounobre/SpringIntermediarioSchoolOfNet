/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolofnet.RestApi.services;

import com.schoolofnet.RestApi.models.Produto;
import com.schoolofnet.RestApi.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author souno
 */
@Service
public class ProdutoServiceImpl implements ProdutoServico{
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> findAll() {
       return this.produtoRepository.findAll();
    }

    @Override
    public Produto find(Long id) {
        return this.produtoRepository.findOne(id);
     //   return null;
    }

    @Override
    public Produto create(Produto produto) {
        this.produtoRepository.save(produto);
       return produto;
    }

    @Override
    public Produto update() {
      return null;
    }

    @Override
    public void delete() {
      
    }
    
}
