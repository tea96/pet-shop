package projekat;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;


public class Ispis2 extends JDialog {
private JTable table;
/**
* Launch the application.
*/


public static void main(String[] args) {
try {
Ispis2 dialog = new Ispis2();
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
dialog.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
/**
* Create the dialog.
*/
public Ispis2() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\Animals-Cat-Track-icon.png"));
getContentPane().setBackground(new Color(0, 128, 128));
setBounds(100, 100, 632, 395);
getContentPane().setLayout(null);
{
JLabel lblIspisListeKorisnika = new JLabel("Ispis liste korisnika: ");
lblIspisListeKorisnika.setBackground(new Color(0, 128, 128));
lblIspisListeKorisnika.setFont(new Font("Tahoma", Font.BOLD, 16));
lblIspisListeKorisnika.setForeground(new Color(0, 255, 255));
lblIspisListeKorisnika.setBounds(217, 11, 315, 28);
getContentPane().add(lblIspisListeKorisnika);
}
{
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(20, 50, 586, 284);
getContentPane().add(scrollPane);
{
table = new JTable();
table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
	}
));
scrollPane.setViewportView(table);

try {
	Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
	 PreparedStatement st1 = con1.prepareStatement("select * from Korisnik");
	 ResultSet rs = st1.executeQuery();
		
	 table.setModel(DbUtils.resultSetToTableModel(rs));
	
}catch(Exception ex) {
	ex.printStackTrace();
}
}
}
}
}