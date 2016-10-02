package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;


public class Test extends JDialog {

    public Test() {

        initUI();
    }

    public final void initUI() {
    	
    	iniMenu();

        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);

        JPanel topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(600, 100));
        
        JLabel hint = new JLabel("Melody Maker");
        hint.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        topPanel.add(hint);

        ImageIcon icon = new ImageIcon("icons/altavoces.png");
        JLabel label = new JLabel(icon);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.add(label, BorderLayout.EAST);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.gray);

        topPanel.add(separator, BorderLayout.SOUTH);

        basic.add(topPanel);
        // TOP

        JPanel medio = new JPanel(new FlowLayout(FlowLayout.LEFT));
//      JPanel medio = new JPanel(new GridLayout(1,2));
        medio.setMaximumSize(new Dimension(600, 200));
        
        JPanel claves = new JPanel();
        claves.setLayout(new GridLayout(7, 2));
        claves.setMaximumSize(new Dimension(300,200));
        
        
        //podria usar un enum para las claves
        String[] claveName ={ 
        		"Redonda", "Blanca", "Negra", "Corchea",
        		"Semicorchea", "Fusa", "Semifusa"
        	};
        
        for (String cn : claveName) {
        	JLabel labelName = new JLabel(cn);
        	JLabel labelIcon = new JLabel(new ImageIcon("icons/"+cn+".png"));
        	claves.add(labelName);
        	claves.add(labelIcon);
        	
        }
        medio.add(claves);
        
        /* TODO: FALTA EL PENTAGRAMA */
        
        basic.add(medio);
                
        // BOTTOM
        basic.add(Box.createVerticalGlue());
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton play = new JButton("Play");
        play.setMnemonic(KeyEvent.VK_P);
        JButton close = new JButton("Close");
        close.setMnemonic(KeyEvent.VK_C);

        JTextField field = new JTextField(32);
        JLabel lbl = new JLabel("Melodia");
        bottom.add(lbl);
        bottom.add(field);
        
        
        bottom.add(play);
        bottom.add(close);
        basic.add(bottom);

        bottom.setMaximumSize(new Dimension(600,0));

        setTitle("Melody Maker");
        setSize(new Dimension(650, 450));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon webIcon = new ImageIcon("icons/turntable.png");
        setIconImage(webIcon.getImage());

    }
    
    private void iniMenu() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("icons/exit24.png");

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem unMenuItem = new JMenuItem("Exit", icon);
        unMenuItem.setMnemonic(KeyEvent.VK_E);
        unMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
                ActionEvent.CTRL_MASK));
        unMenuItem.setToolTipText("Exit application");
        unMenuItem.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        file.add(unMenuItem);

        menubar.add(file);

        setJMenuBar(menubar);
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Test ex = new Test();
                ex.setVisible(true);
            }
        });
    }
}