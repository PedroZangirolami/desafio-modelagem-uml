import interfaces.Browser;
import interfaces.Ipod;
import interfaces.Phone;

public class Iphone implements Ipod, Phone, Browser{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pasada");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarChamadaVoz() {
        System.out.println("Iniciando chamada...");
    }
}