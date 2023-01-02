public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atuzalizando a página");        
    }

    @Override
    public void ligar() {
        System.out.println("ligando");  
    }

    @Override
    public void atender() {
        System.out.println("Atendendo"); 
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inicializando o correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
