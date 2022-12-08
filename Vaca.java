package ValorDoBoi;

public class Vaca extends Animal{

    public static int idade = 4;
    protected static String nomeVaca;
    private String linhagem = "Nelore";
    private String EstadoDeSaude;



    public String getEstadoDeSaude() {
        return EstadoDeSaude;
    }

    public void setEstadoDeSaude(String estadoDeSaude) {
        EstadoDeSaude = estadoDeSaude;
    }

    public String getLinhagem() {
        return linhagem;
    }

    public void setLinhagem(String linhagem) {
        this.linhagem = linhagem;
    }
}
