/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Cossa
 */
public class ClienteDao {
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
    public Cliente salvar(Cliente obj){
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
    public Object actualizar(int id,Cliente obj){
        try{  
          Session sessao  =HibernateUtil.getSessionFactory().openSession();
             Cliente f = (Cliente)  sessao.get(Cliente.class,id);
             sessao.beginTransaction();
             
            f.setNome(obj.getNome());
            f.setContacto(obj.getContacto());
            f.setContactoEmerg(obj.getContactoEmerg());
            f.setGenero(obj.getGenero());
            f.setDataNascimento(obj.getDataNascimento());
            f.setNumero(obj.getNumero());
            f.setResidencia(obj.getResidencia());
            f.setTipoDecumentoIdent(obj.getTipoDecumentoIdent());
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

    
     public void removerCliente(int codigo){

    Session  sessao=HibernateUtil.getSessionFactory().openSession();
      sessao.beginTransaction();
     Cliente cliente = (Cliente) sessao.get(Cliente.class, codigo);
      sessao.getTransaction();
     sessao.delete(cliente);
      sessao.getTransaction().commit();
      sessao.close();
  }
    
    
     /**
     *  Busca todos Cliente na base de dados
     *
     * @return lista dos Cliente encontrados ou uma lista vazia, caso nao encontre
     * 
     */
    public List<Cliente> findAll(){
        return criaSessao().createCriteria(Cliente.class).list();
    }

      /**
     *  Busca um Cliente dado seu codigo na base de dados
     *
     * @param codigo
     * @return objecto Cliente caso exista se nao retorna null
     * 
     * codigo - e um atributo do Cliente que é chave primaria
     */
    public Cliente buscaPorId(long codigo) {
        return (Cliente) criaSessao().createCriteria(Cliente.class)
                .add(Restrictions.eq("codigo", codigo)).uniqueResult();
    }
    
}
