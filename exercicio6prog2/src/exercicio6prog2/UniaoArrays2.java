package exercicio6prog2;

public class UniaoArrays2 {
    
	public static int[] copyOf(int[] original, int newLength) {
        if (newLength == original.length) {
            return original.clone();
        }
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
    
    public static int[] uniao(int[] v1, int[] v2) {
        int[] vetoruniao = new int[v1.length + v2.length];
        int tamanho = 0;

        for (int elemento : v1) {
            if (!existeNoVetor(vetoruniao, tamanho, elemento)) {
                vetoruniao[tamanho++] = elemento;
            }
        }

        for (int elemento : v2) {
            if (!existeNoVetor(vetoruniao, tamanho, elemento)) {
                vetoruniao[tamanho++] = elemento;
            }
        }

        return copyOf(vetoruniao, tamanho);
    }
    
    private static boolean existeNoVetor(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v1 = {11, 13, 45, 7, 4};
        int[] v2 = {24, 4, 16, 81, 10, 12, 13, 45};

        int[] v3 = uniao(v1, v2);

        System.out.print("Resultado da união sem repetição: ");
        for (int elemento : v3) {
            System.out.print(elemento + " ");
        }
    }
}
