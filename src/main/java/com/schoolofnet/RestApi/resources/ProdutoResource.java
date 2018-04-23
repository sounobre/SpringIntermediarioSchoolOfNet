/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolofnet.RestApi.resources;

import com.schoolofnet.RestApi.models.Produto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author souno
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
    @GetMapping
    @ResponseBody
    public List<Produto> findAll(){
        return null;
    }
    
    @RequestMapping(value = "{/id}")
    @ResponseBody
    public Produto find(@PathVariable(value = "id") Long id){
        return null;
        
    }
    
    @PostMapping
    @ResponseBody
    public Produto create(@RequestBody Produto produto){
        return null;
    }
    
    @PutMapping(value = "/{id}")
    @ResponseBody
    public Produto update(@PathVariable(value = "id") Long id, @RequestBody Produto produto){
        return null;
    }
    
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        
    }
}

