/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.percistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_cm
 */
public class JanelaFuncionario {
    
      public void menuFuncionario(List<Funcionario> funcionarios) {
            int opcao = 0;
            do {
                opcao = Integer.parseInt
                        (JOptionPane.showInputDialog
                        ("Funcionario\n"
                        +"Informe a opção desejada:"
                        + "\n1 - inserir"
                        + "\n2 - Excluir"
                        + "\n3 - Alterar"
                        + "\n4 - Buscar"
                        + "\n5 - Listar"
                        + "\n6 - Sair"));
                switch (opcao){
                    case 1:
                        adicionaFuncionario(funcionarios);
                        break;
                    case 2:
                        break;
                    
                   case 3:            
                       break; 
                   
                   case 4:            
                       break; 
                        
                   case 5:   
                       listaFuncionarios(funcionarios);
                       break;   
                   default:
                       JOptionPane.showMessageDialog(null,
                               "Você digitou uma opçao incorreta");
                }
            }while (opcao !=6);
            
        }
       
      void adicionaFuncionario(List<Funcionario> funcionarios){
          Funcionario f = new Funcionario();
          f.setNome(JOptionPane.showInputDialog
                  ("Informe o nome do Funcionario: "));
          f.setDataNascimento(JOptionPane.showInputDialog
                  ("Informe a data de nascimento do"
                  + "funcionario: "));
          f.setRg(JOptionPane.showInputDialog
                  ("Informe o rg do Funcionario: "));
          f.setCpf(JOptionPane.showInputDialog
                  ("Informe o cpf do Funcionario: "));
          f.setEndereco(JOptionPane.showInputDialog
                  ("Informe o endereço do Funcionario: "));
          f.setTelefone(JOptionPane.showInputDialog
                  ("Informe o telefone do Funcionario: "));
          f.setDataCadastro(JOptionPane.showInputDialog
                  ("Informe a data de cadastro do Funcionario: "));
          f.setSalario(Double.parseDouble(
                  JOptionPane.showInputDialog
                  ("Informe o salário do Funcionario")));
          f.setDataAdmissao(JOptionPane.showInputDialog
                  ("Informe a data de admissao do Funcionario: "));
          f.setCtps(JOptionPane.showInputDialog
                  ("Informe o ctps do Funcionario: "));
          f.setCargo(JOptionPane.showInputDialog
                  ("Informe o nome do Funcionario: "));
         
 
          FuncionarioDAO dao = new FuncionarioDAO();
          dao.adicionar(f, funcionarios);
      }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    
    }
   
}
    

