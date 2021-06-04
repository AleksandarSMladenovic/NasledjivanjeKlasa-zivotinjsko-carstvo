package klaseNasledjivanjeZivotinjskoCarstvo;

public class Riba extends Zivotinja{
	
	private String vrstaVode;
	private String peraje;
	
	public Riba(String kicmenjaci, String vrsta, String ime, String hrana, String vrstaVode, String peraje) {
		super(kicmenjaci, vrsta, ime, hrana);
		this.vrstaVode = vrstaVode;
		this.peraje = peraje;
	}
	
	public String getVrstaVode() {
		return vrstaVode;
	}
	public String getPeraje() {
		return peraje;
	}
	
	@Override
	public String toString() {

	StringBuilder sb = new StringBuilder();
	sb.append(super.getKicmenjaci());
	sb.append(" - ");
	sb.append(super.getVrsta());
	sb.append(" - ");
	sb.append(super.getIme());
	sb.append("[");
	sb.append(super.getHrana());
	sb.append(", ");
	sb.append(vrstaVode);
	sb.append(", ");
	sb.append(peraje);
	sb.append("]");
	return sb.toString();
	}
}
