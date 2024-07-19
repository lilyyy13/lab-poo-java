package lab04;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner();

        int numeroGerado = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;
        System.out.println("Tente adivinhar um numero de 1 e 100.");
        
        while (true){
            System.out.println("Digite um palpite");
            tentativa = scanner.nextInt();
            tentativas++;

            if(tentativa < numeroGerado); {
                System.out.println("O numero é maior ");
            } else if{ (tentativa > numeroGerado); 
                System.out.println("O numero é menor ");
            } else{
                System.out.println("Parabéns! você acertou o numero");
                System.out.println("número de tentativas" + tentativas);
                
                scanner.close();
            } 

        }

    }
}