# Questões de POO
### Turma de ADS no IFSPB

---

## Questão 5:
O Scanner funciona ao 'olhar' a memória indicada a ele no momento de criação do objeto, dividir em *tokens* e ler o tipo de dado que ele procura nos *tokens*.
Primeiramente, quando um método do Scanner é chamado, ele 'olha' a memória dele e divide os *tokens* usando delimitadores, que por padrão são caracteres *whitespace* (\n, \t, entre outros). Então, o Scanner vai de *token* a *token*, em ordem sequencial, e tenta interpretar eles para o tipo de dado que foi pedido.
Como, por exemplo, *int* com o método nextInt, *double* com o nextDouble, *byte* com nextByte, entre outros. Porém, o Scanner só lê até o delimitador e não remove ele, então quando algum outro tipo chamar um método do Scanner, ele vai encontrar o delimitador e jogar uma exceção 'InputMismatchException'.
A única excessão (e também um 'workaround' pro problema acima) é o nextLine. O nextLine, ao invés de ler os *tokens*, procura um separador de linha e retorna tudo antes dele, descartando o separador de linha no processo. Isso faz com que o separador que estava entre os *tokens* seja descartado, e que a próxima chamada de algum método 'next' do Scanner não jogue uma excessão.

Exemplo:
```
import java.util.Scanner;

void main() {
  Scanner scanner = new Scanner(System.in);
  double a, b;
  
  IO.print("Informe A: ");
  a = scanner.nextDouble();
  IO.print("Informe B: ");
  b = scanner.nextDouble();  // vai dar InputMismatchException
  
  double c = Math.sqrt((a*a) + (b*b));
  
  IO.println("O terceiro lado é " + c);
}
```

O System.out.printf (abreviado aqui pra 'printf') é um dos comandos de saída, como System.out.print e System.out.println, com a diferença que ele pode receber certos especificadores para formatar os dados que ele recebe (por isso o f).
Tem especificadores para vários tipos primitivos, como %d para int, %f para float, %s para String, entre outros. Dentro dos próprios especificadores, você pode colocar modificadores para modificar como o dado é impresso para o usuário. Por exemplo, ao colocar '%05d' na string do printf, o inteiro vai aparecer formatado com no mínimo 5 dígitos, e se ele for menor que isso, os dígitos extras serão preenchidos por 0s à esquerda.

Exemplo:
```
import java.util.Scanner;

void main() {
  int raio = 10;
  float pi = 3.14159f;
  
  System.out.printf("%.2f * %03d^2 = %08.2f", pi, raio, (pi*raio*raio));
  // vai ser impresso "3,14 * 010^2 = 00314,16"
}
```

---

## Questão 6:

O programa tem 3 erros principais, e um que provavelmente nao e um erro mas eu nao sei porque que ta ali se nao e:

1. Na declaração do método main, está faltando o '[]' depois do "String" nos argumentos do método
2. Está faltando um ';' no final da linha com o 'System.out.println'
3. O *while* vai ficar rodando pra sempre, porque o contador nunca é incrementado
- o scanner e declarado mas nunca usado

O código com esses erros corrigidos poderia ficar assim:
```
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
```
(que tambem pode ser encontrado no Contador.java)
