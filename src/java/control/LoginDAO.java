package control;

import control.ConnectionFactory;
import model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoginDAO {

    private Connection conection;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    
    
    
    public LoginDAO() {
        this.conection = new ConnectionFactory().getConnection();
    }

    public void Logar(Login login) {
        String sql = "select from usuario(login_usuario,senha_usuario)";
        try {
            PreparedStatement stmt = conection.prepareCall(sql);
            
        } catch (Exception e) {
        }
    }
}
