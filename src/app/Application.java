package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;


public class Application {

	public static void main(String[] args) {
		JFrame frame = new JFrame("EL musiPlaier - PAAPA");
		frame.setSize(300, 400);
		frame.setLayout(new BorderLayout(300, 400));
		
		JButton aceptar= new JButton("Aceptar");
		JTextField inputISBN= new JTextField(20);
		frame.getContentPane().add(aceptar , BorderLayout.CENTER);
		frame.getContentPane().add(inputISBN , BorderLayout.CENTER);
		
		Container cont = frame.getContentPane();
		JComponent contentpane =(JComponent ) cont;
		contentpane.setBorder(BorderFactory.createLineBorder(Color.green));
		contentpane.setLayout ( new FlowLayout());
		JLabel labelISBN = new JLabel("que se yo", JLabel.CENTER);
		contentpane.add(labelISBN);
		contentpane.add(inputISBN);
		
		JLabel labelTit = new JLabel("El musicmaqer", JLabel.CENTER);
		JTextField inputTit= new JTextField(20);
		
		contentpane.add(labelTit);
		contentpane.add(inputTit );
		contentpane.add(aceptar);
		
		JMenuBar barraMenues = new JMenuBar();
		barraMenues.setPreferredSize(new Dimension(200, 20));
		barraMenues.add(new JMenu("Menu1"));
		barraMenues.add(new JMenu("Menu2"));
		barraMenues.add(new JMenu("Menu3"));
		frame.setJMenuBar(barraMenues);
		
		frame.setVisible(true);
		
		
	}
}
