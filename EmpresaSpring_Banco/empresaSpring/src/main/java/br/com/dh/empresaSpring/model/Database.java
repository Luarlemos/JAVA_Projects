package br.com.dh.empresaSpring.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private static Map<String, List<Object>> database = new HashMap<>();
	private static List<Object> clientes = new ArrayList<>();
	private static List<Object> funcionarios = new ArrayList<>();
	private static List<Object> pedidos = new ArrayList<>();
	
	public Database() {
		database.put("funcionarios", funcionarios);
		database.put("clientes", clientes);
		database.put("pedidos", pedidos);
	}
	
	public void save(String tabela, Object obj) {
		database.get(tabela).add(obj);
	}
	
	public List<Object> list(String tabela){
		return database.get(tabela);
	}
}
