package hu.feladatsor2.modell;

public class Szerzo {
    int szam;
    String nev;
    int szuletesiev;

    public Szerzo(int szam, String nev, int szuletesiev) {
        this.szam = szam;
        this.nev = nev;
        this.szuletesiev = szuletesiev;
    }

    public int getSzam() {
        return szam;
    }

    public String getNev() {
        return nev;
    }

    public int getSzuletesiev() {
        return szuletesiev;
    }

    @Override
    public String toString() {
        return "Szerzo{" +
                "szam=" + szam +
                ", nev='" + nev + '\'' +
                ", szuletesiev=" + szuletesiev +
                '}';
    }
    // TODO Ide ird az 1. feladat megoldasat

}
