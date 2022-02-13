package projekat;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ispis3 extends JDialog {
private JTable table;
/**
* Launch the application.
*/

public static void main(String[] args) {
try {
Ispis3 dialog = new Ispis3();
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
dialog.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
/**
* Create the dialog.
*/

public Ispis3() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\Animals-Cat-Track-icon.png"));
getContentPane().setBackground(new Color(0, 128, 128));
getContentPane().setForeground(new Color(0, 128, 128));
getContentPane().setLayout(null);
{
JLabel lblNarueniProizvodi = new JLabel("Naru\u010Deni proizvodi:");
lblNarueniProizvodi.setForeground(new Color(0, 255, 255));
lblNarueniProizvodi.setFont(new Font("Tahoma", Font.BOLD, 16));
lblNarueniProizvodi.setBounds(227, 11, 180, 27);
getContentPane().add(lblNarueniProizvodi);
}
{
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(10, 49, 583, 313);
getContentPane().add(scrollPane);
{
table = new JTable();
table.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}
});
table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
	}
));
scrollPane.setViewportView(table);
try {
	Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 PreparedStatement st1 = con1.prepareStatement("select * from Narudzbine");
	 ResultSet rs = st1.executeQuery();
		
	 table.setModel(DbUtils.resultSetToTableModel(rs));
	 
	 JButton btnOdobriNarudbine = new JButton("ODOBRI NARUD\u017DBINE");
	 btnOdobriNarudbine.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent arg0) {
	 		
	 		int kolicina=0,sifra=0;
	 		try {
	 			Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 			 PreparedStatement st1 = con1.prepareStatement("select Kolicina,Sifra from Narudzbine");
	 			ResultSet rs = st1.executeQuery();
	 			while(rs.next())
	 			 {
	 			 kolicina=rs.getInt("Kolicina");
	 			 sifra=rs.getInt("Sifra");
	 			 }
	 			int kolicina1=0,sifra1=0;
	 			Connection con2 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 			 PreparedStatement st2 = con2.prepareStatement("select Sifra,Kolicina from Proizvodi where Sifra = ?");
	 			 st2.setInt(1,sifra);
	 			ResultSet rs1 = st2.executeQuery();
	 			while(rs1.next())
	 			 {
	 			 kolicina1=rs1.getInt("Kolicina");
	 			 sifra1=rs1.getInt("Sifra");
	 			 }
	 			int iznos=0;
	 			iznos=kolicina1-kolicina;
	 			Connection con3 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 			 PreparedStatement st3 = con3.prepareStatement("Update Proizvodi set Kolicina=? where Sifra=?");
	 			 st3.setInt(1, iznos);
	 			 st3.setInt(2, sifra);
	 			 st3.executeUpdate();
	 		
	 			
	 		}
	 		
	 		catch(Exception ex) {
	 			ex.printStackTrace();
	 		}
	 		int s=0,c=0,k=0,u=0;
	 		String n="",v="",t="",g="";
	 		try {
	 			Connection con4 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 			 PreparedStatement st4 = con4.prepareStatement("Select Sifra,Naziv, Cena, Kolicina, VrstaZivotinje, TipProizvoda,UkupanIznos,KorisnickoIme from Narudzbine");
	 			ResultSet rs4 = st4.executeQuery();
	 			while(rs4.next())
	 			 {
	 			 k=rs4.getInt("Kolicina");
	 			 s=rs4.getInt("Sifra");
	 			 c=rs4.getInt("Cena");
	 			 n=rs4.getString("Naziv");
	 			 v=rs4.getString("VrstaZivotinje");
	 			 t=rs4.getString("TipProizvoda");
	 			 u=rs4.getInt("UkupanIznos");
	 			 g=rs4.getString("KorisnickoIme");
	 			 }
	 			
	 				Connection con = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 				 PreparedStatement st = con.prepareStatement("INSERT INTO OdobreneNarudzbine (Naziv, Cena, Kolicina, VrstaZivotinje, TipProizvoda,UkupanIznos,Sifra,KorisnickoIme)VALUES(?,?,?,?,?,?,?,?)");
	 				 st.setString(1, n);
	 				 st.setInt(2, c);
	 				 st.setInt(3, k);
	 				 st.setString(4, v);
	 				 st.setString(5, t);
	 				 st.setInt(6, u);
	 				 st.setInt(7, s);
	 				 st.setString(8, g);
	 				 st.executeUpdate();
	 					
	 		
	 				
	 			
	 		}catch(Exception ex) {
	 			ex.printStackTrace();
	 		}
	 		
	 		try {
				Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
				 PreparedStatement st1 = con1.prepareStatement("delete * from Narudzbine ");
				 st1.executeUpdate();
					
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	 	}
	 });
	 btnOdobriNarudbine.setFont(new Font("Tahoma", Font.BOLD, 12));
	 btnOdobriNarudbine.setBounds(417, 15, 176, 23);
	 getContentPane().add(btnOdobriNarudbine);
	
}catch(Exception ex) {
	ex.printStackTrace();
}
}
}
setBounds(100, 100, 622, 402);
}
}