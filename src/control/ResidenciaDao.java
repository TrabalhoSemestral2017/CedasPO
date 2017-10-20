/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.swing.JOptionPane;
import model.Residencia;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import view.Tela1Residencia;

/**
 *
 * @author Cossa
 */
public class ResidenciaDao {
  
    
     SessionFactory fact = HibernateUtil.getSessionFactory();
    Session sessao;
    
    /**
     *  Cria a sessao a partir do SessionFactory 
     * @return objecto so tipo sessao
     */
    private Session criaSessao() {
        if(sessao == null)
            sessao = fact.openSession();
        return sessao;
    }
    
    
    /**
     *  Salva um objecto na base de dados
     * @param obj
     * @return objecto o objecto gravado se correr tudo bem
     * caso contrario retorna null
     * obj - Um objecto qualquer que represente uma tabela na base de dados
     */
    public Residencia salvar(Residencia obj){
        try{
             criaSessao().beginTransaction();
             criaSessao().save(obj);
             criaSessao().getTransaction().commit();
        return obj;
        
        }catch(Throwable ex){
            criaSessao().getTransaction().rollback();  // Em caso da transacao correr mal, todas as operacoes sao canceladas
           JOptionPane.showMessageDialog(null, "Erro de insersao  \n"+ex);
        }
        return null;
    }
    
    /**
     *  Actualiza um objecto na base de dados
     * @param obj
     * @return objecto o objecto actualizado se correr tudo bem
     * caso contrario retorna null
     * obj - Um objecto qualquer que represente uma tabela na base de dados
     */
    public Object actualizar(int id,Residencia obj){
        try{  
          Session sessao  =HibernateUtil.getSessionFactory().openSession();
             Residencia  r = (Residencia)  sessao.get(Residencia.class,id);
             sessao.beginTransaction();
             
               r.setNome(obj.getNome());
               r.setEstado(obj.getEstado());
               r.setEstadoOucupado(obj.getEstadoOucupado());
               r.setBloco(obj.getBloco());
               r.setLocalizacao(obj.getLocalizacao());
               r.setValorReabilitacaoMax(obj.getValorReabilitacaoMax());
               r.setValorArendamento(obj.getValorArendamento());
               r.setTipo(obj.getTipo());
               
               
            // criaSessao().getTransaction().begin();
             sessao.saveOrUpdate(r);
              sessao.getTransaction().commit();
              sessao.close();
        return obj;
        
        }catch(Throwable ex){
              criaSessao().getTransaction().rollback();  // Em caso da transacao correr mal, todas as operacoes sao canceladas
        } finally {
           // criaSessao().close(); // Fecha a sessao no final das operacoes
        }
        return null;
    }
    
    
    /**
     *  Apaga um objecto na base de dados
     * @param obj
     * @return true se correr tudo bem
     * caso contrario retorna false
     * obj - Um objecto qualquer que represente uma tabela na base de dados
     */

    
     public void removerResidencia(int idResidencia){

    Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
     Residencia residencia = (Residencia) sessao.get(Residencia.class, idResidencia);
      sessao.getTransaction();
     sessao.delete(residencia);
      sessao.getTransaction().commit();
      sessao.close();
  }
    
    
     /**
     *  Busca todos Residencia na base de dados
     *
     * @return lista dos Residencia encontrados ou uma lista vazia, caso nao encontre
     * 
     */
    public List<Residencia> findAll(){
        return criaSessao().createCriteria(Residencia.class).list();
    }

    public void actualizar(Tela1Residencia re) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void salvar(Tela1Residencia re) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizar(Residencia residencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      /**
     *  Busca um Residencia dado seu idResidencia na base de dados
     *
     * @param idResidencia
     * @return objecto Residencia caso exista se nao retorna null
     * 
     * idResidencia - e um atributo do Residencia que é chave primaria
     */
   

   
}
