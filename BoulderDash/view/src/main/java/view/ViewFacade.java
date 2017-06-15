package view;

import javax.swing.JOptionPane;

import contract.IView;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

/*Arnaud la plus belle mdr ég
 * 
 */

public class ViewFacade implements IView {

    // peter est trop bo
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeWindow() {
		// TODO Auto-generated method stub
		
	}

}
