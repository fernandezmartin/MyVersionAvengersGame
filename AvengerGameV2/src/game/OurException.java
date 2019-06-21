package game;

public class OurException  extends Exception{
	public OurException() {
		super();
	}
	
	public OurException(String mensaje) {
		super(mensaje);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Se ha producido un error";
	}
}
