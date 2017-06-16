package view;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

 
public class ViewPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Image SpriteBonhomme;
	//Image img = SpriteBonhomme;
	int x1 = this.getWidth()/4;
    int y1 = this.getHeight()/4; 
	
  public void paintComponent(Graphics g){
    try {
    	Image img = ImageIO.read(new File("D:/Projet JAVA/WorkEnv/DIAMANT.PNG"));
      //Pour une image de fond
      //g.drawImage(img, 50, 50, this);
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    	//g.drawImage(x1, y1, this.getWidth()/2, this.getHeight()/2);
    } catch (IOException e) {
      e.printStackTrace();
    }     
                         
    
    
  }
             
}
