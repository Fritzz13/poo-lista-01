import java.util.Scanner;

public class QuestaoDois {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		IO.print("Informe um número: ");
		num = scanner.nextInt();
		
		boolean multiplo3 = num % 3 == 0;
		boolean multiplo5 = num % 5 == 0;
		
		if ( !(multiplo3 || multiplo5) ) { IO.println(num + " não é múltiplo de 3 nem de 5"); }
		else if ( multiplo3 && !(multiplo5) ) { IO.println(num + " é múltiplo de 3"); }
		else if ( !(multiplo3) && multiplo5 ) { IO.println(num + " é múltiplo de 5"); }
		else /* multiplo3 && multiplo5 */ { IO.println(num + " é múltiplo de ambos"); }
	}
	
}
