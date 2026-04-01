import java.util.Scanner;

public class Selecoes {

    Scanner scanner = new Scanner(System.in);

    public int nextInt(){
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public String nextLine(){
        return scanner.nextLine();
    }

    public double nextDouble(){
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
    
    //para que o usuário possa ver as mensagem sem que o menu, por exemplo, apareça logo depois
    public void apertarParaContinuar(){
        System.out.println("Aperte qualquer tecla para continuar!");
        scanner.nextLine();
    }

}