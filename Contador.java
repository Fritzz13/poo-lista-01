import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int contador = sc.nextInt();
    int contador = 0;
    while (contador <= 5) {
      System.out.println("Contador: " + contador);
      contador++;
    }
  }
}
