package revisao_prog2;

public class principal {
	public static void main(String args[]) {
//		int soma = 0;
//		float mult = 1;
//		
//		for(int i = 1; i <= 30; i++) {
//			if(i % 2 == 1) {
//				soma += i;
//			}
//			else {
//				mult *= i;
//			}
//		}
//		System.out.println("Soma dos ímpares = " + soma);
//		System.out.println("Multiplicação dos pares = " + mult);
		
		// int a = 2, b = 99, aux;
		// System.out.println("Antes");
		// System.out.println("a = " + a + " | b = " + b);
		
		
		// a = b - a;
		// System.out.println("no primeiro passo o a esta " + a + " e o b esta como " + b);
		// b = b - a;
		// System.out.println("no segundo passo o a esta " + a + " e o b esta como " + b);

		// a = b + a;
		// System.out.println("no terceito passo o a esta " + a + " e o b esta como " + b);

		// System.out.println("outro Depois");
		// System.out.println("a = " + a + " | b = " + b);
		
		
		// aux = a;
		// a = b;
		// b = aux;
		// System.out.println("Depois");
		// System.out.println("a = " + a + " | b = " + b);
		agenda agenda = new Agenda();
		agenda.addContato(new Contato("Reginaldo", "regicsf@ufpa.br"));
		agenda.addContato(new Contato("Luciana"), "luciana@ufpa.br");
		agenda.addContato(new Contato("Carlos", "carlos@ufpa.br"));

		
	}
}
