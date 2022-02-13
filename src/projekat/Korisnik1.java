package projekat;

public class Korisnik1 {
private String korisnickoIme;
private String sifra;
private String ImePrezime;
private int brNarudzbina;
private String adresa;
private String telefon;

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

public String getImePrezime() {
return ImePrezime;
}

public void setImePrezime(String imePrezime) {
ImePrezime = imePrezime;
}

public int getBrNarudzbina() {
return brNarudzbina;
}

public void setBrNarudzbina(int brNarudzbina) {
this.brNarudzbina = brNarudzbina;
}

public String getAdresa() {
return adresa;
}

public void setAdresa(String adresa) {
this.adresa = adresa;
}

public String getTelefon() {
return telefon;
}

public void setTelefon(String telefon) {
this.telefon = telefon;
}

public Korisnik1(String korisnickoIme, String sifra, String imePrezime, int brNarudzbina, String adresa,String telefon) {
super();
this.korisnickoIme = korisnickoIme;
this.sifra = sifra;
ImePrezime = imePrezime;
this.brNarudzbina = brNarudzbina;
this.adresa = adresa;
this.telefon = telefon;
}

public Korisnik1() {
super();
}

@Override
public String toString() {
return "Kod korsnika je Korisnicko ime:" + korisnickoIme + ", sifra: " + sifra + ", Ime i prezime:" + ImePrezime
+ ", broj narudzbina je: " + brNarudzbina + ", adresa:" + adresa + ", telefon:" + telefon;
}
}