/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//import java.sql.Statement;
/**
 *
 * @author ricardo
 */
public class ConectaBanco {

    public Statement stm;// responsavel por preparar e realizar pesquisas no BD
    public ResultSet rs;// responsavel por armazenar o resultado de uma pesquisa passada p/ o statement
    private final String driver = "org.postgresql.Driver";// responsavel por identificar o serviço de BD
    private final String caminho = "jdbc:postgresql://localhost:5432/sistemabia";// responsavel por setar o local do BD
    private final String usuario = "postgres";// utlizado no banco
    private final String senha = "ali1705";// utilizado no banco
    public Connection conn;// responsavel por realizar a conexao com o BD

    public Connection conexao() {// metodo responsavel por realizar a conexao com o BD
        try {// tentativa inicial
            System.setProperty("jdbc.Drivers", driver);// seta a propriedade do driver de conexao
            conn = DriverManager.getConnection(caminho, usuario, senha);// realiza a conexao com o BD
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");// imprime uma caixa de msg
        } catch (SQLException ex) {// excecao
            JOptionPane.showMessageDialog(null, "Erro na conexão!\n Erro:" + ex.getMessage());
        }
        return null;
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro no ExecuteSQL!\n Erro: "+ ex.getMessage());
        }
    }

    public void desconecta() {//metodo para desconcectar do BD
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
