public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika,
                  String imie,
                  String nazwisko,
                  double stawkaBazowa,
                  boolean czyAutomatyzujacy,
                  int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean getCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa();
        if (czyAutomatyzujacy == true) {
            koszt += 100;
        }
        if (liczbaScenariuszy > 15) {
            koszt += 100;
        }
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " i jestem testerem";
    }

    public void uruchomRaportTestow() {
        String zautomatyzowanyStr;

        if (czyAutomatyzujacy == true) {
            zautomatyzowanyStr = "zautomatyzowany";
        }
        else {
            zautomatyzowanyStr = "niezautomatyzowany";
        }
        System.out.println("Pracownik " + pobierzIdPracownika() + ": " +
                getLiczbaScenariuszy() +
                " scenariuszy, " + zautomatyzowanyStr
        );
    }

    @Override
    public String toString() {
        return "Tester{" +
                "idPracownika=" + pobierzIdPracownika() +
                ", imie=" + getImie() +
                ", nazwisko=" + getNazwisko() +
                ", stawkaBazowa=" + getStawkaBazowa() +
                ", liczbaScenariuszy=" + getLiczbaScenariuszy() +
                ", czyAutomatyzujacy=" + getCzyAutomatyzujacy() +
                '}';
    }
}
