package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import oracle.jdbc.pool.OracleDataSource;

/**
 * 
 * @author Vinicius Yuji Nishioka
 * Driver Java: JDBC (Java Database Connectivity)
 * Pacote de Bibliotecas: java.sql (biblioteca para acessar a BD)
 * Executa as instruções SQL (qualquer banco de dados relacional)
 * Classe DriverManager
 * 		- Interfaces (Driver, Connection, Statement, ResultSet)
 *
 */

public class GerenciadorClientes {
	
	// Exemplo utilizado mysql
	// private String url = "jdbc : mysql : //localhost:3306/teste";
	
	private String connString = "jdbc : oracle : thin : @oracle.fiap.com.br : 1521 : ORCL";
	private Connection conn;
	
	public GerenciadorClientes() throws Exception {
		
		OracleDataSource ods = new OracleDataSource();
		
		// configurar URL
		ods.setURL(connString);
		
		// configurar usuario
		ods.setUser(Dados.USER);
		
		// configurar senha
		ods.setPassword(Dados.PWD);
		
		// obtendo uma conexao com o SGBD
		conn = ods.getConnection();
	
	}
	
	public void inserir(Cliente c) throws Exception {
		
		String sql = "INSERT INTO clientes(nome, sobrenome)";
		
		// Criando Statement rsponsável por executar
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, c.getNome());
		ps.setString(2, c.getSobrenome());
		ps.executeQuery();
		
		conn.close();
		
	}
	
}
