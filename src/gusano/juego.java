package gusano;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class juego extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JLabel lblO;
	hilo h = new hilo("Arriba", lblO);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juego frame = new juego();
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
	public juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblO = new JLabel("O");
		lblO.addKeyListener(this);
		lblO.setBounds(106, 102, 17, 14);
		contentPane.add(lblO);
		this.addKeyListener(this);
	}

	public void keyPressed(KeyEvent arg0) {
		if(arg0.getSource() == this)
			mBotones(arg0);
			
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
	}
	@SuppressWarnings({ "deprecation", "deprecation" })
	void mBotones(KeyEvent e){
		
		
		int a = e.getKeyCode();
		
		h.stop();
			if(a == 38 )//arriba
				{
				
				h = new hilo("Arriba", lblO);
				
				}
				
				
			if(a == 40 )//abajo
			{
				
				h = new hilo("abajo", lblO);
				
				}
			if(a == 37 )//i
			{
				
				h = new hilo("i", lblO);
			
				}
			if(a == 39 )//d
			{
				
				h = new hilo("d", lblO);
				h.start();
				
				}
		
		
	}
	
}
