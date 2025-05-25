package com.campusdual.classroom;
import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {

		int index = Utils.integer("Introduzca la cantidad de posiciones que desea en el array: ");
		int[] arreglo = createAndInitializeArray(index);
		showInlineArray(arreglo);

	}

	public static int[] createAndInitializeArray(int index){

		int[] arreglo = new int[index];
		for (int i = 0; i < index; i++) {
			arreglo[i] = i+1;
		}

		return arreglo;
	}

	public static void showInlineArray(int[] arreglo){

		for (int j = 0; j < arreglo.length; j++) {
			System.out.print(arreglo[j]);
			if (j < arreglo.length - 1) {
				System.out.print(" ");
			}
		}


	}



}
