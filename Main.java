package ValorDoBoi;

public class Main extends Animal{
    public static void main(String[] args)
    {
        Animal exDono = new Animal();
        Animal peso = new Animal();

        Animal.nomeAnimal = "Arthur";
        Animal.patas = 4;
        peso.setArroba(20);
        exDono.setExDono("Josè Roberto");

        System.out.println("O animal tem:" + " " + Animal.patas + " " + "Patas");
        System.out.println("O ex dono è:" + "  " + exDono.getExDono());
        System.out.println("O animal tem " + " " + peso.getArroba() + " " + "arrobas");

        // ^^^^^^^^^^^^^^ Acesso a Classe Animal.

        System.out.println("\n");

        Vaca linhagem = new Vaca();
        Vaca estadoDeSaude = new Vaca();


        Vaca.idade = 7;
        Vaca.nomeVaca = "Gosia";
        linhagem.setLinhagem("Nelore");
        estadoDeSaude.setEstadoDeSaude("BEM");

        System.out.println("A vaca se chama: " + Vaca.nomeVaca);
        System.out.println("A vaca tem: " + Vaca.idade + " anos de idade");
        System.out.println("Sua linhagem è: " + linhagem.getLinhagem());
        System.out.println("Seu estado de saude è: " + estadoDeSaude.getEstadoDeSaude());

        // ^^^^^^^^^^^^^^ Acesso a Classe Vaca.

        System.out.println("\n");


        Comprador nome = new Comprador();
        Comprador lanceDado = new Comprador();

        Comprador.nome = "Dinoslaw Bezerra";
        Comprador.morada = "Nowy Nart - Poland";
        lanceDado.setLanceDado(325.20);

        System.out.println("O comprador è: " + Comprador.nome);
        System.out.println("O comprador mora em: " + Comprador.morada);
        System.out.println("O lance do comprador foi de: " + lanceDado.getLanceDado() + " Eur");


    }
}