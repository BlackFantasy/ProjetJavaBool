package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;
import javax.imageio.ImageIO;
import contract.IModel;
import java.awt.Graphics;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	private int compteur =0;
	private Image image = null;
	private Boule boule;
	private char[] ch =null;
	private int cpt = 0;
	private ElementFixe[][] elementfixe = new ElementFixe[30][18];
	private Image ima =null;
	private int x;
	private int y;
	public static int level =1;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "";
		loadMessage(""+level);
		initBoule();
		System.out.println("Hero OK");
		initElementFixe(null);
	System.out.println("Elements fixes OK");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMessage(final String key) {
		try {
			
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setMessage(daoHelloWorld.find(key).getMessage());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		
		return this;
	}

	
	public void cpt(int i)
	{
		System.out.println("test");
		compteur  = compteur+i;
		System.out.println("cpt :" + compteur);
		
	}

	public void initBoule()
	{
		try {
			  image = ImageIO.read(new File("FRONT.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		boule = new Boule(1,1,image);		
	}
	public void initElementFixe(Graphics graphics)
	{	
		elementfixe = new ElementFixe[30][18];
	System.out.println("element fixe reset");
	 	ch =null;
		System.out.println("objets fixes init");
		cpt = 0;
		
		 ch = message.toCharArray();
		 System.out.println(message);
		 System.out.println("ch init");
		 System.out.println(ch[0]);
		
	for(y=0 ; y <  17;y++)
	{//System.out.println("for y init");
		 for(x=0 ; x < 30 ; x++)
		 { 	//System.out.println("x");
			 
			 switch(ch[cpt])
			 {
//			 case 'S' :
//			 try {
//				image = ImageIO.read(new File("sprite/Sortilege.png"));					
//				 	} catch (IOException e) {e.printStackTrace();}		
//			 	elementfixe[x][y] = new ElementFixe(x,y,image, false, false, 25);
//			 	elementfixe[x][y].setPenetrableOFF();
//				 break;
//				 
			 case 'C' :
				 try {
					image = ImageIO.read(new File("Exit_close.png"));						
					} catch (IOException e) {e.printStackTrace();}
				 	elementfixe[x][y] = new ElementFixe(x,y,image, false, false, 1);
				 	
				 break;
			 case '-' :
				 
				 try {
					image = ImageIO.read(new File("Wall.png"));						
					} catch (IOException e) {e.printStackTrace();}
				 	elementfixe[x][y] = new ElementFixe(x,y,image,false,false,2);
				 	
				 	
				 break;
				 
			 case '!' :	
				
				 try{
				 	image = ImageIO.read(new File("sprite/horizontal_bone.png"));					
					} catch (IOException e) {e.printStackTrace();}	
					elementfixe[x][y] = new ElementFixe(x,y,image, false,false, 3);		
					
				 break;
				 
			 case 'V' :
					
				 	try{
				 	image = ImageIO.read(new File("sprite/bone.png"));					
					} catch (IOException e) {e.printStackTrace();}	
					elementfixe[x][y] = new ElementFixe(x,y,image,false,false,4);
					
					
				 break;
				 
			 
			 case '1' :
				 System.out.println("test");
				 try{
				 	image = ImageIO.read(new File("Backgroud.png"));					
					} catch (IOException e) {e.printStackTrace();}				
					elementfixe[x][y] = new ElementFixe(x,y,image,true,false,5);
					
				 break;//
			 case'U':
				
				 try{
					 	image = ImageIO.read(new File("Dirt.png"));					
						} catch (IOException e) {e.printStackTrace();}				
						elementfixe[x][y] = new ElementFixe(x,y,image,true,true,7);
						
						break;
			 case'D':
					
				 try{
					 	image = ImageIO.read(new File("DIAMANT.png"));					
						} catch (IOException e) {e.printStackTrace();}				
						elementfixe[x][y] = new ElementFixe(x,y,image,true,true,6);
						
						break;
			 case'B':
					
				 try{
					 

					 image =ImageIO.read(new File("Backgroud.png"));
				 } catch (IOException e) {e.printStackTrace();}
				 
				 		//g.drawImage(image);
						elementfixe[x][y] = new ElementFixe(x,y,image,true,false,5);
			 case'X': 
			 
				 boule.ResetX(x);
				 boule.ResetY(y);
			 default : 
				 try{
					 	image = ImageIO.read(new File("Backgroud.png"));
						} catch (IOException e) {e.printStackTrace();}		
				 		
						elementfixe[x][y] = new ElementFixe(x,y,image,true,false,5); 
						
					 break;		 
			 		}cpt++;
			 		
			 		
	 }
	 }System.out.println("init fixe OKKKKKKKKKK");
}
	
		 
 
	
	
	
	
	
	
	
	
	public int BoulegetX()
	{	int x = boule.getX();
		return x;
	}
	public int BoulegetY()
	{
		int y = boule.getY();
		return y;
	}
	public Image BoulegetImage()
	{	
		Image ima = boule.getImg();
		return ima;
	}
	public void BoulesetX(int i)
	{	boule.setX(i);
		
	}
	public void BoulesetY(int i)
	{
		boule.setY(i);
		
	}
	public void BoulesetImage(Image img)
	{
		boule.setImg(img);
	}
	public Image ElementFixegetImage(int x, int y)
	{
		ima =elementfixe[x][y].getImg();
		return ima;
	}
	public boolean ElementFixegetPenetrable(int x,int y)
	{
		boolean Penetrable = this.elementfixe[x][y].getPenetrable();
		return Penetrable;
	}
	public boolean ElementFixegetRecuperable(int x,int y) {
		return elementfixe[x][y].getRecuperable();
	}
	public void ElementFixedisableSprite(int x,int y)
	{
		int id =elementfixe[x][y].disableSprite();
		ElementChangeState(id);
	}
	public void ElementChangeState(int id)
	{
		switch(id) 
		{
		case 1:
			level++;
			loadMessage(""+level);
			initElementFixe(null);
		case 6:
			for(y=0;y< 17;y++)
			{
				for(x=0;x< 30;x++)
				{
					if (elementfixe[x][y].getid() == 1)
					{
						elementfixe[x][y].changeState();
					}
				}
			}
			break;
			}

	}
	public void MoveUp()
	{Image img = null;
		if(ElementFixegetPenetrable(BoulegetX(), BoulegetY()-1) ==true)
		{if(ElementFixegetRecuperable(BoulegetX(), BoulegetY()-1) == true)
		{
			ElementFixedisableSprite(BoulegetX(), BoulegetY()-1);
		}
		BoulesetY(-1);
		
		try { img =ImageIO.read(new File("BACK.png"));
		} catch (IOException e) {e.printStackTrace();}
		BoulesetImage(img);
		}
	}
	public void MoveRight()
	{
		Image img = null;
		if(ElementFixegetPenetrable(BoulegetX()+1, BoulegetY()) ==true)
		{if(ElementFixegetRecuperable(BoulegetX()+1, BoulegetY()) == true)
		{
			ElementFixedisableSprite(BoulegetX()+1, BoulegetY());
		}
		BoulesetX(1);
		
		try { img =ImageIO.read(new File("RIGHT1.png"));
		} catch (IOException e) {e.printStackTrace();}
		BoulesetImage(img);
		}
	}
	public void MoveLeft()
	{
		Image img = null;
		if(ElementFixegetPenetrable(BoulegetX()-1, BoulegetY()) ==true)
		{if(ElementFixegetRecuperable(BoulegetX()-1, BoulegetY()) == true)
		{
			ElementFixedisableSprite(BoulegetX()-1, BoulegetY());
		}
		BoulesetX(-1);
		
		try { img =ImageIO.read(new File("LEFT9.png"));
		} catch (IOException e) {e.printStackTrace();}
		BoulesetImage(img);
		}
	}
	public void Nothing()
	{
		Image img = null;
		if(ElementFixegetPenetrable(BoulegetX()-1, BoulegetY()) ==false)
		{if(ElementFixegetRecuperable(BoulegetX()-1, BoulegetY()) == false)

		try { img =ImageIO.read(new File("FRONT.png"));
		} catch (IOException e) {e.printStackTrace();}
		BoulesetImage(img);
		}
	}	
	public void MoveDown()
	{
		Image img = null;
		if(ElementFixegetPenetrable(BoulegetX(), BoulegetY()+1) ==true)
		{if(ElementFixegetRecuperable(BoulegetX(), BoulegetY()+1) == true)
		{
			ElementFixedisableSprite(BoulegetX(), BoulegetY()+1);
		}
		BoulesetY(1);
		
		try { img =ImageIO.read(new File("FRONT1.png"));
		} catch (IOException e) {e.printStackTrace();}
		BoulesetImage(img);
		}
	}

	public Image HerogetImage() {
		// TODO Auto-generated method stub
		return null;
	}


	


}
