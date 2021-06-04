package klaseNasledjivanjeZivotinjskoCarstvo;

public class Sisar extends Zivotinja {

	private String bojaDlake;
	private int brojNogu;

	public Sisar(String kicmenjaci, String vrsta, String ime, String hrana, String bojaDlake, int brojNogu) {
		super(kicmenjaci, vrsta, ime, hrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
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
	sb.append(bojaDlake);
	sb.append(", ");
	sb.append(brojNogu);
	sb.append("]");
	return sb.toString();
	}

}
