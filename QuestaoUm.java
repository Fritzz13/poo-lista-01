import java.util.Scanner;

public class QuestaoUm {
  
  public static void main(String[] args) {
    final int qtdnotas = 3;
    final int[] pesonotas = {1, 1, 2};
    
    Scanner scanner = new Scanner(System.in);
    String nome;
    float[] notas = new float[qtdnotas];
    int i;
    
    IO.print("Informe o seu nome: ");
    nome = scanner.nextLine();
    for (i = 0; i < qtdnotas; i++) {
      System.out.printf("Informe a %da nota: ", (i+1));
      notas[i] = scanner.nextFloat();
      scanner.nextLine();
    }
    
    float media = 0;
    int pesostotais = 0;
    for (i = 0; i < qtdnotas; i++) {
      media += notas[i] * pesonotas[i];
      pesostotais += pesonotas[i];
    }
    media = media / pesostotais;
    
    System.out.printf("\nA media foi %.2f\n", media);
    if (media >= 7) { System.out.printf("%s, voce esta aprovado.\n", nome); }
    else /* media < 7 */ { System.out.printf("%s, voce esta reprovado.\n", nome); }
  }
  
}
