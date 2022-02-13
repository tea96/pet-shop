package projekat;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;


public class Ispis1 extends JDialog {
private JTable table;
/**
* Launch the application.
*/

public static void main(String[] args) {
try {
Ispis1 dialog = new Ispis1();
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
dialog.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
/**
* Create the dialog.
*/


public Ispis1() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\Animals-Cat-Track-icon.png"));
getContentPane().setBackground(new Color(0, 128, 128));
getContentPane().setForeground(new Color(0, 0, 0));
setBounds(100, 100, 622, 416);
getContentPane().setLayout(null);
JLabel lblIspisPodatakaO = new JLabel("Ispis podataka o dostupnim proizvodima:");
lblIspisPodatakaO.setBackground(new Color(0, 128, 128));
lblIspisPodatakaO.setForeground(new Color(0, 255, 255));
lblIspisPodatakaO.setFont(new Font("Tahoma", Font.BOLD, 16));
lblIspisPodatakaO.setBounds(115, 11, 344, 24);
getContentPane().add(lblIspisPodatakaO);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(10, 47, 580, 317);
getContentPane().add(scrollPane);
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
	 PreparedStatement st1 = con1.prepareStatement("select * from Proizvodi");
	 ResultSet rs = st1.executeQuery();
		
	 table.setModel(DbUtils.resultSetToTableModel(rs));
	
}catch(Exception ex) {
	ex.printStackTrace();
}
}
}
