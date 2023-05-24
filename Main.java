//-Napisz program, który zliczania liczbę słów w ciągu znaków.
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj ciąg znaków (oddzielone spacją):");
        String znaki = scan.nextLine();
int słowa = znaki.split(" ").length;
        System.out.println(słowa);
  }
}

