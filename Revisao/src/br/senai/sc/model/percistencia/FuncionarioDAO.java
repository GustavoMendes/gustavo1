
package br.senai.sc.model.percistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/** 
 * Classe que guarda as informações aos funcionário
 * @version 1.0   31/07/2013
 * @author gustavo_cm
 */

public class FuncionarioDAO {
    
    
    //Vetor dinâmico para armazenar funcionários cadastros.
    
    
    
    
    
    //Método para adicionar um funcionário no vetor de funcionários.
    
    public void adicionar(Funcionario f,
            List<Funcionario> funcionario){
        funcionario.add(f);
 
JOptionPane.showMessageDialog(null, 
        "Funcionário" + " Adicionado Com Sucesso!");
   
    
    
    
    }
    
    /*
     * método que lista todos os funcionarios
     */
    public void listar(List<Funcionario> funcionarios){
        String msg = " ";
        for (Funcionario f : funcionarios) {
            msg = msg + "\nNome: " +f.getNome()
                    + "\nData de nascimento: " + f.getDataNascimento()
                    + "\nRg: " + f.getRg()
                    + "\nCpf " + f.getCpf()
                    + "\nEndereço: " + f.getEndereco()
                    + "\nTelefone: " + f.getTelefone()
                    + "\nData Cadastro: " + f.getDataCadastro()
                    + "\nSalário: " + f.getSalario()
                    + "\nData admissao: " + f.getDataAdmissao()
                    + "\nCtps: " + f.getCtps()
                    + "\nCargo: " + f.getCargo();
            
        }
        JOptionPane.showMessageDialog(null, msg);
        
    }
}