package projekat;

import java.awt.BorderLayout;
import java.io.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.Toolkit;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.sql.*;

public class Prodavac extends JFrame {
private JPanel contentPane;
private JTextField tfIme;
private JTextField tfKolicina;
private JTextField tfCena;
private JTextField tfUkloni;
private JTextField tfImeK;
private JTextField tfPrezime;
private JTextField tfAdresa;
private JTextField tfTelefon;
private JTextField tfBrNarudzbina;
private JTextField tfKIme;
private JTextField tfLozinka;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Prodavac frame = new Prodavac();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the frame.
*/


public Prodavac() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\Animals-Cat-Track-icon.png"));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 666, 682);


JMenuBar menuBar = new JMenuBar();
setJMenuBar(menuBar);
JMenu mnUnos = new JMenu("Ispis podataka");
mnUnos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
menuBar.add(mnUnos);


JMenuItem mntmIspisDostupnihPodataka = new JMenuItem("Ispis dostupnih proizvoda");
mntmIspisDostupnihPodataka.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Ispis1 prvi= new Ispis1();
prvi.setVisible(true);
}
});


mnUnos.add(mntmIspisDostupnihPodataka);
JMenuItem mntmIspisKorisnika = new JMenuItem("Ispis korisnika");
mntmIspisKorisnika.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Ispis2 drugi= new Ispis2();
drugi.setVisible(true);
}
});


mnUnos.add(mntmIspisKorisnika);
JMenu mnNarubine = new JMenu("Naru\u017Ebine");
menuBar.add(mnNarubine);
JMenuItem mntmPogledajNarudbine = new JMenuItem("Pogledaj narud\u017Ebine");
mntmPogledajNarudbine.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Ispis3 treci= new Ispis3();
treci.setVisible(true);
}
});


mnNarubine.add(mntmPogledajNarudbine);
contentPane = new JPanel();
contentPane.setForeground(new Color(0, 0, 0));
contentPane.setBackground(new Color(128, 0, 0));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);


JLabel lblTipProizvoda = new JLabel("Vrsta \u017Eivotinje: ");
lblTipProizvoda.setForeground(new Color(0, 0, 0));
lblTipProizvoda.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTipProizvoda.setBounds(10, 104, 107, 14);
contentPane.add(lblTipProizvoda);


JCheckBox checkBoxPas = new JCheckBox("Pas");
checkBoxPas.setHorizontalAlignment(SwingConstants.LEFT);
checkBoxPas.setForeground(Color.BLACK);
checkBoxPas.setFont(new Font("Tahoma", Font.BOLD, 12));
checkBoxPas.setBackground(new Color(0, 128, 128));
checkBoxPas.setBounds(21, 125, 97, 23);
contentPane.add(checkBoxPas);


JCheckBox checkBox_1 = new JCheckBox("Macka");
checkBox_1.setHorizontalAlignment(SwingConstants.LEFT);
checkBox_1.setForeground(Color.BLACK);
checkBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
checkBox_1.setBackground(new Color(0, 128, 128));
checkBox_1.setBounds(21, 151, 97, 23);
contentPane.add(checkBox_1);


JCheckBox checkBox_2 = new JCheckBox("Ptica");
checkBox_2.setHorizontalAlignment(SwingConstants.LEFT);
checkBox_2.setForeground(Color.BLACK);
checkBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
checkBox_2.setBackground(new Color(0, 128, 128));
checkBox_2.setBounds(21, 177, 97, 23);
contentPane.add(checkBox_2);


JCheckBox checkBox_3 = new JCheckBox("Male \u017Eivotinje");
checkBox_3.setHorizontalAlignment(SwingConstants.LEFT);
checkBox_3.setForeground(Color.BLACK);
checkBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
checkBox_3.setBackground(new Color(0, 128, 128));
checkBox_3.setBounds(21, 203, 120, 23);
contentPane.add(checkBox_3);


JLabel lblTipProizvoda_1 = new JLabel("Tip proizvoda: ");
lblTipProizvoda_1.setForeground(new Color(0, 0, 0));
lblTipProizvoda_1.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTipProizvoda_1.setBounds(10, 233, 107, 14);
contentPane.add(lblTipProizvoda_1);


JRadioButton rbhrana = new JRadioButton("Hrana");
rbhrana.setForeground(new Color(0, 0, 0));
rbhrana.setFont(new Font("Tahoma", Font.BOLD, 12));
rbhrana.setBackground(new Color(0, 128, 128));
rbhrana.setBounds(8, 254, 109, 23);
contentPane.add(rbhrana);


JRadioButton rbhigijena = new JRadioButton("Higijena");
rbhigijena.setForeground(new Color(0, 0, 0));
rbhigijena.setFont(new Font("Tahoma", Font.BOLD, 12));
rbhigijena.setBackground(new Color(0, 128, 128));
rbhigijena.setBounds(10, 286, 109, 23);
contentPane.add(rbhigijena);


JRadioButton rbogrlice = new JRadioButton("Ogrlice i povoci");
rbogrlice.setForeground(new Color(0, 0, 0));
rbogrlice.setFont(new Font("Tahoma", Font.BOLD, 12));
rbogrlice.setBackground(new Color(0, 128, 128));
rbogrlice.setBounds(10, 325, 153, 23);
contentPane.add(rbogrlice);


ButtonGroup grupa = new ButtonGroup();
grupa.add(rbhrana);
grupa.add(rbhigijena);
grupa.add(rbogrlice);
JButton btnUnesiProizvod = new JButton("Unesi proizvod");
btnUnesiProizvod.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
	
	int cena=0, kolicina=0;
	String Naziv="";
	String tip="";
	String vrsta="";
	
	try {
	Naziv=tfIme.getText();
	cena = Integer.parseInt(tfCena.getText());
	kolicina= Integer.parseInt(tfKolicina.getText());
	
	if(checkBoxPas.isSelected())
	vrsta="Pas";
	
	else if(checkBox_1.isSelected())
	vrsta="Macka";
	
	else if(checkBox_2.isSelected())
	vrsta="Ptica";
	
	else
	vrsta="Male zivotinje";
	
	if(rbhrana.isSelected())
	tip="Hrana";
	
	else if(rbhigijena.isSelected())
	tip="Higijena";
	
	else
	tip="Ogrlice i povoci";
	}
	
	catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
	}
	
	try {
		Connection con = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
		 PreparedStatement st = con.prepareStatement("INSERT INTO Proizvodi (Naziv, Cena, Kolicina, VrstaZivotinje, TipProizvoda)VALUES(?,?,?,?,?)");
		 st.setString(1, Naziv);
		 st.setInt(2, cena);
		 st.setInt(3, kolicina);
		 st.setString(4, vrsta);
		 st.setString(5, tip);
		 st.executeUpdate();
		 
		 tfIme.setText("");
			tfCena.setText("");
			tfKolicina.setText("");
			checkBoxPas.setSelected(false);
			checkBox_1.setSelected(false);
			checkBox_2.setSelected(false);
			checkBox_3.setSelected(false);
			grupa.clearSelection();
			
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
}
});


btnUnesiProizvod.setForeground(new Color(0, 0, 0));
btnUnesiProizvod.setFont(new Font("Tahoma", Font.BOLD, 12));
btnUnesiProizvod.setBounds(64, 356, 129, 23);
contentPane.add(btnUnesiProizvod);


JLabel lblUkucajNazivProizvoda = new JLabel("Ukucaj \u0161ifru proizvoda koji \u017Eeli\u0161 da ukloni\u0161 :");
lblUkucajNazivProizvoda.setForeground(new Color(0, 0, 0));
lblUkucajNazivProizvoda.setFont(new Font("Tahoma", Font.BOLD, 11));
lblUkucajNazivProizvoda.setBounds(10, 458, 288, 14);
contentPane.add(lblUkucajNazivProizvoda);
tfUkloni = new JTextField();
tfUkloni.setBounds(61, 483, 139, 20);
contentPane.add(tfUkloni);
tfUkloni.setColumns(10);


JLabel lblUnesiKorisnika = new JLabel("Unesi podatke: ");
lblUnesiKorisnika.setForeground(new Color(0, 0, 0));
lblUnesiKorisnika.setFont(new Font("Tahoma", Font.BOLD, 12));
lblUnesiKorisnika.setBounds(395, 129, 139, 14);
contentPane.add(lblUnesiKorisnika);


JLabel label = new JLabel("");
Image img= new ImageIcon(this.getClass().getResource("/kuca-icon.png")).getImage();
label.setIcon(new ImageIcon(img));
label.setBounds(542, 509, 209, 135);
contentPane.add(label);


JLabel lblIme_1 = new JLabel("Ime:");
lblIme_1.setFont(new Font("Tahoma", Font.BOLD, 11));
lblIme_1.setForeground(new Color(0, 0, 0));
lblIme_1.setBounds(349, 156, 46, 14);
contentPane.add(lblIme_1);


JLabel lblPrezime = new JLabel("Prezime: ");
lblPrezime.setFont(new Font("Tahoma", Font.BOLD, 11));
lblPrezime.setForeground(new Color(0, 0, 0));
lblPrezime.setBounds(349, 182, 60, 14);
contentPane.add(lblPrezime);


JLabel lblAdresa = new JLabel("Adresa: ");
lblAdresa.setFont(new Font("Tahoma", Font.BOLD, 11));
lblAdresa.setForeground(new Color(0, 0, 0));
lblAdresa.setBounds(350, 208, 46, 14);
contentPane.add(lblAdresa);

JLabel lblTelefon = new JLabel("Telefon: ");
lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
lblTelefon.setForeground(new Color(0, 0, 0));
lblTelefon.setBounds(350, 234, 60, 14);

contentPane.add(lblTelefon);
tfImeK = new JTextField();
tfImeK.setBounds(474, 153, 86, 20);
contentPane.add(tfImeK);
tfImeK.setColumns(10);
tfPrezime = new JTextField();
tfPrezime.setColumns(10);
tfPrezime.setBounds(474, 180, 86, 20);
contentPane.add(tfPrezime);
tfAdresa = new JTextField();
tfAdresa.setColumns(10);
tfAdresa.setBounds(474, 205, 86, 20);
contentPane.add(tfAdresa);
tfTelefon = new JTextField();
tfTelefon.setColumns(10);
tfTelefon.setBounds(474, 233, 86, 20);
contentPane.add(tfTelefon);


JLabel lblBrojNardbina = new JLabel("Broj nard\u017Ebina:");
lblBrojNardbina.setForeground(new Color(0, 0, 0));
lblBrojNardbina.setFont(new Font("Tahoma", Font.BOLD, 11));
lblBrojNardbina.setBounds(350, 267, 100, 14);
contentPane.add(lblBrojNardbina);
tfBrNarudzbina = new JTextField();
tfBrNarudzbina.setColumns(10);
tfBrNarudzbina.setBounds(474, 264, 86, 20);
contentPane.add(tfBrNarudzbina);


JButton btnUkloniProizvod = new JButton("Ukloni proizvod");
btnUkloniProizvod.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		int sifra=0;
		try {
			sifra=Integer.parseInt(tfUkloni.getText());
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
			}
		try {
			Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
			 PreparedStatement st1 = con1.prepareStatement("delete from Proizvodi where Sifra = ? ");
			 st1.setInt(1,sifra);
			 st1.executeUpdate();
				
			tfUkloni.setText("");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}
});
btnUkloniProizvod.setForeground(Color.BLACK);
btnUkloniProizvod.setFont(new Font("Tahoma", Font.BOLD, 12));
btnUkloniProizvod.setBounds(64, 535, 129, 23);
contentPane.add(btnUkloniProizvod);


JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Unos korisnika", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel.setBackground(new Color(0, 128, 128));
panel.setBounds(301, 83, 306, 320);
contentPane.add(panel);


panel.setLayout(null);
JButton btnNewButton = new JButton("Unesi korisnika");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		String ime="",prezime="",adresa="",telefon="",kIme="",lozinka="";
		int brNarudzbina=0;
		try {
			 ime=tfImeK.getText();
			 prezime=tfPrezime.getText();
			 adresa=tfAdresa.getText();
			 telefon=tfTelefon.getText();
			 brNarudzbina=Integer.parseInt(tfBrNarudzbina.getText());
			 kIme=tfKIme.getText();
			 lozinka=tfLozinka.getText();
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
			}
		
		try {
			Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
			 PreparedStatement st1 = con1.prepareStatement("INSERT INTO Korisnik (Ime, Prezime, Adresa, Telefon, BrojNarudzbina, KorisnickoIme, Lozinka)VALUES(?,?,?,?,?,?,?)");
			 st1.setString(1, ime);
			 st1.setString(2, prezime);
			 st1.setString(3, adresa);
			 st1.setString(4, telefon);
			 st1.setInt(5, brNarudzbina);
			 st1.setString(6, kIme);
			 st1.setString(7, lozinka);
			 st1.executeUpdate();
				
			tfImeK.setText("");
			tfPrezime.setText("");
			tfTelefon.setText("");
			tfAdresa.setText("");
			tfBrNarudzbina.setText("");
			tfKIme.setText("");
			tfLozinka.setText("");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
});
btnNewButton.setBounds(74, 286, 153, 23);
panel.add(btnNewButton);
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton.setForeground(new Color(0, 0, 0));
JLabel lblKorisnikoIme = new JLabel("Korisni\u010Dko ime:");
lblKorisnikoIme.setForeground(new Color(0, 0, 0));
lblKorisnikoIme.setFont(new Font("Tahoma", Font.BOLD, 11));
lblKorisnikoIme.setBounds(49, 210, 96, 14);


panel.add(lblKorisnikoIme);
tfKIme = new JTextField();
tfKIme.setColumns(10);
tfKIme.setBounds(172, 208, 86, 20);
panel.add(tfKIme);
JLabel lblLozinka = new JLabel("Lozinka:");
lblLozinka.setForeground(new Color(0, 0, 0));
lblLozinka.setFont(new Font("Tahoma", Font.BOLD, 11));
lblLozinka.setBounds(49, 242, 96, 14);
panel.add(lblLozinka);

tfLozinka = new JTextField();
tfLozinka.setColumns(10);
tfLozinka.setBounds(172, 239, 86, 20);
panel.add(tfLozinka);
JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 128, 128));
panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Unos proizvoda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel_1.setBounds(0, 0, 246, 418);
contentPane.add(panel_1);

panel_1.setLayout(null);
JLabel lblKoliina = new JLabel("Koli\u010Dina: ");
lblKoliina.setBounds(10, 81, 54, 15);
panel_1.add(lblKoliina);
lblKoliina.setForeground(new Color(0, 0, 0));
lblKoliina.setFont(new Font("Tahoma", Font.BOLD, 12));
JLabel lblCena = new JLabel("Cena: ");
lblCena.setBounds(10, 21, 38, 15);
panel_1.add(lblCena);
lblCena.setForeground(new Color(0, 0, 0));
lblCena.setFont(new Font("Tahoma", Font.BOLD, 12));

tfKolicina = new JTextField();
tfKolicina.setBounds(74, 79, 86, 20);
panel_1.add(tfKolicina);
tfKolicina.setColumns(10);
JLabel lblIme = new JLabel("Naziv: ");
lblIme.setBounds(10, 56, 46, 14);
panel_1.add(lblIme);
lblIme.setForeground(new Color(0, 0, 0));
lblIme.setFont(new Font("Tahoma", Font.BOLD, 12));

tfIme = new JTextField();
tfIme.setBounds(74, 48, 86, 20);
panel_1.add(tfIme);
tfIme.setColumns(10);
tfCena = new JTextField();
tfCena.setBounds(74, 19, 86, 20);
panel_1.add(tfCena);
tfCena.setColumns(10);

JPanel panel_2 = new JPanel();
panel_2.setForeground(new Color(0, 0, 0));
panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Uklanjanje proizvoda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel_2.setBackground(new Color(0, 128, 128));
panel_2.setBounds(0, 437, 342, 158);
contentPane.add(panel_2);
panel_2.setLayout(null);
}
}