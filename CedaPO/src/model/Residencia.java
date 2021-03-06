package model;
// Generated Oct 10, 2017 10:03:24 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Residencia generated by hbm2java
 */
@Entity
@Table(name="residencia"
    ,catalog="cedascasas"
)
public class Residencia  implements java.io.Serializable {


     private int idResidencia;
     private String bloco;
     private Integer tipo;
     private String estado;
     private Double valorArendamento;
     private Double valorReabilitacaoMax;
     private String residenciacol;
     private Boolean estadoOucupado;
     

    public Residencia() {
    }

	
    public Residencia(int idResidencia) {
        this.idResidencia = idResidencia;
    }
    public Residencia(int idResidencia, String bloco, Integer tipo, String estado, Double valorArendamento, Double valorReabilitacaoMax, String residenciacol, Boolean estadoOucupado, Set aluguers) {
       this.idResidencia = idResidencia;
       this.bloco = bloco;
       this.tipo = tipo;
       this.estado = estado;
       this.valorArendamento = valorArendamento;
       this.valorReabilitacaoMax = valorReabilitacaoMax;
       this.residenciacol = residenciacol;
       this.estadoOucupado = estadoOucupado;
       
    }
   
     @Id 

    
    @Column(name="idResidencia", unique=true, nullable=false)
    public int getIdResidencia() {
        return this.idResidencia;
    }
    
    public void setIdResidencia(int idResidencia) {
        this.idResidencia = idResidencia;
    }

    
    @Column(name="bloco", length=45)
    public String getBloco() {
        return this.bloco;
    }
    
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    
    @Column(name="tipo")
    public Integer getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="estado", length=45)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="valorArendamento", precision=22, scale=0)
    public Double getValorArendamento() {
        return this.valorArendamento;
    }
    
    public void setValorArendamento(Double valorArendamento) {
        this.valorArendamento = valorArendamento;
    }

    
    @Column(name="valorReabilitacaoMax", precision=22, scale=0)
    public Double getValorReabilitacaoMax() {
        return this.valorReabilitacaoMax;
    }
    
    public void setValorReabilitacaoMax(Double valorReabilitacaoMax) {
        this.valorReabilitacaoMax = valorReabilitacaoMax;
    }

    
    @Column(name="Residenciacol", length=45)
    public String getResidenciacol() {
        return this.residenciacol;
    }
    
    public void setResidenciacol(String residenciacol) {
        this.residenciacol = residenciacol;
    }

    
    @Column(name="estadoOucupado")
    public Boolean getEstadoOucupado() {
        return this.estadoOucupado;
    }
    
    public void setEstadoOucupado(Boolean estadoOucupado) {
        this.estadoOucupado = estadoOucupado;
    }






}


