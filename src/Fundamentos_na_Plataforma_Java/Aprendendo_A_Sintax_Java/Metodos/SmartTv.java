package Fundamentos_na_Plataforma_Java.Aprendendo_A_Sintax_Java.Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar() {
        ligada = true; 
        System.out.println("SmartTv Ligada");
    }
    public void desligar() {
        ligada = false;
        System.out.println("SmartTv Desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Voulume: " + volume);
    }
    public void diminuiVolume() {
        volume--;
        System.out.println("Voulume: " + volume);
    }

    public void aumentaCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }
    public void diminuiCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
    
}
