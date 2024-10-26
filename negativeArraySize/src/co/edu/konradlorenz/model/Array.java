package co.edu.konradlorenz.model;

import java.util.Arrays;

public class Array {

	private int[] array;

	public Array(int[] array) {
		this.array = array;
	}

	public Array() {
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Array [array=" + Arrays.toString(array) + "]";
	}
	
	public void crearArray(int size) {
		array = new int[size]; 
	}
}
