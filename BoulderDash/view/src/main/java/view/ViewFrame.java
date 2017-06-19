package view;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewFrame extends JFrame {
      
	public ViewFrame(){
		
		//Définit un titre pour notre fenêtre
	    this.setTitle("Ma première fenêtre Java");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    this.setSize(2560, 1600);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	 
	    /*
	    //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(pan); */              
	    this.setVisible(true);
	    
	  } 
	
	  //JFrame fenetre = new JFrame();
   
	  /*
	    //Définit un titre pour notre fenêtre
	    fenetre.setTitle("Boulder Dash");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(2560, 1600);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Et enfin, la rendre visible        
	    fenetre.setVisible(true);
	    
	    
	    ViewPanel pan = new ViewPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    fenetre.setContentPane(pan);
	    fenetre.setVisible(true);
      */
    
  
  
 }
  
