/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Residencia;
import model.Utilizador;
import model.Utilizador;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Cossa
 */
public class UsuariorDao {

    
    
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
    public Utilizador salvar(Utilizador obj){
        try{
             criaSessao().beginTransaction();
             criaSessao().save(obj);
             criaSessao().getTransaction().commit();
        return obj;
        
        }catch(Throwable ex){
          criaSessao().getTransaction().rollback(); 
         // Em caso da transacao correr mal, todas as operacoes sao canceladas
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
  public Object actualizar(int id,Utilizador obj){
        try{  
          Session sessao  =HibernateUtil.getSessionFactory().openSession();
//             Utilizador  r = (Residencia)  sessao.get(Residencia.class,id);
//             sessao.beginTransaction();
//             
//               r.setNome(obj.getNome());
//               r.setEstado(obj.getEstado());
//               r.setEstadoOucupado(obj.getEstadoOucupado());
//               r.setBloco(obj.getBloco());
//               r.setLocalizacao(obj.getLocalizacao());
//               r.setValorReabilitacaoMax(obj.getValorReabilitacaoMax());
//               r.setValorArendamento(obj.getValorArendamento());
//               r.setTipo(obj.getTipo());
//               
               
            // criaSessao().getTransaction().begin();
//             sessao.saveOrUpdate(r);
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

     public void removerUtilizador(int idUtilizador){

    Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
     Utilizador utilizador = (Utilizador) sessao.get(Utilizador.class, idUtilizador);
      sessao.getTransaction();
     sessao.delete(utilizador);
      sessao.getTransaction().commit();
      sessao.close();
  }
    
    
     /**
     *  Busca todos Utilizador na base de dados
     *
     * @return lista dos Utilizador encontrados ou uma lista vazia, caso nao encontre
     * 
     */
    public List<Utilizador> findAll(){
        return criaSessao().createCriteria(Utilizador.class).list();
    }

      /**
     *  Busca um Utilizado dado seu idUtilizador na base de dados
     *
     * @param idUtilizador
     * @return objecto Utilizador caso exista se nao retorna null
 
 idUtilizador - e um atributo do Utilizador que é chave primaria
     */
    public Utilizador buscaPorId(long idUtilizador) {
        return (Utilizador) criaSessao().createCriteria(Utilizador.class)
                .add(Restrictions.eq("idUtilizador", idUtilizador)).uniqueResult();
    }

   
    
   
    
}
