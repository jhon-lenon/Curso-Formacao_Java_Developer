package Java_e_Tratamento_de_Excecoes.Estruturas_Excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("somente caracteres numericos sem espaço e ponto al inves de virgula");
        }
    }    
}