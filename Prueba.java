public class Prueba {
	
	public static void main (String[] args){
		Automovil a=new Automovil("Fiat","147");
		Persona p = new Persona("Lautaro","Martinez",a);

		a.setDueño(p);
		System.out.println("Nombre: "+p.getName()+" Apellido: "+p.getApellido()+ "Automovil: "+a.getMarca()+" "+a.getSerie());

	}
}