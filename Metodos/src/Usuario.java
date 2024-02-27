public class Usuario {
    public static void main(String[] args) throws Exception {
        Televisao televisao = new Televisao();
        televisao.dimiuirVolume();
        televisao.dimiuirVolume();
        televisao.dimiuirVolume();
        televisao.aumentarVolume();
        televisao.mudarCanal(13);
        televisao.ligar();

        System.out.println("Tv Ligada? " + televisao.ligado);
        System.out.println("Canal atual? " + televisao.canal);
        System.out.println("Volume atual? " + televisao.volume);
    }
}
