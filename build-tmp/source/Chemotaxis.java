import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here   
 Bacteria [] colony;
 public void setup()   
 {     
 	//initialize bacteria variables here
 	size(300,300);

 	colony = new Bacteria[600];
 	for(int i=0; i<colony.length; i++)
 	{
 		colony[i] = new Bacteria();
 	}
 	//frameRate(50);
 } 
 public void draw()   
 {    
 	//move and show the bacteria
  	background(0, 0, 0);	
 	for (int i=0; i<colony.length; i++)
 	{
 		colony[i].show();
 		colony[i].move();
 	} 
 }  
class Bacteria    
 {     
 	//lots of java!
 	//int mouseX;
 	//int mouseY;
 	int myX;
 	int myY;
 	int bcolorr;
 	int bcolorg;
 	int bcolorb;
 	Bacteria()
 	{
 		bcolorr = (int)(Math.random()*255);
 		bcolorg = (int)(Math.random()*255);
 		bcolorb = (int)(Math.random()*255);
 		myX = 150;//(int)(Math.random()*10)+145;
 		myY = 150;//(int)(Math.random()*10)+145;
 	}    
	public void move()
	{
		myX = myX + (int)(Math.random()*3)-1;
		myY = myY + (int)(Math.random()*3)-1;
		if(myX < mouseX)
		{
			myX = myX + (int)(Math.random()*2);
			myY = myY + (int)(Math.random()*4-2);
		}
		if(myX > mouseX)
		{
			myX = myX + (int)(Math.random()*2-2);
			myY = myY + (int)(Math.random()*4-2);
		}
		if(myY < mouseY)
		{
			myY = myY + (int)(Math.random()*2);
			myX = myX + (int)(Math.random()*4-2);
		}
		if(myY > mouseY)
		{
			myY = myY + (int)(Math.random()*2-2);
			myX = myX + (int)(Math.random()*4-2);
		}
	}
 	public void show()
 	{
 		stroke(5);
 		fill(bcolorr, bcolorg, bcolorb, 500);
		ellipse(myX, myY, 5, 5); 
 		noStroke();		
		fill(255,0,0);
		ellipse(mouseX, mouseY, 15, 15);
 	}	
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
