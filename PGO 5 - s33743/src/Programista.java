import javax.swing.*;

public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika,
                       String imie,
                       String nazwisko,
                       double stawkaBazowa,
                       String glownyJezyk,
                       int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk() {
        return glownyJezyk;
    }

    public int getLiczbaRepozytoriow() {
        return liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa();
        if (glownyJezyk.equals("Java")) {
            koszt *= 1.5;
        }
        if (liczbaRepozytoriow > 4) {
            koszt *= 1.5;
        }
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " i jestem programistą";
    }

    public void wypiszTechnologie() {
        System.out.println("Znane technologie:" + glownyJezyk);
    }

    public String toString() {
        return "Programista{" +
                "idPracownika=" + pobierzIdPracownika() +
                ", imie=" + getImie() +
                ", nazwisko=" + getNazwisko() +
                ", stawkaBazowa=" + getStawkaBazowa() +
                ", glownyJezyk=" + getGlownyJezyk() +
                ", liczbaRepozytoriow=" + getLiczbaRepozytoriow() +
                '}';
    }
}
