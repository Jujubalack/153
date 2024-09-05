import java.util.Scanner;

public class exer27 {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int dia;
    System.out.print("\nDigite o dia: ");
    dia = leia.nextInt();
    switch (dia) {
      case 1:
        System.out.print("Domingo");
        break;
      case 2:
        System.out.print("Segunda-feira");
        break;
      case 3:
        System.out.print("Terça-feira");
        break;
      case 4:
        System.out.print("Quarta-feira");
        break;
      case 5:
        System.out.print("Quinta-feira");
        break;
      case 6:
        System.out.print("Sexta-feira");
        break;
      case 7:
        System.out.print("Sábado");
        break;
      default:
        System.out.print("Dia inválido");
        break;
    }
  }
}