


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class HiloPrueba extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int seg=0;
	private JProgressBar miBarra;
	
	private JTextField _txtNumeros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HiloPrueba frame = new HiloPrueba();
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
	public HiloPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		miBarra = new JProgressBar();
		miBarra.setBounds(62,60,262,35);
		contentPane.add(miBarra);
		
		_txtNumeros = new JTextField();
		_txtNumeros.setBounds(238, 128, 86, 20);
		contentPane.add(_txtNumeros);
		_txtNumeros.setColumns(10);
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  
				try
				{
				for(seg=1;seg<=100;seg++)
				{
			     miBarra.setValue(seg);
				Thread.sleep(50);
				_txtNumeros.setText(""+seg); 
				}
				}
				catch(Exception x)
				{
					
				}
			}
		});
		btnNewButton.setBounds(74, 127, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
	}
}
