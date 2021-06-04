package klaseNasledjivanjeZivotinjskoCarstvo;

import java.util.ArrayList;
import java.util.List;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Zivotinja z1 = new Zivotinja("Beskicmenjaci", "Puz", "Golac", "Trava valjda...");
		Zivotinja z2 = new Riba("Kicmenjak", "Riba", "Saran", "Skoljke", "Slatka", "Hrskavicnjaca");
		Sisar z3 = new Sisar("Kicmenjak", "Sisar", "Pas", "Meso", "Crna", 4);
		Riba z4 = new Riba("Kicmenjaci", "Riba", "Som", "Manje ribe", "Slatka", "Hrskavicnjaca");
		
		System.out.println(z1.getHrana());
		z1.setHrana("Zeljasto bilje");
		System.out.println(z1.getHrana());
		System.out.println(z3);
		z3.setBojaDlake("Bela");
		System.out.println(z3);
		
		List<Zivotinja> lista = new ArrayList<Zivotinja>();
		
		lista.add(z4);
		lista.add(z2);
		
		Staniste reka = new Staniste(lista, "Reka");
		System.out.println(reka.getNazivStanista());
		reka.ispisListe(lista);
	}

}
