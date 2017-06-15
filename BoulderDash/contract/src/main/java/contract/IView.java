package contract;


//TODO: Auto-generated Javadoc
/**
* The Interface IView.
*/
public interface IView {						//Interface implemented by the view of the MVC
	
	void displayMessage(String message); //show the message from the DB

	/**
						 * Prints the message.
						 *
						 * @return the string
						 */
						String printMessage();			//Brings a Pop-Up which request the Player's Pseudo	
	
	/**
	 * Close window.
	 */
	void closeWindow();				//Exit the game
}
