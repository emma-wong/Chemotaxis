 //declare bacteria variables here   
 Bacteria [] colony;
 void setup()   
 {     
 	//initialize bacteria variables here
 	size(400,400);

 	colony = new Bacteria[800];
 	for(int i=0; i<colony.length; i++)
 	{
 		colony[i] = new Bacteria();
 	}
 	//frameRate(50);
 } 
 void draw()   
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
 	int bSize;
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
 		bSize = (int)(Math.random()*10)+1;
 	}    
	void move()
	{
		myX = myX + (int)(Math.random()*5)-2;
		myY = myY + (int)(Math.random()*5)-2;
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
 	void show()
 	{
 		stroke(3);
 		fill(bcolorr, bcolorg, bcolorb, 500);
		ellipse(myX, myY, bSize, bSize); 
 		noStroke();		
		fill(255,0,0);
		//ellipse(mouseX, mouseY, 15, 15);
 	}	
}

