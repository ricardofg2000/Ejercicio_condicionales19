package unico;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
/* 
La tienda online BanderaDeEspaña.es vende banderas personalizadas 
de la máxima calidad y nos ha pedido hacer un configurador que calcule 
el precio según el alto y el ancho. El precio base de una bandera es de 
un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, 
el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de 
envío son 3.25 €. El IVA ya está incluido en todas las tarifas.

Ejemplo 1:

Introduzca la altura de la bandera en cm: 20
Ahora introduzca la anchura: 35
¿Quiere escudo bordado? (s/n): n
Gracias. Aquí tiene el desglose de su compra.
Bandera de 700 cm2: 7,00 €
Sin escudo: 0,00 €
Gastos de envío: 3,25 €
Total: 10,25 €
Ejemplo 2:

Introduzca la altura de la bandera en cm: 10
Ahora introduzca la anchura: 15
¿Quiere escudo bordado? (s/n): s
Gracias. Aquí tiene el desglose de su compra.
Bandera de 150 cm2: 1,50 €
Con escudo:2,50 €
Gastos de envío:3,25 €
Total:7,25 
*/
		
		Scanner leer = new Scanner(System.in);
		
		final double gastoEnvio = 3.25;
		int altura;
		int anchura;
		int superficie = 0;
		String respuesta;
		double precioBandera;
		double escudo = 0;
		String mensajeEscudo = null;
		double total;
		
		System.out.print("Introduzca la altura de la bandera en cm: ");
		altura = Integer.parseInt(leer.nextLine());
		System.out.print("Ahora introduzca la anchura: ");
		anchura = Integer.parseInt(leer.nextLine());
		System.out.print("¿Quiere escudo bordado? (s/n): ");
		respuesta = leer.nextLine();
		
		precioBandera = altura * anchura / 100.00;
		switch(respuesta) {
		case "s":escudo = 2.50; mensajeEscudo = "Con escudo:" + escudo; break;
		case "n":escudo = 0.00; mensajeEscudo = "Sin escudo:" + escudo; break;
		}
		total = precioBandera + escudo + gastoEnvio;
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de " + superficie + " cm2: " + precioBandera + " €");
		System.out.println(mensajeEscudo + " €");
		System.out.println("Gastos de envío:" + gastoEnvio + " €");
		System.out.println("Total: " + total + " €");
		
	}

}