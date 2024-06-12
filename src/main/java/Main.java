//	8. Napisz program, który konwertuje kwotę z PLN na EUR i odwrotnie:
// - Program powinien wczytać kwotę w PLN lub EUR wprowadzoną przez użytkownika.
// - Przeliczyć kwotę z PLN na EUR lub z EUR na PLN (przyjmując stały kurs wymiany).
// - Wyświetlić wynik.
// 1pln=0,23eur
// 1eur=4,34pln
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double kwota=0;
    int wybur;
    double wynik=0;
    
    System.out.println("1-pln na eur, 2-eur na pln");
    wybur=new Scanner(System.in).nextInt();
    switch(wybur)
      {
        case 1:
          {
            System.out.println("Podaj kwote w PLN");
            kwota=new Scanner(System.in).nextInt();
            wynik=kwota * 0.23;
            System.out.println(wynik);
            break;
          }
        case 2:
          {
            System.out.println("Podaj kwote w EUR");
            kwota=new Scanner(System.in).nextInt();
            wynik=kwota * 4.34;
            System.out.println(wynik);
            break;
          }
      }
  }
}
  