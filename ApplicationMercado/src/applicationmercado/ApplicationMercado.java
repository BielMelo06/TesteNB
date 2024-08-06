package applicationmercado;
import java.util.Scanner;
public class ApplicationMercado {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    String nome = ler.nextLine();
    System.out.println("Informe quantas unidades de 600ml de refrigerante você comprou: ");
    int unidade = ler.nextInt();
    double total;
    if (unidade >= 6){
        total = unidade * 4.19;
        System.out.printf("O valor total deu: %.2f reais", total);
    }
    else{
     total = unidade * 4.99;
     System.out.printf("O valor total deu: %.2f reais", total);
    }
    ler.close();
    }
    
}
