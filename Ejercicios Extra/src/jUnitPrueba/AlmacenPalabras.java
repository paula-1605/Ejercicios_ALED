package jUnitPrueba;
import java.util.ArrayList;
import java.util.List;

public class AlmacenPalabras {
		
	private int capacidad;
	private List<String> listaPalabras = new ArrayList<String>();		
	
	public AlmacenPalabras(int capacidad) {
			this.capacidad = capacidad;
	}
		
	public boolean contains(String p) {
		if(listaPalabras.contains(p))
			return true;
		return false;
	}
		
	public boolean add(String p) {
		if(listaPalabras.size()<capacidad){
			listaPalabras.add(p);
		return true;
		}
	return false;
	
	}
}


