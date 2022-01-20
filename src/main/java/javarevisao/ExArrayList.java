package javarevisao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExArrayList {

	public static void main(String[] args) {

		ArrayList<String> nomesAcademia = new ArrayList<>();

		nomesAcademia.add("Nelson");
		nomesAcademia.add("Laura");
		nomesAcademia.add("Anderson");
		nomesAcademia.add("João");

		
		for (int i = 0; i < nomesAcademia.size(); i++) {
			
			System.out.println("Nome do participante:" + nomesAcademia.get(i) + "Qtde de letras: " + nomesAcademia.get(i).length());
			
		}
		
		nomesAcademia.remove(2);

		System.out.println(nomesAcademia.get(0));
		System.out.println(nomesAcademia.get(nomesAcademia.size() - 1));

		int[] numeros02 = { 2, 3, 4, 5, 6, 7, 8, 10, 12, 13, 14, 15, 16, 18, 19, 23, 24, 25 };
		boolean achouNumero = false;
		for (int i = 0; i <numeros02.length; i++) {
			if (numeros02[i]==10) {
				System.out.println("Achou o número 10");
				achouNumero = true;				
				break;
			}
			System.out.println("Não achou o número");
			
		}
	
		String promocao = "Plano TV 4K Combo";
		
		if (promocao.contains("TV") && promocao.contains("Combo")) {
				System.out.println("Promoção Encontrada");			
		} else {
			System.out.println("Promoção não encontrada :(");
		}
		
		
	}	
}
