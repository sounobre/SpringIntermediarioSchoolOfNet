/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolofnet.RestApi.repository;

import com.schoolofnet.RestApi.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author souno
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
