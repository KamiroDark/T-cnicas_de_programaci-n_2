package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Array;
import co.edu.konradlorenz.view.Vista;

public class Control {
	
	protected Vista objVista = new Vista();
	protected Array objArray = new Array();
	
	public void run() {
		int aux = objVista.pedirTamaño("Ingrese el tamaño del Array");
		
		objArray.crearArray(aux);
	}
}
