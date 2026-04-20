import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {
        System.out.println("-------Sklad zespolu------");
        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik.przedstawSie());
        }
    }

    public double policzLacznyKoszt() {
        double lacznyKoszt = 0;
        for (Pracownik pracownik : pracownicy) {
            lacznyKoszt += pracownik.obliczKosztMiesieczny();
        }
        return lacznyKoszt;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik pracownik : pracownicy) {
            if (pracownik.pobierzIdPracownika().equals(idPracownika)) {
            }
        }
        return null;
    }
    public void wypiszProgramistow(){
        System.out.println("--------Programmers--------");
        for(Pracownik pracownik : pracownicy){
            if(pracownik instanceof Programista);
            Programista programista = (Programista) pracownik;

            System.out.println(pracownik.przedstawSie());
        }
    }
}

