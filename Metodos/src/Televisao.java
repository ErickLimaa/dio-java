public class Televisao {
    boolean ligado = false;
    int canal = 1;
    int volume = 15;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume!");
    }

    public void dimiuirVolume(){
        volume--;
        System.out.println("Diminuindo volume!");
    }
    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
}