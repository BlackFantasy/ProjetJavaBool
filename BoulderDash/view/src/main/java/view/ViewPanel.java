package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class ViewPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image SpriteBonhomme;
	//Image img = SpriteBonhomme;
	
  public void paintComponent(Graphics g){
    try {
    	Image img = ImageIO.read(new File("C8.PNG"));
      //Pour une image de fond
      g.drawImage(img, 0, 0, this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}
