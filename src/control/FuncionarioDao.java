/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Cossa
 */
public class FuncionarioDao {

   

   

    
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
    public Funcionario salvar(Funcionario obj){
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
    public Object actualizar(int id,Funcionario obj){
        try{  
          Session sessao  =HibernateUtil.getSessionFactory().openSession();
             Funcionario f = (Funcionario)  sessao.get(Funcionario.class,id);
             sessao.beginTransaction();
               f.setNome(obj.getNome());
               f.setApelido(obj.getApelido());
               f.setCategoria(obj.getCategoria());
               f.setNacionalidade(obj.getNacionalidade());
            // criaSessao().getTransaction().begin();
             sessao.saveOrUpdate(f);
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

    
     public void removerFuncionario(int codigo){

      Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
      Funcionario funcionario = (Funcionario) sessao.get(Funcionario.class, codigo);
     // sessao.getTransaction();
      sessao.delete(funcionario);
      sessao.getTransaction().commit();
      sessao.close();
  }
    
    
     /**
     *  Busca todos funcionarios na base de dados
     *
     * @return lista dos funcionarios encontrados ou uma lista vazia, caso nao encontre
     * 
     */
    public List<Funcionario> findAll(){
        return criaSessao().createCriteria(Funcionario.class).list();
    }

      /**
     *  Busca um funcionario dado seu codigo na base de dados
     *
     * @param codigo
     * @return objecto Funcionario caso exista se nao retorna null
     * 
     * codigo - e um atributo do funcionario que é chave primaria
     */
    public Funcionario buscaPorId(long codigo) {
        return (Funcionario) criaSessao().createCriteria(Funcionario.class)
                .add(Restrictions.eq("codigo", codigo)).uniqueResult();
    }
    
}
