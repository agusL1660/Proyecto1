public class Automovil {
	private String marca;
	private String serie;
	private Persona dueño;
	
	public Automovil(String marca,String serie) {
		this.marca = marca;
		this.serie=serie;
		dueño=null;
	}
	
	public String getMarca() {
		return this.marca;
	}
	

	public String getSerie() {
		return this.serie;
	}
	public Persona getDueño() {
		return this.dueño;
	}
	public void setDueño(Persona nombre) {
		this.dueño = nombre;
	}
	

}