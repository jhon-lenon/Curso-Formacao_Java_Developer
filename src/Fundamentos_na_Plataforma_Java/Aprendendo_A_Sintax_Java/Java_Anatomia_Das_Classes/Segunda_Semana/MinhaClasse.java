package Fundamentos_na_Plataforma_Java.Aprendendo_A_Sintax_Java.Java_Anatomia_Das_Classes.Segunda_Semana;

public class MinhaClasse {
           
    public static void main(String[] args) {
        String primeiroNome = "Jhon";
        String segundoNome = "Lenon";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);   
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
