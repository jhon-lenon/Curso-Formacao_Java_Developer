package Fundamentos_na_Plataforma_Java.Aprendendo_A_Sintax_Java.Java_Anatomia_Das_Classes.Primeira_Semana;

public class BoletimEstudantil {

    public static void main(String[] args) {   
        int mediaFinal = 5;
        
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO"); 
        
    }
}