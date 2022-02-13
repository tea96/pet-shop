package projekat;

public class OgrliceiPovoci extends Proizvod {
private String nazivO;

public String getNazivO() {
return nazivO;
}

public void setNazivO(String nazivO) {
this.nazivO = nazivO;
}

public OgrliceiPovoci() {
super();
}

public OgrliceiPovoci(double cena, String naziv, double kolicina, String tipProizvoda, String vrstaZivotinje,String nazivO) {
super(cena,naziv,kolicina,tipProizvoda,vrstaZivotinje);
this.nazivO = nazivO;
}
}