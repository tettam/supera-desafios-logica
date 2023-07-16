  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import java.util.Scanner;

  public class RelacaoNotasMoedas {
    private static final double LIMITE_VALOR_ENTRADA = 1000000.00;
    
    public static void main(String[] args) {
      double[] notas = {100,50,20,10,5,2};
      double[] moedas = {1,0.50,0.25,0.10,0.05,0.01};
      
      try(Scanner scanner = new Scanner(System.in)) {
        BigDecimal valorMonetario = BigDecimal.ZERO;
        boolean numeroValido = false;

        System.out.println("Digite o valor monetário");
        while(!numeroValido) {
          double valorEntrada = scanner.nextDouble();
          if(valorEntrada >= 0 && valorEntrada <= LIMITE_VALOR_ENTRADA) {
            valorMonetario = BigDecimal.valueOf(valorEntrada);
            numeroValido = true;
          } else {
            System.err.println("Valor fora da margem. Tente novamente");
          }
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
          int quantidade = valorMonetario.divide(new BigDecimal(notas[i]), 0, RoundingMode.DOWN).intValue();
          System.out.print(quantidade + " notas(s) de R$ ");
          System.out.printf("%.2f", notas[i]);
          System.out.println();
          valorMonetario = valorMonetario.remainder(new BigDecimal(notas[i]));
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
          int quantidade = valorMonetario.divide(new BigDecimal(moedas[i]), 0, RoundingMode.DOWN).intValue();
          System.out.print(quantidade + " moedas(s) de R$ ");
          System.out.printf("%.2f", moedas[i]);
          System.out.println();
          valorMonetario = valorMonetario.remainder(new BigDecimal(moedas[i]));
        }
        
      } catch (Exception e) {
        System.err.println("Por favor, use o ponto para separar as casas decimais");
      }
    }
  }
