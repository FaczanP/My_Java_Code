package hu.feladatsor2;

import hu.feladatsor2.modell.Kiado;
import hu.feladatsor2.modell.Konyv;
import hu.feladatsor2.modell.Szerzo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Feladatok {

	static List<Konyv> konyvek = new ArrayList<>();
	static List<Szerzo> szerzok = new ArrayList<>();
	static List<Kiado> kiadok = new ArrayList<>();

	static void feladat2() throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(new File("src/adat/szerzok.csv")));
	br.readLine();
	String sor = null;
	String [] ertek = null;
	while ((sor = br.readLine()) != null){
		ertek = sor.split(",");
		szerzok.add(new Szerzo(Integer.parseInt(ertek[0]),ertek[1],Integer.parseInt(ertek[2])));
	}
	br.close();
	br = new BufferedReader(new FileReader(new File("src/adat/kiadok.csv")));
	br.readLine();
	while ((sor = br.readLine()) != null){
		ertek = sor.split(",");
		kiadok.add(new Kiado(Integer.parseInt(ertek[0]),ertek[1],ertek[2]));
	}
	br.close();
	br = new BufferedReader(new FileReader(new File("src/adat/konyvek.csv")));
	br.readLine();
		while ((sor = br.readLine()) != null) {
			ertek = sor.split(",");
			Szerzo szerzo = null;
			for (Szerzo sz : szerzok
			) {
				if (sz.getSzam() == Integer.parseInt(ertek[2])) {
					szerzo = sz;
					break;
				}
			}
			Kiado kiado = null;
			for (Kiado k : kiadok
			) {
				if (k.getSzam() == Integer.parseInt(ertek[3])) {
					kiado = k;
					break;
				}
			}
			konyvek.add(new Konyv(Integer.parseInt(ertek[0]), ertek[1], szerzo, kiado, Integer.parseInt(ertek[4]),
					Integer.parseInt(ertek[5]), Integer.parseInt(ertek[6]), Boolean.parseBoolean(ertek[7])));
		}
		br.close();


		// TODO Ide ird a 2. feladat megoldasat
	}

	static void feladat3() {
		for (int i = 0; i < 2; i++) {
			System.out.println(szerzok.get(i).toString());
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(kiadok.get(i).toString());
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(konyvek.get(i).toString());
		}

		// TODO Ide ird a 3. feladat megoldasat
	}

	static void feladat4() {
		float atlag = 0;
		for (Konyv k : konyvek
			 ) {
			atlag += k.getAr();
		}
		System.out.printf("Atlagos konyv ar : %.2f" , atlag/konyvek.size());
		System.out.println(" Ft");
		// TODO Ide ird a 4. feladat megoldasat
	}

	static void feladat5() {
		int maxdarab = 0;
		Szerzo max = szerzok.get(0);
		for (Szerzo sz : szerzok
			 ) {
			int darab = 0;
			for (Konyv k : konyvek
				 ) {
				if (k.getSzerzo().equals(sz)){
					darab++;
				}
			}
			if (darab > maxdarab){
				max = sz;
				maxdarab = darab;
			}
		}
			System.out.println("A legtobb konyve "+ max.getNev() + " szerzonek van "+ maxdarab + "db");

		// TODO Ide ird a 5. feladat megoldasat
	}

	static void feladat6() {
		Konyv konyv = konyvek.get(0);
		int darab = 0;
		for (Konyv k : konyvek
			 ) {
			if (k.getAr() > darab){
				konyv = k;
				darab = k.getAr();
			}
		}
		System.out.println("A legdragabb konyv : "+ konyv.getCim() +" " + konyv.getAr() + " Ft");
		// TODO Ide ird a 6. feladat megoldasat
	}

	static void feladat7() {
		List<Integer> evek = new ArrayList<>();
		for (Konyv k : konyvek
			 ) {
			if (evek.contains(k.getEv())){

			}else {
				evek.add(k.getEv());
			}
			}
			Collections.sort(evek);
			for (int i = 0; i < evek.size(); i++) {

			System.out.println(evek.get(i));
		}
		// TODO Ide ird a 7. feladat megoldasat
	}

		public static List<Konyv> konyv = new ArrayList<>();
	static void feladat8() {
		for (Konyv k : konyvek
			 ) {
			if (k.getSzerzo().getSzuletesiev() > 1990){
				konyv.add(k);
			}
		}
		float atlag = 0;
		for (Konyv k : konyv
			 ) {
			atlag += k.getAr();
		}
		System.out.println("1990 utan szuletett szerzok konyveinek atlagos ara : "
				+ atlag/konyv.size() + " Ft" );
		// TODO Ide ird a 8. feladat megoldasat
	}

	static void feladat9() {
		Kiado max = kiadok.get(0);
		int maxdarab = 0;
		for (Kiado k : kiadok
			 ) {
			int darab = 0;
			for (Konyv kv : konyv
			) {
				if (k.getNev().equals(kv.getKiado().getNev())) {
					darab++;
				}
			}
			if (darab > maxdarab) {
				maxdarab = darab;
				max = k;
			}
		}
			System.out.println(" A legtobb 1990 utani szuletesu szerzo altal irt konyvet " +
					max.getNev()+ "adta ki : "+ maxdarab + " Db");

		// TODO Ide ird a 9. feladat megoldasat
	}

	static void feladat10() {
		Kiado kiado = kiadok.get(0);
		float maxforintoldal = 0;
		for (Kiado k : kiadok
			 ) {
			int arosszeg = 0;
			int oldalosszeg = 0;
			for (Konyv kv : konyvek
				 ) {
				if (kv.getKiado().equals(k)){
					arosszeg += kv.getAr();
					oldalosszeg += kv.getOldal();
				}
				}
				float forintperoldal = (float) arosszeg/oldalosszeg;
				if (forintperoldal > maxforintoldal){
					kiado = k;
					maxforintoldal = forintperoldal;
			}
		}
		System.out.printf(" A legnagyobb atlagos Ft  oldal erteku kiado %s: %.2f",  kiado.getNev() , maxforintoldal);
		// TODO Ide ird a 10. feladat megoldasat
	}

}
