package hu.feladatsor2.modell;

public class Kiado {
    int szam;
    String nev, szekhely;

    public Kiado(int szam, String nev, String szekhely) {
        this.szam = szam;
        this.nev = nev;
        this.szekhely = szekhely;
    }

    public int getSzam() {
        return szam;
    }

    public String getNev() {
        return nev;
    }

    public String getSzekhely() {
        return szekhely;
    }

    @Override
    public String toString() {
        return "Kiado{" +
                "szam=" + szam +
                ", nev='" + nev + '\'' +
                ", szekhely='" + szekhely + '\'' +
                '}';
    }
    // TODO Ide ird az 1. feladat megoldasat

}
