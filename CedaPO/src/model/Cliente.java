package model;
// Generated Oct 10, 2017 10:03:24 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,catalog="cedascasas"
)
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String nome;
     private String apelido;
     private String genero;
     private String nacionalidade;
     private String residencia;
     private String tipoDecumentoIdent;
     private String nomero;
     private Date validade;
     private String contacto;
     private String contactoEmerg;
     

    public Cliente() {
    }

	
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente(int idCliente, String nome, String apelido, String genero, String nacionalidade, String residencia, String tipoDecumentoIdent, String nomero, Date validade, String contacto, String contactoEmerg) {
       this.idCliente = idCliente;
       this.nome = nome;
       this.apelido = apelido;
       this.genero = genero;
       this.nacionalidade = nacionalidade;
       this.residencia = residencia;
       this.tipoDecumentoIdent = tipoDecumentoIdent;
       this.nomero = nomero;
       this.validade = validade;
       this.contacto = contacto;
       this.contactoEmerg = contactoEmerg;
       
    }
   
     @Id 

    
    @Column(name="idCliente", unique=true, nullable=false)
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="apelido", length=45)
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    
    @Column(name="genero", length=45)
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    @Column(name="nacionalidade", length=45)
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    @Column(name="residencia", length=45)
    public String getResidencia() {
        return this.residencia;
    }
    
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    
    @Column(name="tipoDecumentoIdent", length=45)
    public String getTipoDecumentoIdent() {
        return this.tipoDecumentoIdent;
    }
    
    public void setTipoDecumentoIdent(String tipoDecumentoIdent) {
        this.tipoDecumentoIdent = tipoDecumentoIdent;
    }

    
    @Column(name="nomero", length=45)
    public String getNomero() {
        return this.nomero;
    }
    
    public void setNomero(String nomero) {
        this.nomero = nomero;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="validade", length=10)
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    
    @Column(name="contacto", length=45)
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    @Column(name="contactoEmerg", length=45)
    public String getContactoEmerg() {
        return this.contactoEmerg;
    }
    
    public void setContactoEmerg(String contactoEmerg) {
        this.contactoEmerg = contactoEmerg;
    }






}

