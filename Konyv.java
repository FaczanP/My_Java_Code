package hu.feladatsor2.modell;

public class Konyv {
    int szam;
    String cim;
    Szerzo szerzo;
    Kiado kiado;
    int ev,oldal,ar;
    boolean kemenyboritos;

    public Konyv(int szam, String cim, Szerzo szerzo, Kiado kiado, int ev, int oldal, int ar, boolean kemenyboritos) {
        this.szam = szam;
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiado = kiado;
        this.ev = ev;
        this.oldal = oldal;
        this.ar = ar;
        this.kemenyboritos = kemenyboritos;
    }

    public int getSzam() {
        return szam;
    }

    public String getCim() {
        return cim;
    }

    public Szerzo getSzerzo() {
        return szerzo;
    }

    public Kiado getKiado() {
        return kiado;
    }

    public int getEv() {
        return ev;
    }

    public int getOldal() {
        return oldal;
    }

    public int getAr() {
        return ar;
    }

    public boolean isKemenyboritos() {
        return kemenyboritos;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "szam=" + szam +
                ", cim='" + cim + '\'' +
                ", szerzo=" + szerzo +
                ", kiado=" + kiado +
                ", ev=" + ev +
                ", oldal=" + oldal +
                ", ar=" + ar +
                ", kemenyboritos=" + kemenyboritos +
                '}';
    }
    // TODO Ide ird az 1. feladat megoldasat

}
