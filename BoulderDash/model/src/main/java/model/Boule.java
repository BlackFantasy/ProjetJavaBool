package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Boule  {
	private int x;//les positions
	private int y;
	private Image img; //variable pour l image de lorann
	
	
	Boule(int x,int y,Image imge)
	{
		this.x = x;
		this.y = y ;
		this.img = imge;
		
	}
	
	Boule()
	{
		System.out.println("La classe boule merde");
	}

	public int getX() {//prend les positions
		return x;
	}
	public void setX(int x) {
		this.x = this.x+x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = this.y + y;
	}
	public Image getImg() {
		
		
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void ResetX(int x) {
		this.x =  x;
	}
	public void ResetY(int y) {
		this.y =  y;
	}}