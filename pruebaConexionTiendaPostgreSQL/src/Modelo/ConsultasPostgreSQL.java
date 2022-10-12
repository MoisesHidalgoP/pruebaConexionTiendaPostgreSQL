package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConsultasPostgreSQL {
public static ArrayList<dtoFruta> selectAllFrutas(Connection conexionGenerada) {
	
	
	System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllCoches] Entra en selectCoches");
	Statement declaracionSQL = null;
	ResultSet resultadoConsulta = null;
	ArrayList<dtoFruta> listFrutas = new ArrayList<>();
	
	try {
		
		//Se abre una declaración
		declaracionSQL = conexionGenerada.createStatement();
		//Se define la consulta de la declaración y se ejecuta
		resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"Tienda\".\"frutas\"");
	    
		//Llamada a la conversión a dtoAlumno
		listFrutas = dtoADto.resultsetAdtoFruta(resultadoConsulta);
		int i = listFrutas.size();
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllFrutas] Número frutas: "+i);
		
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllFrutas] Cierre conexión, declaración y resultado");				
	    resultadoConsulta.close();
	    declaracionSQL.close();
	    //conexionGenerada.close();
		
	} catch (SQLException e) {
		
		System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		return listFrutas;
		
	}
	return listFrutas;
	
}
public static ArrayList<dtoVerdura> selectAllVerduras(Connection conexionGenerada) {
	
	
	System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllVerduras] Entra en selectVerduras");
	Statement declaracionSQL = null;
	ResultSet resultadoConsulta = null;
	ArrayList<dtoVerdura> listVerduras = new ArrayList<>();
	
	try {
		
		//Se abre una declaración
		declaracionSQL = conexionGenerada.createStatement();
		//Se define la consulta de la declaración y se ejecuta
		resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"Tienda\".\"verduras\"");
	    
		//Llamada a la conversión a dtoAlumno
		listVerduras = dtoADto.resultsetAdtoVerdura(resultadoConsulta);
		int i = listVerduras.size();
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllFrutas] Número verduras: "+i);
		
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllFrutas] Cierre conexión, declaración y resultado");				
	    resultadoConsulta.close();
	    declaracionSQL.close();
	    conexionGenerada.close();
		
	} catch (SQLException e) {
		
		System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		return listVerduras;
		
	}
	return listVerduras;
	
}
	
}
		

