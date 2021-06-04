package klaseNasledjivanjeZivotinjskoCarstvo;

public class Zivotinja {

	private String kicmenjaci;
	private String vrsta;
	private String ime;
	private String hrana;
	
	public Zivotinja(String kicmenjaci,String vrsta, String ime, String hrana) {
		super();
		this.kicmenjaci = kicmenjaci;
		this.vrsta = vrsta;
		this.ime = ime;
		this.hrana = hrana;
	}
	
	public String getKicmenjaci() {
		return kicmenjaci;
	}

	public String getVrsta() {
		return vrsta;
	}

	public String getIme() {
		return ime;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

	@Override
	public String toString() {

	StringBuilder sb = new StringBuilder();
	sb.append(kicmenjaci);
	sb.append(" - ");
	sb.append(vrsta);
	sb.append(" - ");
	sb.append(ime);
	sb.append("[");
	sb.append(hrana);
	sb.append("]");
	return sb.toString();
	}
	
	
}
