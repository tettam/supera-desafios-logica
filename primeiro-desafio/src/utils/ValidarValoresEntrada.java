package utils;

import java.util.Scanner;

public class ValidarValoresEntrada {
  
  public static int validarQuantidadeEntradas(Scanner scanner){
    boolean entradaValida = false;
    int entradasNecessarias = 0; 

    while (!entradaValida) {
      entradasNecessarias = scanner.nextInt();
      
      if(entradasNecessarias > 1 && entradasNecessarias <= 10){    
        entradaValida = true;
      } else {
        System.err.println("Campo inválido. O valor deve ser maior que 1 e menor ou igual a 10");
      }  
    }
    return entradasNecessarias; 
  }

  public static int validarNumeroEntrada(Scanner scanner){
    boolean entradaValida = false;
    int numeroValido = 0; 

    while(!entradaValida) {
      numeroValido = scanner.nextInt();

      if(numeroValido >= 0){
        entradaValida = true;
      } else {
        System.err.println("Valores devem ser a partir de 0");
      }
    }
    return numeroValido;
  }
}
