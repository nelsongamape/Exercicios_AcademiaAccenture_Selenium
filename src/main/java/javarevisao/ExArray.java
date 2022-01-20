package javarevisao;

import java.util.ArrayList;
import java.util.List;

public class ExArray {
	
	public static void main(String[] args) {
		
		String nomes = "Adriano;Roberto;Paulo";
		
		String arrayNomes[] = nomes.split(";");
		
				
		List<String> nomesAlterados = new ArrayList<>();
		
		for (int i = 0; i < arrayNomes.length; i++) {
		
			nomesAlterados.add(arrayNomes[i].substring(0, arrayNomes[i].length()-1) + "a");
	
//		System.out.println(arrayNomes[i].substring(0,arrayNomes[i].length()-1)+ "a");
					
		}
		
		System.out.println(nomesAlterados.toString());
	}

}
