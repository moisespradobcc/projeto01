package view;

import model.Login;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Funcionarios;

public class Executa {

    public static void main(String[] args) {

        Login lg = null;
        ArrayList<Login> usuarios = new ArrayList();
        
        String qt = JOptionPane.showInputDialog("Quantos usuários serão cadastrados ?");
        int qtd = Integer.parseInt(qt);

        for (int pos = 0; pos <= qtd; pos++) {
            String login_usuario = JOptionPane.showInputDialog("Insira o nome do usuário " + pos+ "?");
            String senha_usuario = JOptionPane.showInputDialog("Insira a senha do usuário " + pos+ "?");
            String perfil_usuario = JOptionPane.showInputDialog("Informe o perfil do usuário " + pos+ "?");

            lg = new Login(login_usuario, senha_usuario, perfil_usuario);
            usuarios.add(lg);
        }
            System.out.println("Usuários Cadastrados ");
        for (int i = 0; i <= qtd; i++) {
            System.out.println(usuarios.get(i));
        }

    }
}
