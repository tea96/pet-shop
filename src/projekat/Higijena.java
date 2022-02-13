package projekat;

public class Higijena extends Proizvod {
	
private String nazivHi;

public Higijena(double cena, String naziv, double kolicina, String tipProizvoda, String vrstaZivotinje,String nazivHi) {
super(cena,naziv,kolicina,tipProizvoda,vrstaZivotinje);
this.nazivHi = nazivHi;
}

public String getNazivHi() {
return nazivHi;
}

public void setNazivHi(String nazivHi) {
this.nazivHi = nazivHi;
}
}