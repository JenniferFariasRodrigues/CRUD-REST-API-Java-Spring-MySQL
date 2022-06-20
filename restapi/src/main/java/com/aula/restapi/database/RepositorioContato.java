package com.aula.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.restapi.entidade.Contato;

// precisa de interface e heranca do JpaRepository 
//pois a entidade tem tipo contato e Long
public interface RepositorioContato extends JpaRepository<Contato,Long> {
    
}
