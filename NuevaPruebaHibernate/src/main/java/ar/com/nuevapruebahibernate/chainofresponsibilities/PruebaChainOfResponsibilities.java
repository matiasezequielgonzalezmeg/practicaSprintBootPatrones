package ar.com.nuevapruebahibernate.chainofresponsibilities;

import java.util.Scanner;

import ar.com.nuevapruebahibernate.chainofresponsibilities.model.CadenaPagoATM;
import ar.com.nuevapruebahibernate.chainofresponsibilities.model.Moneda;

public class PruebaChainOfResponsibilities {
	
	public static void main(String[] args) {
		CadenaPagoATM atmDispenser = new CadenaPagoATM();
		while (true) {
			int amount = 0;
			System.out.println("Ingrese el monto a entregar");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("El monto debe ser multiplo de diez.");				
			}else {
				// process the request
				atmDispenser.c1.dispensar(new Moneda(amount));
			}			
		}
	}
}
