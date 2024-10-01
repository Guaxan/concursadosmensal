package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;

    // Construtor
    public ConexaoBanco() {
        this.servidor = "200.195.171.124";
        this.banco = "grupo02_zaininhadograu";
        this.usuario = "grupo02";
        this.senha = "Y4NFvVi62nD30d0d";
    }

    public Connection conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return this.conexao; // Retorna a conexão
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }
}
