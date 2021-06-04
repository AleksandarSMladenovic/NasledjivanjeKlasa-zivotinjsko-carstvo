package klaseNasledjivanjeZivotinjskoCarstvo;

import java.util.ArrayList;
import java.util.List;

public class Staniste {
	
	List<Zivotinja> lista = new ArrayList<Zivotinja>();
	private String nazivStanista;
	
	public Staniste(List<Zivotinja> lista, String nazivStanista) {
		this.lista = lista;
		this.nazivStanista = nazivStanista;
	}

	public List<Zivotinja> getLista() {
		return lista;
	}

	public void setLista(List<Zivotinja> lista) {
		this.lista = lista;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	public void ispisListe(List <Zivotinja> lista) {
		for(int i = 0; i < lista.size(); i++) {
			String ime = lista.get(i).getIme();
			System.out.println(ime);
		}
	}
	
}
