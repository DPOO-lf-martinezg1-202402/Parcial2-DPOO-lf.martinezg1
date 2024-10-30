package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest {
	private Parcial parcial;

	@BeforeEach
	void setUp() {
		this.parcial = new Parcial();
		
	}

	@Test
	void raicesIgualesTest() throws Exception {
		ArrayList<Double> res_iguales = new ArrayList<Double>();
		res_iguales.add(-2.0);
		res_iguales.add(-2.0);
		
		//caso en que discriminante es 0
		assertEquals(res_iguales, this.parcial.calcularRaices(1, 4, 4));
	}
	
	@Test
	void raicesDiferentesTest() throws Exception {
		ArrayList<Double> res_diferentes = new ArrayList<Double>();
		res_diferentes.add(2.0);
		res_diferentes.add(-2.0);
		
		//caso en que discriminante mayor a 0
		assertEquals(res_diferentes, this.parcial.calcularRaices(1, 0, -4));
	}
	
	@Test
	void raicesComplejasTest() throws Exception {
		
		//caso en que discriminante menor a 0
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(4, 4, 4));
	}

}
