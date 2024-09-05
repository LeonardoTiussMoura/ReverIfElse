import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    System.out.print("O número digitado foi: ");
    System.out.println(numero);
    if (numero > 0){
      System.out.println("");
      System.out.println("Positivo");
    }
      if (numero < 0){
      System.out.println("");
      System.out.println("Negativo");
    }
    if (numero == 0){
      System.out.println("");
      System.out.println("Não é negativo nem positivo");
    }
    

    sc.close();
  }
}