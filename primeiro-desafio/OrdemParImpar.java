import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrdemParImpar {
  public static void main(String[] args) throws Exception {
    List<Integer> listaNumerosOrdem = new ArrayList<>();
    Set<Integer> listaNumerosPares = new TreeSet<>();
    Set<Integer> listaNumerosImpares = new TreeSet<>(Comparator.reverseOrder());

    try(Scanner scanner = new Scanner(System.in)) {
      int quantidadeValores = ValidarValoresEntrada.validarQuantidadeEntradas(scanner);
          
      for (int i = 0; i < quantidadeValores; i++) {

        int novoNumero = ValidarValoresEntrada.validarNumeroEntrada(scanner);
        if(novoNumero % 2 == 0){
          listaNumerosPares.add(novoNumero);
        } else {
          listaNumerosImpares.add(novoNumero);
        }
      }

      listaNumerosOrdem.addAll(listaNumerosPares);
      listaNumerosOrdem.addAll(listaNumerosImpares);
      
      System.out.println("----------------");
      System.out.println("Valores de saída");
      System.out.println("----------------");
      for (Integer numeros : listaNumerosOrdem) {
        System.out.println(numeros);
      }
      System.out.println("------------");
      System.out.println("Fim da lista");
      System.out.println("------------");
         
    } catch (Exception e) {
      System.out.println("Ocorreu um problema: " + e.getMessage());
    }
  }
}
