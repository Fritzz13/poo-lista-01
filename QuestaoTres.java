import java.util.Scanner;

public class QuestaoTres {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i;
		IO.print("Informe um número inteiro positivo: ");
		n = scanner.nextInt();
		
		for (i = 2; i <= n; i++) {
		    if ( isPrimo(i) ) { IO.print(i + " "); }
		}
		IO.println();
	}
	
	public static boolean isPrimo(int numero) {
	    int i;
	    double raiz = Math.sqrt(numero);
	    
	    for (i = 2; i <= raiz; i++) {
	        if ( numero % i == 0 ) { return false; }
	    }
	    return true;
	}
	
}
