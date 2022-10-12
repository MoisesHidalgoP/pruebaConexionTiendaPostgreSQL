package Modelo;

public class dtoVerdura {
public dtoVerdura(int id, String nomV, String colV) {
		
		id_verdura = id;
		nombreverdura = nomV;
		colorverdura = colV;
		
		
	}
	
	//Atributos	
	int id_verdura;
	String nombreverdura;
	String colorverdura; 

	public int getId_verdura() {
		return id_verdura;
	}
	public void setId_verdura(int id_verdura) {
		this.id_verdura = id_verdura;
	}
	public String getNombreverdura() {
		return nombreverdura;
	}
	public void setNombreverdura(String nombreverdura) {
		this.nombreverdura = nombreverdura;
	}
	public String getColorverdura() {
		return colorverdura;
	}
	public void setColorverdura(String colorverdura) {
		this.colorverdura = colorverdura;
	}


}
