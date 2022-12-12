package Fundamentos_na_Plataforma_Java.Aprendendo_A_Sintax_Java.Metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.aumentarVolume();

        smartTv.aumentaCanal();
        smartTv.aumentaCanal();
        smartTv.diminuiCanal();
        smartTv.mudarCanal(11);
        

        System.out.println("tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
    
}
