/////*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// *////
package teste;

import control.FuncionarioDao;
import java.util.Date;
import model.Funcionario;
import model.Residencia;
//import control.ResidenciaDao

/**
 *
 * @author Cossa
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario(2, "Felizardo12", "Cossa", "Moc", "Masc", "Gestor", "Tecn", new Date());
        FuncionarioDao fdao = new FuncionarioDao();
        fdao.salvar(func);

    }
}
