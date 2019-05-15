package Modelo;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String anio;
	
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAnio()=" + getAnio() + "]";
	}
	
}//clase
