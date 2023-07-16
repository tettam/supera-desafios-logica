import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecifrarString {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      List<String> frases = new ArrayList<>();

      System.out.println("Quantidade de casos de teste");
      int n = scanner.nextInt();
      if(n <= 0){
        throw new IllegalArgumentException("Não é possível um valor menor ou igual a 0");
      }
      scanner.nextLine(); // limpar o buffer

      for (int i = 1; i <= n; i++) {
        System.out.println("Frase numero " + i);
        String frase = scanner.nextLine().toUpperCase();
        frases.add(frase);
      }

      System.out.println("--------------------");
      System.out.println("Saída de Informações");
      System.out.println("--------------------");

      for (int i = 0; i < frases.size(); i++) {
        int tamanhoString = frases.get(i).length();
        String stringLadoEsquerdo = frases.get(i).substring(0, (tamanhoString / 2));
        String stringLadoDireito = frases.get(i).substring(tamanhoString/2);   
        
        // inverter as metades da frase para decifrar
        String reverterFraseEsquerda = new StringBuilder(stringLadoEsquerdo).reverse().toString();
        String reverterFraseDireita = new StringBuilder(stringLadoDireito).reverse().toString();

        System.out.println(reverterFraseEsquerda + reverterFraseDireita);
      }

    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    } catch (Exception e) {
      System.err.println("Erro inexperado.Tente novamente");
    }
  }
}