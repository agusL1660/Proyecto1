public class Persona {
	private String nombre;
	private String apellido;
	private Automovil auto;
	
	public Persona(String nombre,String apellido, Automovil auto) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.auto=auto;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String nombre) {
		this.apellido = apellido;
	}
	public String getAuto() {
		return this.auto;
	}
	
	public void setAuto(Automovil auto) {
		this.auto = auto;
	} 

}