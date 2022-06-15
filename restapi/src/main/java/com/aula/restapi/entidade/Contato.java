package com.aula.restapi.entidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//define que a classe COntato sera um entidade
//conforme as configuracoes do framework trial 
//cria automaticaemnte uma tabela no banco de dados que represente essa entidade
@Entity
public class Contato {
    //toda entidade precisa de um identificador. No cado o id
    //@ID do mesmo pacote para avisar o framework
    @Id
    //para gerar o valor do id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //regras de colunas.campo nao pode ser nulo
    //no banco de dados sera criado uma constratints conde
    //o campo nome,email e telefone sao obrigatorios
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String emal;
    private String urlAvatar;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmal() {
        return this.emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    public String getUrlAvatar() {
        return this.urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
    
}
