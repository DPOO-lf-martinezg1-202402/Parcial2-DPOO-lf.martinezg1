package presentacion;

import logica.Parcial;

public class Principal {
	private Parcial parcial;
	
	public Principal() {
		
		parcial = new Parcial();
		
		try {
			System.out.println(parcial.calcularRaices(1, 4, 4));
			System.out.println(parcial.calcularRaices(1, 0, -4));
			System.out.println(parcial.calcularRaices(4, 4, 4));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	

}
