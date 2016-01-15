/**
 * @author Luis Garcia
 * @version 1.0
 * Clase donde se crea la ventana de la calculadora
 *
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("numero 1");
	private JLabel lbN2= new JLabel("numero 2");
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	private Operaciones op = new Operaciones();
	
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}

	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);

		lbN2.setBounds(10,80, 280, 30);
		txtN2.setBounds(10, 120, 280, 30);

		
		btnCalcular.setBounds(10, 170, 280, 30);
		
		lbResultado.setBounds(10,200, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int r = op.sumar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		lbResultado.setText(String.format("%s + %s = %d", txtN1.getText(), txtN2.getText(), r)); 		
	}
}
