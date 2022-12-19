package baralho;

public class Carta {
    private String rank;
    private String naipe;

    public Carta(String rank, String naipe) {
        this.rank = rank;
        this.naipe = naipe;
    }

    public String toString() {
        return String.format("%s de %s", rank, naipe);
    }
}
