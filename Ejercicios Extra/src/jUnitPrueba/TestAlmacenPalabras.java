package jUnitPrueba;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestAlmacenPalabras {
	@Test
	public void testAlmacenPalabras() {
		AlmacenPalabras palabra =new AlmacenPalabras (2);
		
		assertTrue(palabra.add("Hola"));
		assertTrue(palabra.contains("Hola"));
		
		assertTrue(palabra.add("me llamo"));
		assertTrue(palabra.contains("me llamo"));
		
		assertFalse(palabra.add("Paula"));
		assertFalse(palabra.contains("Paula"));
		
	}

}
