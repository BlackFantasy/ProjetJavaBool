package controller;

import java.awt.Image;//libraires java
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/*
	 * (non-Javadoc) test test test 
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("'HAUT', ' BAS', 'GAUCHE' ou 'DROITE', afin de bouger");
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		Image img = null;
		/**
		 * see ControllerOrder
		 */
		switch (controllerOrder) {
		case Up:
			this.model.MoveUp();//UP
			this.view.ReUpdate();
			
			break;
		
		case Down:
			
			this.model.MoveDown();//Down
			this.view.ReUpdate();
			
			break;
		
		case Right:
			this.model.MoveRight();
			this.view.ReUpdate();
			break;
		
		case Left:
			this.model.MoveLeft();
			this.view.ReUpdate();
			
			break;
		

		default:
			try {img =ImageIO.read(new File("FRONT.png"));//if no moves : first possition
			} catch (IOException e) {e.printStackTrace();}
				this.model.BoulesetImage(img);
				this.view.ReUpdate();
			break;
		}
	}

}