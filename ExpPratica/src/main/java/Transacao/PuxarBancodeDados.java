package Transacao;

import java.sql.*;

public class PuxarBancodeDados {

	private final String Driver = "com.mysql.cj.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/teste_pratica_rev002";
	private final String usuario = "root";
	private final String senha = "Esqueci213";
	ResultSet tabela = null;
	
	public void getConexao() {

	try {
		Class.forName(Driver);
		Connection conectar = DriverManager.getConnection(url, usuario, senha);
		
		tabela = conectar.createStatement().executeQuery("select p.id,p.parecer,p.marca,d.tipo_defeito,t.nome_tecnico,e.aparelho,c.nome_cliente from parecer p" + "inner join defeito d on p.id_defeito = d.id"+"inner join tecnico t on p.id_tecnico = t.id" + "inner join equipamento e on p.id_equipamento = e.id"+"inner join cliente c on p.id_cliente = c.id");
		
		while(tabela.next()) {
			System.out.println("Identificador: " + tabela.getInt(1)+"Parecer: " + tabela.getString(2)+ "Marca: "+ tabela.getString(3)+ "Defeito: "+ tabela.getString(4)+ "Técnico: "+ tabela.getString(5) + "Aparelho: "+ tabela.getString(6)+ "Cliente: "+ tabela.getString(7));
		}
		
		tabela.close();
		conectar.close();
		
	} catch (ClassNotFoundException | SQLException ex) {
		System.out.println("Drive do Banco de Dados não localizado");
	}
	
	}
}