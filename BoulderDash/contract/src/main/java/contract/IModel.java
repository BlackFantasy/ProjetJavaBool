package contract;

import java.awt.Image;
import java.io.IOException;
import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {//

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	void loadMessage(String key);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	

	void cpt(int i);

	int BoulegetX();//initiate the X of the hero
	int BoulegetY();//initiate the Y of the hero
	Image HerogetImage();//getting the Hero image
	void BoulesetX(int x);
	void BoulesetY(int y);
	void BoulesetImage(Image img);
	Image ElementFixegetImage(int x, int y);
	boolean ElementFixegetPenetrable(int x,int y);
	boolean ElementFixegetRecuperable(int x,int y);
	void ElementFixedisableSprite(int x,int y);//init the disable sprite
	void MoveRight();//movements
	void MoveLeft();
	void MoveUp();
	void MoveDown();
	void Nothing();

	Image BoulegetImage();//getting boule image

	

}