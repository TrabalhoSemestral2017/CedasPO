package model;
// Generated Oct 10, 2017 10:03:24 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Utilizador generated by hbm2java
 */
@Entity
@Table(name="utilizador")
public class Utilizador  implements java.io.Serializable {


     private int idutilizador;
    // private Funcionario funcionario;
     private String Categoria;
     private String username;
     private String password;
     private Date data;
     

    public Utilizador() {
    }

	
    public Utilizador(int idutilizador, Funcionario funcionario) {
        this.idutilizador = idutilizador;
       // this.funcionario = funcionario;
    }

    public Utilizador(int idutilizador,  String Categoria, String username, String password, Date data) {
        this.idutilizador = idutilizador;
      //  this.funcionario = funcionario;
        this.Categoria = Categoria;
        this.username = username;
        this.password = password;
        this.data = data;
    }

    

   
     @Id 
@GeneratedValue
    
    @Column(name="idutilizador", unique=true, nullable=false)
    public int getIdutilizador() {
        return this.idutilizador;
    }
    
    public void setIdutilizador(int idutilizador) {
        this.idutilizador = idutilizador;
    }

//@ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="funcionario_idfuncionario")
//    public Funcionario getFuncionario() {
//        return this.funcionario;
//    }
//    
//    public void setFuncionario(Funcionario funcionario) {
//        this.funcionario = funcionario;
//    }

    
    @Column(name="username", length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data", length=10)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }






}


