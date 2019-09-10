/*
 * Autor: equipe A.S.S.
 * Projeto: Tributario
 * Data: 07/2016
 */
package cadastro;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexao implements Serializable {

    public Connection con = null;
    public PreparedStatement sttm;

    public void conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:db_dados.db");
            con.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
