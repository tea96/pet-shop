package projekat;

public class Hrana extends Proizvod{
	
private String nazivH;

public Hrana(double cena, String naziv, double kolicina, String tipProizvoda, String vrstaZivotinje,String nazivH) {
super(cena,naziv,kolicina,tipProizvoda,vrstaZivotinje);
this.nazivH = nazivH;
}

public String getNazivH() {
return nazivH;
}

public void setNazivH(String nazivH) {
this.nazivH = nazivH;
}
}