package control;

import control.ConnectionFactory;
import model.Login;
import java.sql.*;

public class LoginDAO {

    private Connection conection;
    
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
