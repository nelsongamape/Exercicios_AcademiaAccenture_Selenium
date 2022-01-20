package javarevisao;

public class TiposDeString {
	
	public static void main(String[] args) {
		
		String s1 = "Hello Java!";
		String s2 = "Java";
		String s3 = new String("Aqui String Nova");
		
		System.out.println(s1.length());
		
		System.out.println(s2.charAt(0));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.contains(s2));
				
		String telefone = "+55 81 9796-5580";
		
		String tel1 = telefone.replace("-","");
		
		String tel2 = tel1.replace("+","");
		
		String telefoneSomenteNumeros = tel2.trim();
		
		System.out.println(telefoneSomenteNumeros);
		
		System.out.println(tel2.trim());
	}
}