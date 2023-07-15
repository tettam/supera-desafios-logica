import java.util.Arrays;
import java.util.Scanner;

public class QuantidadeParesDiffAlvo {
  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {
  
      System.out.println("Digite o tamano do array e o valor do alvo, respectivamente. Separe por espaço.");
      int tamanhoArray = scanner.nextInt();
      int valorAlvo = scanner.nextInt();

      if(tamanhoArray < 0){
        throw new IllegalArgumentException("Não é possível um tamanho negativo. Tente novamente.");
      }
      
      System.out.println("Digite os " + tamanhoArray + " numero(s). Separe por espaço.");
      int[] numeros = new int[tamanhoArray];
      for (int i = 0; i < tamanhoArray; i++) {
        numeros[i] = scanner.nextInt();
      }

      Arrays.sort(numeros);

      int numDifIgualAlvo = 0;
      for (int i = 0; i < numeros.length; i++) {
        for(int y = i + 1; y < numeros.length; y++){
          if(valorAlvo == numeros[y] - numeros[i]){
            numDifIgualAlvo++;
            break;
          }
        }
      }
     
      System.out.println(numDifIgualAlvo);

    } catch(IllegalArgumentException e){
      System.err.println(e.getMessage());
    } catch (Exception e) {
      System.err.println("Ocorreu um problema. Tente novamente");
    }
  }
}
