package revisao_prog2;

public class exercicio5 {
	public static void main(String args[]) {
		int soma = 0;
		double mult = 1;
		
		for(int i = 1; i <= 5; i++) {
			if(i % 2 == 1) {
				soma += i;
			}
			else {
				mult *= i;
			}
		}
		System.out.println("Soma dos ímpares = " + soma);
		System.out.println("Multiplicação dos pares = " + mult);
	}
}
