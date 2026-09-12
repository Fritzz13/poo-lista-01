import java.util.Scanner;

public class QuestaoQuatro {
    
	public static void main(String[] args) {
	    final int qtdnumeros = 5;
	    
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[qtdnumeros];
		int i, j;
		for (i = 0; i < qtdnumeros; i++) {
		    System.out.printf("Informe o %do numero: ", (i+1));
		    numeros[i] = scanner.nextInt();
		    scanner.nextLine();
		}
		
		IO.println();
		for (i = 0; i < qtdnumeros; i++) {
		    for (j = 0; j < numeros[i]; j++) {
		        IO.print("*");
		    }
		    IO.println();
		}
	}
	
}
