package view;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

 
public class ViewPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
  public void paintComponent(Graphics g){
    try {
    	
    	Image img = ImageIO.read(new File("/Users/Peter/Documents/Ecole/eXia/UE - Java/Projet/sprite personnage/FRONTTHU5.PNG"));
      //Pour une image de fond
      g.drawImage(img, 0, 0, this.getWidth()/28, this.getHeight()/9, this);
    } catch (IOException e) {
      e.printStackTrace();
    }     
                         
    
    
  }
             
}
