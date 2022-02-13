package projekat;

import java.awt.EventQueue;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;


public class Korisnik extends JFrame {
private JPanel contentPane;
private JTextField tfMin;
private JTextField tfMax;
private JTable table;
private JTextField tfSifra;
private JTextField tfKolicina;


/**
* @wbp.nonvisual location=-41,-31
*/
private final JCheckBox checkBox = new JCheckBox("New check box");
private JTable table_1;
private JTextField tfCena;
private JTextField tfIznos;
private String korisnickoIme;
public void setKorisnickoIme(String korisnickoIme) {
	this.korisnickoIme = korisnickoIme;
}
/**
* Launch the application.
*/


public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Korisnik frame = new Korisnik();
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


public Korisnik() {
	setResizable(false);
setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\7\\Desktop\\Celokupni delovi projekta\\Pet shop projekat pravi\\Slike za prozor\\Users-icon.png"));
setFont(new Font("Courier New", Font.BOLD, 14));
setTitle("Korisnik");
setBackground(new Color(0, 0, 0));
setForeground(new Color(0, 0, 0));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 731, 781);
contentPane = new JPanel();
contentPane.setBackground(new Color(128, 0, 0));
contentPane.setForeground(SystemColor.windowText);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);


JLabel lblOdaberiTipProizvoda = new JLabel("Odaberi tip proizvoda: ");
lblOdaberiTipProizvoda.setForeground(new Color(0, 0, 0));
lblOdaberiTipProizvoda.setBackground(new Color(128, 0, 0));
lblOdaberiTipProizvoda.setFont(new Font("Tahoma", Font.BOLD, 12));
lblOdaberiTipProizvoda.setBounds(10, 109, 161, 14);
contentPane.add(lblOdaberiTipProizvoda);


JComboBox comboBox = new JComboBox();
comboBox.setForeground(new Color(0, 128, 128));
comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Higijena", "Hrana", "Ogrlice i povoci"}));
comboBox.setBackground(new Color(192, 192, 192));
comboBox.setBounds(166, 107, 121, 20);
contentPane.add(comboBox);


JLabel lblekirajeljenuivotinju = new JLabel("\u010Cekiraj \u017Eeljenu \u017Eivotinju: ");
lblekirajeljenuivotinju.setForeground(new Color(0, 0, 0));
lblekirajeljenuivotinju.setFont(new Font("Tahoma", Font.BOLD, 12));
lblekirajeljenuivotinju.setBounds(10, 177, 182, 14);
contentPane.add(lblekirajeljenuivotinju);


JCheckBox chckbxPas = new JCheckBox("Pas");
chckbxPas.setHorizontalAlignment(SwingConstants.LEFT);
chckbxPas.setBackground(new Color(0, 128, 128));
chckbxPas.setForeground(new Color(0, 0, 0));
chckbxPas.setFont(new Font("Tahoma", Font.BOLD, 12));
chckbxPas.setBounds(51, 215, 97, 23);
contentPane.add(chckbxPas);


JCheckBox chckbxMacka = new JCheckBox("Macka");
chckbxMacka.setForeground(new Color(0, 0, 0));
chckbxMacka.setFont(new Font("Tahoma", Font.BOLD, 12));
chckbxMacka.setBackground(new Color(0, 128, 128));
chckbxMacka.setHorizontalAlignment(SwingConstants.LEFT);
chckbxMacka.setBounds(51, 241, 97, 23);
contentPane.add(chckbxMacka);


JCheckBox chckbxPtica = new JCheckBox("Ptica");
chckbxPtica.setForeground(new Color(0, 0, 0));
chckbxPtica.setBackground(new Color(0, 128, 128));
chckbxPtica.setFont(new Font("Tahoma", Font.BOLD, 12));
chckbxPtica.setHorizontalAlignment(SwingConstants.LEFT);
chckbxPtica.setBounds(51, 267, 97, 23);
contentPane.add(chckbxPtica);


JCheckBox chckbxMaleivotinje = new JCheckBox("Male \u017Eivotinje");
chckbxMaleivotinje.setForeground(new Color(0, 0, 0));
chckbxMaleivotinje.setFont(new Font("Tahoma", Font.BOLD, 12));
chckbxMaleivotinje.setBackground(new Color(0, 128, 128));
chckbxMaleivotinje.setHorizontalAlignment(SwingConstants.LEFT);
chckbxMaleivotinje.setBounds(51, 293, 120, 23);
contentPane.add(chckbxMaleivotinje);


JScrollPane scrollPane = new JScrollPane();
scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
scrollPane.setBounds(350, 276, 223, -248);
contentPane.add(scrollPane);
table = new JTable();
scrollPane.setViewportView(table);
JButton btnFiltriraj = new JButton("Pretra\u017Ei");
btnFiltriraj.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		int min=0, max=0;
		String vrsta="",tip="";
		try {
				min=Integer.parseInt(tfMin.getText());
				max=Integer.parseInt(tfMax.getText());
				tip=comboBox.getSelectedItem().toString();
				
				if(chckbxPas.isSelected())
					vrsta="Pas";
					
					else if(chckbxMacka.isSelected())
					vrsta="Macka";
					
					else if(chckbxPtica.isSelected())
					vrsta="Ptica";
					
					else
					vrsta="Male zivotinje";}
			
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
				}
			try {
				Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
				 PreparedStatement st1 = con1.prepareStatement("SELECT Proizvodi.Sifra, Proizvodi.Naziv, Proizvodi.Cena, Proizvodi.Kolicina, Proizvodi.VrstaZivotinje, Proizvodi.TipProizvoda, Proizvodi.Cena\r\n" + 
				 		"FROM Proizvodi\r\n" + 
				 		"GROUP BY Proizvodi.Sifra, Proizvodi.Naziv, Proizvodi.Cena, Proizvodi.Kolicina, Proizvodi.VrstaZivotinje, Proizvodi.TipProizvoda, Proizvodi.Cena\r\n" + 
				 		"HAVING (((Proizvodi.Cena) Between ? And ?) AND ((Proizvodi.VrstaZivotinje) Like (?)) AND ((Proizvodi.TipProizvoda) Like (?)));");
				 
				 st1.setInt(1,min);
				 st1.setInt(2,max);
				 st1.setString(3,vrsta);
				 st1.setString(4,tip); 
				
				 
				 
				 ResultSet rs = st1.executeQuery();
				 
				
					
				 table_1.setModel(DbUtils.resultSetToTableModel(rs));
				 
				 
				 
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
}
);
btnFiltriraj.setForeground(new Color(0, 0, 0));
btnFiltriraj.setFont(new Font("Tahoma", Font.BOLD, 12));
btnFiltriraj.setBounds(38, 344, 89, 23);
contentPane.add(btnFiltriraj);
JLabel label = new JLabel("");
Image img= new ImageIcon(this.getClass().getResource("/kuca-icon.png")).getImage();
label.setIcon(new ImageIcon(img));
label.setBounds(608, 629, 209, 135);
contentPane.add(label);


JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pretra\u017Eivanje proizvoda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel.setBackground(new Color(0, 128, 128));
panel.setBounds(0, 0, 320, 384);
contentPane.add(panel);


panel.setLayout(null);
JLabel lblUnesiMinimalnuCenu = new JLabel("Unesi minimalnu cenu:");
lblUnesiMinimalnuCenu.setBounds(10, 24, 135, 15);
panel.add(lblUnesiMinimalnuCenu);
lblUnesiMinimalnuCenu.setBackground(new Color(224, 255, 255));
lblUnesiMinimalnuCenu.setForeground(new Color(0, 0, 0));
lblUnesiMinimalnuCenu.setFont(new Font("Tahoma", Font.BOLD, 12));
tfMax = new JTextField();
tfMax.setBounds(181, 58, 86, 20);
panel.add(tfMax);
tfMax.setBackground(new Color(224, 255, 255));
tfMax.setColumns(10);

JLabel lblUnesiMaksimalnuCenu = new JLabel("Unesi maksimalnu cenu: ");
lblUnesiMaksimalnuCenu.setBounds(10, 60, 161, 14);
panel.add(lblUnesiMaksimalnuCenu);
lblUnesiMaksimalnuCenu.setForeground(new Color(0, 0, 0));
lblUnesiMaksimalnuCenu.setBackground(new Color(128, 0, 0));
lblUnesiMaksimalnuCenu.setFont(new Font("Tahoma", Font.BOLD, 12));
tfMin = new JTextField();
tfMin.setBounds(181, 22, 86, 20);
panel.add(tfMin);
tfMin.setBackground(new Color(240, 255, 255));
tfMin.setColumns(10);


JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 128, 128));
panel_1.setBorder(new TitledBorder(null, "Naru\u010Divanje proizvoda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel_1.setBounds(362, 93, 328, 257);
contentPane.add(panel_1);



panel_1.setLayout(null);
JButton btnNarui = new JButton("Naru\u010Di");
btnNarui.setBackground(new Color(50, 205, 50));
btnNarui.setBounds(10, 217, 308, 29);
panel_1.add(btnNarui);
btnNarui.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	
	int cena=0,kolicina=0,sifra=0,iznos=0;
	
	try {
		cena=Integer.parseInt(tfCena.getText());
		kolicina=Integer.parseInt(tfKolicina.getText());
		sifra=Integer.parseInt(tfSifra.getText());
	}
	catch (Exception et) {
		JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
		}
		iznos=cena*kolicina;
		int kolicina1=0;
		String naziv="",vrsta="",tip="";
	try {
		Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
		 PreparedStatement st1 = con1.prepareStatement("Select Sifra, Naziv, Cena, Kolicina, VrstaZivotinje,TipProizvoda from Proizvodi where Sifra=? ");
		 st1.setInt(1, sifra);
		 ResultSet rs=st1.executeQuery();
		 
		 while(rs.next())
		 {
		 sifra=rs.getInt("Sifra");
		 cena=rs.getInt("Cena");
		 kolicina1=rs.getInt("Kolicina");
		 naziv=rs.getString("Naziv");
		 vrsta=rs.getString("VrstaZivotinje");
		 tip=rs.getString("TipProizvoda");
		 }
		 
		 Connection con = DriverManager.getConnection("jdbc:ucanaccess://baza.accdb");
		 PreparedStatement st = con.prepareStatement("INSERT INTO Narudzbine (Naziv, Cena, Kolicina, VrstaZivotinje, TipProizvoda,UkupanIznos,Sifra, KorisnickoIme)VALUES(?,?,?,?,?,?,?,?)");
		 st.setString(1, naziv);
		 st.setInt(2, cena);
		 st.setInt(3, kolicina);
		 st.setString(4, vrsta);
		 st.setString(5, tip);
		 st.setInt(6, iznos);
		 st.setInt(7, sifra);
		 st.setString(8, korisnickoIme);
		 st.executeUpdate();
	
}
	catch(Exception ex) {
		ex.printStackTrace();
	}}
});


btnNarui.setForeground(new Color(0, 0, 0));
btnNarui.setFont(new Font("Tahoma", Font.BOLD, 16));
tfKolicina = new JTextField();
tfKolicina.setBounds(192, 110, 86, 20);
panel_1.add(tfKolicina);
tfKolicina.setColumns(10);

JLabel lblUnesieljenuKoliinu = new JLabel("Unesi \u017Eeljenu koli\u010Dinu: ");
lblUnesieljenuKoliinu.setBounds(10, 112, 142, 14);
panel_1.add(lblUnesieljenuKoliinu);
lblUnesieljenuKoliinu.setForeground(new Color(0, 0, 0));
lblUnesieljenuKoliinu.setFont(new Font("Tahoma", Font.BOLD, 12));


JLabel lblUnesiSifruProizvoda = new JLabel("\u0160ifra proizvoda:");
lblUnesiSifruProizvoda.setBounds(40, 27, 112, 44);
panel_1.add(lblUnesiSifruProizvoda);
lblUnesiSifruProizvoda.setForeground(new Color(0, 0, 0));
lblUnesiSifruProizvoda.setFont(new Font("Tahoma", Font.BOLD, 12));


tfSifra = new JTextField();
tfSifra.setBounds(40, 68, 105, 20);
panel_1.add(tfSifra);
tfSifra.setColumns(10);
JLabel lblCena = new JLabel("Cena:");
lblCena.setFont(new Font("Tahoma", Font.BOLD, 12));
lblCena.setBounds(220, 42, 46, 14);
panel_1.add(lblCena);
tfCena = new JTextField();
tfCena.setColumns(10);
tfCena.setBounds(173, 68, 105, 20);
panel_1.add(tfCena);
tfIznos = new JTextField();
tfIznos.setBounds(114, 175, 86, 20);
panel_1.add(tfIznos);
tfIznos.setColumns(10);
JButton btnIzraunaj = new JButton("Izra\u010Dunaj ukupnu cenu:");
btnIzraunaj.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int cena=0,kolicina=0;
		try {
			cena=Integer.parseInt(tfCena.getText());
			kolicina=Integer.parseInt(tfKolicina.getText());
		}
		catch (Exception et) {
			JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom unosa");
			}
		int iznos=0;
		iznos=cena*kolicina;
		tfIznos.setText(Integer.toString(iznos));
	}
});
btnIzraunaj.setForeground(new Color(0, 0, 0));
btnIzraunaj.setFont(new Font("Tahoma", Font.BOLD, 11));
btnIzraunaj.setBounds(73, 141, 172, 23);
panel_1.add(btnIzraunaj);

JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setBounds(10, 475, 565, 232);
contentPane.add(scrollPane_1);
table_1 = new JTable();
table_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		DefaultTableModel model= (DefaultTableModel) table_1.getModel();
		int selectedRowIndex=table_1.getSelectedRow();
		
		tfSifra.setText(model.getValueAt(selectedRowIndex, 0).toString());
		tfCena.setText(model.getValueAt(selectedRowIndex, 2).toString());
		
		
	}
});
scrollPane_1.setViewportView(table_1);
JLabel lblSelektujteProizvodKoji = new JLabel("Selektujte proizvod koji zelite da narucite:");
lblSelektujteProizvodKoji.setForeground(new Color(0, 0, 0));
lblSelektujteProizvodKoji.setFont(new Font("Tahoma", Font.BOLD, 16));
lblSelektujteProizvodKoji.setBounds(23, 395, 364, 69);
contentPane.add(lblSelektujteProizvodKoji);
}
}