package javarevisao;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe seu nome:");
		
		Scanner scan = new Scanner(System.in);
		
		String usuario = scan.next();
		
		System.out.println("Olá Mundo! Meu nome é " + usuario + "!");
		
		
	}

}
