package main;

import java.sql.SQLException;
import java.awt.Graphics;
import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;
import view.ViewPanel;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
    	ViewPanel view = new ViewPanel();
    	
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    

}
