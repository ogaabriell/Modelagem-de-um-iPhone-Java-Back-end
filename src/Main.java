public class Main {
    public static void main(String[] args) {
        // Create instances of the components
         MusicPlayer musicPlayer = new MusicPlayer(); 
         Telephone telephone = new Telephone();
        InternetBrowser internetBrowser = new InternetBrowser();

        // Demonstrate MusicPlayer functionalities
        musicPlayer.selecionarMusica("Song A");
        musicPlayer.tocar();
        musicPlayer.pausar();

        // Demonstrate Telephone functionalities
        telephone.ligar("123-456-7890");
        telephone.atender();
        telephone.iniciarCorreioVoz();

        // Demonstrate InternetBrowser functionalities
        internetBrowser.exibirPagina("https://www.google.com");
        internetBrowser.adicionarNovaAba();
        internetBrowser.atualizarPagina();

        System.out.println("Meu iPhone");
    }
}