import java.util.Scanner;

public class SeEncontre{
  public static void main(String args[]) {
    //Quebrar linha no vscode para não misturar com a chamada do java.
    System.out.print("\n");
    
    String salaDesejada, salaInformada  ;
    
    salaDesejada = "A219";
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número da sala: ");
    salaInformada = scanner.next();
    
    if (salaDesejada.equals(salaInformada) ){
       System.out.println("Você esta no caminho certo.");
    } else { 
        System.out.println("Você está perdido(a), se encontre."); 
    }
    
    //sempre fechar scanner
    scanner.close();
  }
}