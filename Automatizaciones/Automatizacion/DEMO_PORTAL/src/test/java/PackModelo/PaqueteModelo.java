package PackModelo;

public class PaqueteModelo {

	private String descripcion;
	private String precio;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public String  toString()
	{
		return getDescripcion()+" "+getPrecio();
	}
	
	
	
	
}//Clase
