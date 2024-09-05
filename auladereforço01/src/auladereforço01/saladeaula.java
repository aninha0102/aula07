package auladereforço01;

public class saladeaula {
	int cadeiras;
	String materia;
	String diadasemana;
	
	public saladeaula(int cadeiras,String materia,String diadasemana) {
		
		this.cadeiras = cadeiras;
		this.materia = materia;
		this. diadasemana =  diadasemana;
		
		
	}

	public int getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(int cadeiras) {
		this.cadeiras = cadeiras;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getDiadasemana() {
		return diadasemana;
	}

	public void setDiadasemana(String diadasemana) {
		this.diadasemana = diadasemana;
	}
	
	
	
	
}
