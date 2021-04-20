package M1;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// FASE 1-2-3
		String ciudades;
		String ciudadesNumero;
		int ciudades1;
		//Fase 4
		StringBuilder sb = new StringBuilder(); 
		List<String> ciudadesList = new ArrayList<String>();
		//RECOGE VALOR POR PANTALLA
		ciudadesNumero = JOptionPane.showInputDialog("Introduce el numero de ciudades de las ciudades que quieras:");
		//CONVIERTE STRING -> INT
		ciudades1 = Integer.parseInt(ciudadesNumero);
		//BUCLE PARA RECOGER EL NOMBRE DE CADA CIUDAD
		for (int i = 0; i < ciudades1; i++) {
			ciudades = JOptionPane.showInputDialog("Introduce el nombre de las ciudades: ");
			ciudadesList.add(ciudades);
		}
		//Fase 4
		/*for(String str : ciudadesList) {
			sb.append(str);
			str = sb.reverse().toString();
			sb.setLength(0);
			System.out.print(str + ",");
		}*/
		//FASE 3
		//1ciudadesList.replaceAll(a -> a.replace("a", "4"));
		//FASE 2
		//Collections.sort(ciudadesList);
		//PRINTA POR CONSOLA
		System.out.print(ciudadesList);

	}
}
