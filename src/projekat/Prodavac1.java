package projekat;

public class Prodavac1 {
	
private String korisnickoIme;
private String sifra;

public String getKorisnickoIme() {
return korisnickoIme;
}

public void setKorisnickoIme(String korisnickoIme) {
this.korisnickoIme = korisnickoIme;
}

public String getSifra() {
return sifra;
}

public void setSifra(String sifra) {
this.sifra = sifra;
}

public Prodavac1(String korisnickoIme, String sifra) {
super();
this.korisnickoIme = korisnickoIme;
this.sifra = sifra;
}

public Prodavac1() {
super();
}
}