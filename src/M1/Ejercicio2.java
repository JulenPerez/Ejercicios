package M1;

import java.util.*;
import javax.swing.*;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		//NIVELL 1
			//FASE 1
		/* char [] miArray = {'J','U','L','E','N'};

	        for(int i=0;i<miArray.length;i++) {

	            System.out.print(miArray[i]);*/
	             
	            
		//FASE 2
		/*List<Character> llista = new ArrayList<Character>();
		
		llista.add('J');
		llista.add('u');
		llista.add('l');
		llista.add('e');
		llista.add('n');
		
		for(int i = 0;i<llista.size();i++) {
			Character car = llista.get(i);
			char carl = Character.toLowerCase(car);
			boolean check1 = Character.isDigit(car);
			if(check1 == true) {
				System.out.println("Es un número");
			}else if(carl=='a' ||carl =='e'|| carl =='i' || carl =='o' || carl =='u') {
				System.out.println(car + " Vocal");
			}else {
				System.out.println(car + " Consonant ");
			}
		}*/
		//FASE 3
		
		/*HashMap<Character, Integer> nom = new HashMap<Character, Integer>();
		
		char [] miArray = {'J','U','L','E','N','P','E','R','E','Z'};

        for(int i=0;i<miArray.length;i++) {

            if(nom.containsKey(miArray[i])) {
            	
            	nom.put(miArray[i], nom.get(miArray[i]) + 1);
            }else {
            	nom.put(miArray[i], 1);
            }
        }
        System.out.println(nom);
		*/
		//FASE 4
		
		/*List<Character> Apellido = new ArrayList<Character>();
		
		List<Character> Nombre = new ArrayList<Character>();
		
		Nombre.add('J');
		Nombre.add('U');
		Nombre.add('L');
		Nombre.add('E');
		Nombre.add('N');
		Nombre.add(' ');
		
		Apellido.add('P');
		Apellido.add('E');
		Apellido.add('R');
		Apellido.add('E');
		Apellido.add('Z');
		
		List<Character> fullName = new ArrayList<Character>();
		
		fullName.addAll(Nombre);
		fullName.addAll(Apellido);
		
		System.out.print(fullName);*/
		//EJERCICIO 2
		/*String mail = JOptionPane.showInputDialog("Introduce un numero");
		
		int email = Integer.parseInt(mail);
		
		for (int i = 0; i < email; i++) {
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");

			}
			System.out.println(" ");
		}*/
		//NIVELL 2
		/*String texto=JOptionPane.showInputDialog("Escribe una altura");
        int altura=Integer.parseInt(texto);
        dibujaEscaleraNumeros(altura);
    }   
 
    public static void dibujaEscaleraNumeros (int altura){
        for (int numero=1;numero<=altura;numero++){
            //Este bucle muestra los numeros en cada fila
            for(int i=1;i<=numero;i++){
                System.out.print(i);
            }
            //Saltamos de linea
            System.out.println("");
        }*/
		//FASE 2
		/*String texto=JOptionPane.showInputDialog("Introduce una altura");
        int altura=Integer.parseInt(texto);
        piramideInvertida(altura);
    }   
 
    public static void piramideInvertida(int altura){
        for (int numeroespacios=0, numeroasteriscos=(altura*2)-1; numeroasteriscos>0;numeroespacios++, numeroasteriscos-=2){
 
            for (int i=0; i<numeroespacios;i++){
                System.out.print(" ");
            }
 
            for (int j=numeroasteriscos; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }*/
		//NIVELL 3
		int seg=0;
		int min = 0;
		int resto_hora;
		while(true) {
			Thread.sleep(1000);
			seg++;
			resto_hora = seg%3600;
			System.out.println((seg/3600)+":"+(resto_hora/60)+":"+(resto_hora%60));
		}
}
}