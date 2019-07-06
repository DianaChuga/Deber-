public class Animales{
	private String Nombre;
	private String Especie;
	private int Edad;
	
	public Animales(String Nombre, String Especie,int Edad){
		this.Nombre=Nombre;
		this.Especie=Especie;
		this.Edad=Edad;
	}
	public void setNombre(String Nombre){
		Nombre=Nombre;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setEspecie(String Especie){
		Especie=Especie;
	}
	public String getEspecie(){
		return Especie;
	}
	public void setEdad(String Edad){
		Edad=Edad;
	}
	public int getEdad(){
		return Edad;
	}
	public void ImprimirDatos(){
	System.out.println(getNombre());
	System.out.println(getEspecie());
	System.out.println(getEdad());
	
	}
}