package model;

import java.util.ArrayList;
import java.util.List;

public class Login {

    String login_usuario;
    String senha_usuario;
    String perfil_usuario;
    
    
    public Login() {
    }

    public Login(String login_usuario, String senha_usuario, String perfil_usuario) {
        this.login_usuario = login_usuario;
        this.senha_usuario = senha_usuario;
        this.perfil_usuario = perfil_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getPerfil_usuario() {
        return perfil_usuario;
    }

    public void setPerfil_usuario(String perfil_usuario) {
        this.perfil_usuario = perfil_usuario;
    }

    @Override
    public String toString() {
        return "Login: " + login_usuario + " Senha: " + senha_usuario + " Perfil: " + perfil_usuario;
    }

}
