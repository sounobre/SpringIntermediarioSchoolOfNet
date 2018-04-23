/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolofnet.RestApi.services;

import com.schoolofnet.RestApi.models.Produto;
import java.util.List;

/**
 *
 * @author souno
 */
public interface ProdutoServico {
    
    public List<Produto> findAll();
    public Produto find(Long id);
    public Produto create(Produto produto);
    public Produto update();
    public void delete();
    
    
}
