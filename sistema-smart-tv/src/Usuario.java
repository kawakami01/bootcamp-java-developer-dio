public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Estado Tv: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);
        
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
    }
}
