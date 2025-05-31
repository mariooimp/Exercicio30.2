package principal;

import model.Funcionario;
import model.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Principal {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        f1.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionario: "));
        f1.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a id do Funcionario: ")));
        
        JOptionPane.showMessageDialog(null, "Nome do Funcionario: " + f1.getNome());
        JOptionPane.showMessageDialog(null, "ID do funcionario: " + f1.getId());
        
    }
}
