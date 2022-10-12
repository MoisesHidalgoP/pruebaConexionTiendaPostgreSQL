package Controlador;

import java.sql.Connection;
import java.util.ArrayList;

import Modelo.ConexionPostgreSQL;
import Modelo.ConsultasPostgreSQL;
import Modelo.ConsultasPostgreSQL;
import Modelo.dtoFruta;
import Modelo.dtoVerdura;
import Util.variablesConexionPostreSQL;

public class ControladorPostgreSQL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//CONSTANTES
				final String HOST = variablesConexionPostreSQL.getHost();
				final String PORT = variablesConexionPostreSQL.getPort();
				final String DB = variablesConexionPostreSQL.getDb();
				final String USER = variablesConexionPostreSQL.getUser();
				final String PASS = variablesConexionPostreSQL.getPass();
				
				ArrayList<dtoFruta> listFrutas = new ArrayList<>();
				ArrayList<dtoVerdura> listVerduras = new ArrayList<>();
			
				
				
				

				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
				ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
				Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
				
				if(conexionGenerada != null) {
					
					//Llamar al método que ejecuta la consulta
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada selectAllFrutas");
					listFrutas = ConsultasPostgreSQL.selectAllFrutas(conexionGenerada);
					int i = listFrutas.size();
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número frutas: "+i);
					for(Modelo.dtoFruta frutas: listFrutas) {
						System.out.println(frutas.getId_fruta()+" "+frutas.getNombrefruta()+" "+frutas.getColorfruta());			}
					}
				
                if(conexionGenerada != null) {
					
					//Llamar al método que ejecuta la consulta
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada selectAllVerduras");
					listVerduras = ConsultasPostgreSQL.selectAllVerduras(conexionGenerada);
					int i = listVerduras.size();
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número verduras: "+i);
					for(Modelo.dtoVerdura verduras: listVerduras) {
						System.out.println(verduras.getId_verdura()+" "+verduras.getNombreverdura()+" "+verduras.getColorverdura());			}
					}
				
				
				
}
	
}
