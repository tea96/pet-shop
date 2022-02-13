package projekat;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Logovanje extends JFrame {
private JPanel contentPane;
private JTextField textFieldKIme;
private JCheckBox chckbxNewCheckBox;
private JPasswordField passwordField;
int br=3;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Logovanje frame = new Logovanje();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the frame.
* 
*/
public Logovanje() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\key-icon.png"));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 120, 450, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(128, 0, 0));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblKorisnikoIme = new JLabel("Korisni\u010Dko ime: ");
lblKorisnikoIme.setForeground(new Color(0, 0, 0));
lblKorisnikoIme.setFont(new Font("Times New Roman", Font.BOLD, 16));
lblKorisnikoIme.setBounds(122, 11, 128, 26);
contentPane.add(lblKorisnikoIme);

JLabel lblLo = new JLabel("Lozinka: ");
lblLo.setForeground(new Color(0, 0, 0));
lblLo.setFont(new Font("Times New Roman", Font.BOLD, 16));
lblLo.setBounds(132, 58, 95, 26);
contentPane.add(lblLo);

textFieldKIme = new JTextField();
textFieldKIme.setBounds(260, 16, 134, 20);
contentPane.add(textFieldKIme);
textFieldKIme.setColumns(10);


JButton btnUnesi = new JButton("UNESI");
Image img2= new ImageIcon(this.getClass().getResource("/ok-icon.png")).getImage();
btnUnesi.setIcon(new ImageIcon(img2));
btnUnesi.setBackground(new Color(128, 128, 128));
btnUnesi.setFont(new Font("Nyala", Font.BOLD, 20));
btnUnesi.setForeground(new Color(0, 0, 0));
btnUnesi.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String ime="",lozinka="",ime1="",lozinka1="";



try {
ime=textFieldKIme.getText();
lozinka=passwordField.getText();}

catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
	}


try {
	Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 PreparedStatement st1 = con1.prepareStatement("Select KorisnickoIme,Lozinka from Korisnik where KorisnickoIme=? and Lozinka=? ");
	 st1.setString(1, ime);
	 st1.setString(2, lozinka);
	 ResultSet rs=st1.executeQuery();
	 
	 while(rs.next())
	 {
	 ime1=rs.getString("KorisnickoIme");
	 lozinka1=rs.getString("Lozinka");
	 }
	 if(ime.equals(ime1) && lozinka.equals(lozinka1)) {
		 try {
//				Connection con5= DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
//				 PreparedStatement st5 = con5.prepareStatement("INSERT INTO Narudzbine(KorisnickoIme)VALUES(?)");
//				 st5.setString(1, ime1);
//				 st5.executeUpdate();
//					
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	 }
	while(br!=0) {
	 if(ime.equals(ime1) && lozinka.equals(lozinka1))
	 {
		
		 JOptionPane.showMessageDialog(null, "Uspesno ste uneli podatke i ulogovali se!","Ulogovani ste",3);
		 Korisnik korisnik=new Korisnik();
		 korisnik.setKorisnickoIme(ime1);
		 korisnik.setVisible(true);
		 
		 
	 }
	 else if(ime.equals("admin")&& lozinka.equals("kucamaca"))
	 {
	 JOptionPane.showMessageDialog(null, "Uspesno ste uneli podatke i ulogovali se!","Ulogovani ste",3);
	 Prodavac prodavac=new Prodavac();
	 prodavac.setVisible(true);
	 Logovanje log= new Logovanje();
	 log.setVisible(false);}

	 else {
	 
	 JOptionPane.showMessageDialog(null, "Pogresno uneti podaci,probaj ponovo! Imate jos "+br+"  pokusaja! ","Greška!",0);
	 textFieldKIme.setText("");
	 passwordField.setText("");
	 br--;
	 }
	 return;
	}
	if(br==0)
	{
		 JOptionPane.showMessageDialog(null, "Pogresno uneti podaci,nemate vise pokusaja ","Greška!",0);
		 System.exit(0);
	}
	 
	 
}
	 
catch(Exception ex) {
	ex.printStackTrace();
}



}

});


btnUnesi.setBounds(142, 139, 144, 41);
contentPane.add(btnUnesi);
chckbxNewCheckBox = new JCheckBox("Prika\u017Ei \u0161ifru");
chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
chckbxNewCheckBox.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if(chckbxNewCheckBox.isSelected())
{
passwordField.setEchoChar((char)0);
}
else
{
passwordField.setEchoChar('#');
}
}
});


chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
chckbxNewCheckBox.setToolTipText("");
chckbxNewCheckBox.setBackground(new Color(128, 0, 0));
chckbxNewCheckBox.setBounds(256, 98, 97, 23);
contentPane.add(chckbxNewCheckBox);

passwordField = new JPasswordField();
passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
passwordField.setForeground(new Color(0, 0, 0));
passwordField.setBounds(260, 61, 136, 20);
contentPane.add(passwordField);
JLabel lblNewLabel = new JLabel("");

Image img= new ImageIcon(this.getClass().getResource("/user-login-icon.png")).getImage();
lblNewLabel.setIcon(new ImageIcon(img));
lblNewLabel.setBounds(0, 62, 122, 122);
contentPane.add(lblNewLabel);


JLabel lblNewLabel_1 = new JLabel("");
Image img1= new ImageIcon(this.getClass().getResource("/kuca-icon.png")).getImage();
lblNewLabel_1.setIcon(new ImageIcon(img1));
lblNewLabel_1.setBounds(315, 151, 163, 132);
contentPane.add(lblNewLabel_1);


}
}