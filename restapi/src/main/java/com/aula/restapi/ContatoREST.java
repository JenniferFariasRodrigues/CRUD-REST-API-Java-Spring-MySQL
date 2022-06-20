package com.aula.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.restapi.database.RepositorioContato;
import com.aula.restapi.entidade.Contato;
import java.util.List;


//Mapeamento Rest API
//definir a api rest e linkar com as opercaoes basicas
@RestController
//vincular uma url. Definir caminho-contato.Ex.:localhost:8080/contato
@RequestMapping("/contato")
public class ContatoREST {
    @Autowired
    private RepositorioContato repositorio;

    //operacoes basicas-consultar,salvar,alterar e excluir

    //consulta vinculada ao protocolo GET.
    //Associar o metodo listar com o protocolo GET.
    //Quando o usuario acessa o caminho contato utilizando o protocolo GET
    //o Spring respondera essa requisicao,executando o return repositorio.findAll();
    //retornara a lista de contatos no formato objetos java,mas o formato padrao de troca 
    //O Spring faz a conversao do objeto JAva para o JSON
    @GetMapping
    // metodo  consultar. Busca todos os contatos do banco de dados
    public List<Contato>listar(){
        return repositorio.findAll();
    }


    //associado ao Post
    @PostMapping
    // metodo salvar
    //O PostMapping apresenta o formato JSON.
    //adicionar @RequestBody Contato contato
    //Spring converte de JSON para objeto Java
    public void salvar(@RequestBody Contato contato){
        repositorio.save((contato));
    }

    //O PutMapping apresenta o formato JSON.
    //adicionar @RequestBody Contato contato
    //Spring converte de JSON para objeto Java
    
    @PutMapping
    // metodo alterar
    public void alterar(@RequestBody Contato contato){
        //validacao-se existir o ID
        if(contato.getId()>0){
            //metodo save para salvar e alterar
        repositorio.save((contato));
        }
    }

    
    //O DeleteMpping apresenta o formato JSON.
    //adicionar @RequestBody Contato contato
    //Spring converte de JSON para objeto Java
    @DeleteMapping
    //metodo excluir
    public void excluir(@RequestBody  Contato contato){
        repositorio.delete(contato);

    }
}
