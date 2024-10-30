package logica;

import java.util.ArrayList;

public class Parcial {
	//me garantizan que todos los que entran son enteros
	//me garantizan que a diferente de 0 porque si no no seria cuadratica, entonces, no debo verificar división por 0
	
	public ArrayList<Double> calcularRaices(int a, int b, int c) throws Exception{
		
		double discriminante = Math.pow(b, 2) - 4*a*c;
		
		if (discriminante >= 0) {
			double raiz1;
			double raiz2;
			ArrayList<Double> raices = new ArrayList<Double>(); //a diferente de 0 porque si no no seria cuadratica
			
			if (discriminante == 0) {
				raiz1 = ((-1)*b)/(2*a);
				raiz2 = raiz1;
			}
			else {
				raiz1 = ((-1)*b + Math.sqrt(discriminante))/(2*a);
				raiz2 = ((-1)*b - Math.sqrt(discriminante))/(2*a);
			}
			raices.add(raiz1);
			raices.add(raiz2);
			return raices;
		}
		
		else {
			throw new Exception("No existen raices reales");
		}
	}
	

}
