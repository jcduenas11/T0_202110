package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
	
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals(100,modelo.darTamano()); 
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp1();
		modelo.agregar("Prueba");
		assertEquals(1,modelo.darTamano());
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		modelo.agregar("Prueba");
		assertEquals(modelo.buscar("Prueba"),"Prueba");
		
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		modelo.eliminar("50");
		assertEquals(99,modelo.darTamano());
		
	}

}
