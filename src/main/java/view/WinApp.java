package view;
import controller.PersonManagement;
import controller.PersonManagementTxtFile;
import model.Person;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
public class WinApp {
	final static JFrame win = new JFrame("Gestione Persone");	// finestra
	final static Container ctx = WinApp.win.getContentPane();				// contenuto finestra
	final static JPanel inputPane = new JPanel(); 					// pannello inserimento persona
	final static JButton addButton = new JButton("➕");		// bottone aggiunta persona
	final static JButton delButton = new JButton("❌");		// bottone elimina persona
	final static JTextField firstnameField = new JTextField(10);	// nome
	final static JTextField lastnameField = new JTextField(10);		// cognome
	// casella età
	final static JSpinner ageField = new JSpinner(new SpinnerNumberModel(0, 0, 120, 1));
	// tabella persone - Inizializzata al suo titolo
	final static JTable peopleTab = new JTable(new DefaultTableModel(new String[]{"Firstname", "Lastname", "Age"}, 0));
	// contenuto tabella (righe)
	final static DefaultTableModel peopleTabModel = (DefaultTableModel) WinApp.peopleTab.getModel();
	// lista di persone
	final static PersonManagement people = new PersonManagementTxtFile();
 	private static void drawInputPane() {
		WinApp.inputPane.setLayout(new GridLayout(4, 2));
		WinApp.inputPane.add(new JLabel("Firstname:"));
		WinApp.inputPane.add(WinApp.firstnameField);
		WinApp.inputPane.add(new JLabel("Lastname:"));
		WinApp.inputPane.add(WinApp.lastnameField);
		WinApp.inputPane.add(new JLabel("Age:"));
		WinApp.inputPane.add(WinApp.ageField);
		WinApp.addButton.addActionListener(e -> {
			try {
				Person newPerson = new Person(
					WinApp.firstnameField.getText().strip(),
					WinApp.lastnameField.getText().strip(),
					(Integer) WinApp.ageField.getValue()
				);
				if (WinApp.people.addPerson(newPerson)) {
					WinApp.updateTable();
					WinApp.firstnameField.setText("");
					WinApp.lastnameField.setText("");
					WinApp.ageField.setValue(0);
				} else
					JOptionPane.showMessageDialog(WinApp.win, "Person already exists!");
			} catch (Throwable ex) {
				JOptionPane.showMessageDialog(WinApp.win, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		WinApp.inputPane.add(WinApp.addButton);
		WinApp.delButton.addActionListener(e -> {
			int selectedRow = WinApp.peopleTab.getSelectedRow();
			if (selectedRow != -1) {
				WinApp.people.remove(selectedRow);
				WinApp.updateTable();
			} else {
				JOptionPane.showMessageDialog(WinApp.win, "No person selected for deletion!");
			}
		});
		WinApp.inputPane.add(WinApp.delButton);
	}
	// disegno Finestra
	private static void drawWindow() {
		WinApp.win.setIconImage(Toolkit.getDefaultToolkit().getImage( "img/family.png").getScaledInstance(32,32, Image.SCALE_SMOOTH));
		WinApp.win.setBounds(100, 100, 400, 275);
		WinApp.win.setResizable(false);
		WinApp.win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WinApp.win.setIconImage(null);

		WinApp.ctx.setLayout(new BorderLayout());
		WinApp.updateTable();
		WinApp.ctx.add(new JScrollPane(WinApp.peopleTab), BorderLayout.CENTER);
		WinApp.drawInputPane();
		WinApp.ctx.add(WinApp.inputPane, BorderLayout.NORTH);

		WinApp.win.setVisible(true);
	}
	// modifica contenuto tabella
	private static void updateTable() {
		WinApp.peopleTabModel.setRowCount(0);
		WinApp.people.getPeople().forEach(p -> WinApp.peopleTabModel.addRow(new Object[]{
			p.getFirstname(),
			p.getLastname(),
			p.getAge()
		}));
	}
	// contructor - Disegna Finestra
	public WinApp() {
		WinApp.drawWindow();
	}
	public static void main(String[] args) {
		// invoco apertura finestra
		SwingUtilities.invokeLater(WinApp::new);
	}
}