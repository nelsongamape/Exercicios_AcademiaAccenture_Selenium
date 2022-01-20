package javarevisao;

public class TratamentoExceptions {

	public static void main(String[] args) {
		
		int[] numeros = {1,3,5};
		
		try {
			System.out.println(numeros[3]);
		} catch (Exception e) {
			System.out.println("O argumento excede o tamanho do objeto. Verifique sua solicitação.");
			e.printStackTrace();
		}

	}

}
