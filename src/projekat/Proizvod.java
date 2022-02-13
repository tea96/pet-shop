package projekat;


public class Proizvod {
	
private double cena;
private String naziv;
private double kolicina;
private String tipProizvoda;
private String vrstaZivotinje;

public double getCena() {
return cena;
}

public void setCena(double cena) {
this.cena = cena;
}

public String getNaziv() {
return naziv;
}

public void setNaziv(String naziv) {
this.naziv = naziv;
}

public double getKolicina() {
return kolicina;
}

public void setKolicina(double kolicina) {
this.kolicina = kolicina;
}

public String getTipProizvoda() {
return tipProizvoda;
}

public void setTipProizvoda(String tipProizvoda) {
this.tipProizvoda = tipProizvoda;
}

public String getVrstaZivotinje() {
return vrstaZivotinje;
}

public void setVrstaZivotinje(String vrstaZivotinje) {
this.vrstaZivotinje = vrstaZivotinje;
}

public Proizvod() {
super();
}

public Proizvod(double cena, String naziv, double kolicina, String tipProizvoda, String vrstaZivotinje) {
super();
this.cena = cena;
this.naziv = naziv;
this.kolicina = kolicina;
this.tipProizvoda = tipProizvoda;
this.vrstaZivotinje = vrstaZivotinje;
}

@Override
public String toString() {
return "Cena proizvoda je : " + cena + ", naziv:" + naziv + ", kolicina:" + kolicina + ", tip proizvoda:"
+ tipProizvoda + ", za vrstu zivotinje:" + vrstaZivotinje;
}
}