package Modelo;

public class dtoFruta {
	public dtoFruta(int id, String nomF, String colF) {
		
		id_fruta = id;
		nombrefruta = nomF;
		colorfruta = colF;
		
		
	}
	
	//Atributos	
	int id_fruta;
	String nombrefruta;
	String colorfruta; 
	
	public int getId_fruta() {
		return id_fruta;
	}
	public void setId_fruta(int id_fruta) {
		this.id_fruta = id_fruta;
	}
	public String getNombrefruta() {
		return nombrefruta;
	}
	public void setNombrefruta(String nombrefruta) {
		this.nombrefruta = nombrefruta;
	}
	public String getColorfruta() {
		return colorfruta;
	}
	public void setColorfruta(String colorfruta) {
		this.colorfruta = colorfruta;
	}

	

}
