package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class dtoADto {
public static ArrayList<dtoFruta> resultsetAdtoFruta(ResultSet resultadoConsulta){
		
		System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoCoche] Entrando en resultsetAdtoFruta");
		ArrayList<dtoFruta> listFrutas = new ArrayList<>();
		
		//Leemos el resultado de la consulta hasta que no queden filas
		try {
			while ( resultadoConsulta.next() ) {
				
				listFrutas.add(new dtoFruta(resultadoConsulta.getInt("id_fruta"),
						resultadoConsulta.getString("nombrefruta"),
						resultadoConsulta.getString("colorfruta")
						
						));
			}
			
			int i = listFrutas.size();
			System.out.println("[INFORMACIÓN-resultsetAdtoFruta-resultsetAdtoFruta] Número frutas: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listFrutas;
		
	}



public static ArrayList<dtoVerdura> resultsetAdtoVerdura(ResultSet resultadoConsulta){
	
	System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoVerdura] Entrando en resultsetAdtoVerdura");
	ArrayList<dtoVerdura> listVerduras = new ArrayList<>();
	
	//Leemos el resultado de la consulta hasta que no queden filas
	try {
		while ( resultadoConsulta.next() ) {
			
			listVerduras.add(new dtoVerdura(resultadoConsulta.getInt("id_verdura"),
					resultadoConsulta.getString("nombreverdura"),
					resultadoConsulta.getString("colorverdura")
					
					));
		}
		
		int i = listVerduras.size();
		System.out.println("[INFORMACIÓN-resultsetAdtoFruta-resultsetAdtoVerdura] Número verduras: "+i);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return listVerduras;
	
}


}
