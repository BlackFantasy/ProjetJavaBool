package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		Thread anime = new Thread(new animBoule());
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		anime.start();
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	
	/**
	 * Re definition of the method 
	 * Thread of the hero
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
	
	for(int y=0 ; y<17 ; y++)
	{
		for(int x=0; x<30 ; x++)
		{
			graphics.drawImage(this.getViewFrame().getModel().ElementFixegetImage(x, y), x*64, y*64, 64, 64, viewFrame);
		}
	}
	graphics.drawImage(this.getViewFrame().getModel().BoulegetImage(), this.getViewFrame().getModel().BoulegetX()*64, this.getViewFrame().getModel().BoulegetY()*64, 64, 64, viewFrame);
	}
	class animBoule implements Runnable{

		  public void run() {
		   int n=0;
		   Image img = null; 
		   while(true){
		    switch(n%14){
		    case 0:
		    	System.out.println("test 0");
		     try {
		      img = ImageIO.read(new File("C1.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		    case 1:
		    	//System.out.println("test 1");
		     try {
		      img = ImageIO.read(new File("C2.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		     
		    case 2 : 
		     try {
		      img = ImageIO.read(new File("C3.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		     
		    case 3 : 
		     try {
		      img = ImageIO.read(new File("C4.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		    
		    case 4 :
		     try {
		      img = ImageIO.read(new File("C5.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		     
		    case 5 : 
		     try {
		      img = ImageIO.read(new File("C6.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		     
		    case 6:
		     try {
		      img = ImageIO.read(new File("C7.png"));
		     } catch (IOException e1) {e1.printStackTrace();}
		     getViewFrame().getModel().BoulesetImage(img);
		     break;
		     
		    case 7:
			     try {
			      img = ImageIO.read(new File("C8.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 8:
			     try {
			      img = ImageIO.read(new File("C9.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 9:
			     try {
			      img = ImageIO.read(new File("C10.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 10:
			     try {
			      img = ImageIO.read(new File("C11.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 11:
			     try {
			      img = ImageIO.read(new File("C12.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 12:
			     try {
			      img = ImageIO.read(new File("C13.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
			     
		    case 13:
			     try {
			      img = ImageIO.read(new File("C14.png"));
			     } catch (IOException e1) {e1.printStackTrace();}
			     getViewFrame().getModel().BoulesetImage(img);
			     break;
		     
//		    
		    }
		    n++;
		  //  System.out.println("test 2");
		    try {
		     Thread.sleep(400);
		    } catch (InterruptedException e) {
		     e.printStackTrace();
		    }
		  //  System.out.println("test 3");
		    repaint(0,0,getWidth(),getHeight());
		   }
	  }
		  
		 }
}