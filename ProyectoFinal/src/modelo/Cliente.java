package modelo;

public class Cliente extends Persona{

	private String correo;
	private String tarjetaCredito;
	
	public Cliente(String correo, String tarjetaCredito) {
		super();
		this.correo = correo;
		this.tarjetaCredito = tarjetaCredito;
	}
	
	
}
