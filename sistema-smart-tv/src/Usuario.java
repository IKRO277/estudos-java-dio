public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A SmartTv está ligada ? "+ smartTv.ligada);
        System.out.println("qual o canal ? "+ smartTv.canal);
        System.out.println("qual o volume ? "+ smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status --> A SmartTv está ligada ? "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status --> A SmartTv está ligada ? "+ smartTv.ligada);

        smartTv.avançarCanal();
        System.out.println("Novo Status --> qual o canal ? "+ smartTv.canal);
        smartTv.retrocederCanal();
        System.out.println("Novo Status --> qual o canal ? "+ smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Novo Status --> qual o volume ? "+ smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo Status --> qual o volume ? "+ smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status --> qual o canal ? "+ smartTv.canal);
    }
}
