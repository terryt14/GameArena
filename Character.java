public class Character
{
  public static void main(String[] args)
  {
    GameArena myArena = new GameArena(500,500);
    Rectangle body = new Rectangle(250.0,250.0,40.0,20.0,"RED");
    Rectangle top = new Rectangle(250.0,240.0,25.0,10.0,"RED");
    Ball leftWheel = new Ball(240.0,270.0,10,"GREY");
    Ball rightWheel = new Ball(260.0,270.0,10,"GREY");
    myArena.addBall(leftWheel);
    myArena.addBall(rightWheel);
    myArena.addRectangle(body);
    myArena.addRectangle(top);
    double xPos;
    double yPos;
    Rectangle cone1 = new Rectangle(150.0,154.0,10.0,10.0,"ORANGE");
    Rectangle cone2 = new Rectangle(150.0,153.0,8.0,10.0,"ORANGE");
    Rectangle cone3 = new Rectangle(150.0,152.0,6.0,10.0,"WHITE");
    Rectangle cone4 = new Rectangle(150.0,151.0,4.0,10.0,"WHITE");
    Rectangle cone5 = new Rectangle(150.0,150.0,2.0,10.0,"ORANGE");
    myArena.addRectangle(cone1);
    myArena.addRectangle(cone2);
    myArena.addRectangle(cone3);
    myArena.addRectangle(cone4);
    myArena.addRectangle(cone5);
    
    int XMult = 1;
		int YMult = 1;
		while(i > 0)
		{
			xpos = cone1.getXPosition();
			xpos = xpos + (XMult * 2.5);
			cone1.setXPosition(xpos);
			ypos = cone1.getYPosition();
			ypos = ypos + (YMult * 2.5);
			cone1.setYPosition(ypos);
      xpos = cone2.getXPosition();
			xpos = xpos + (XMult * 2.5);
			cone2.setXPosition(xpos);
			ypos = cone2.getYPosition();
			ypos = ypos + (YMult * 2.5);
			cone2.setYPosition(ypos);
      xpos = cone3.getXPosition();
			xpos = xpos + (XMult * 2.5);
			cone3.setXPosition(xpos);
			ypos = cone3.getYPosition();
			ypos = ypos + (YMult * 2.5);
			cone3.setYPosition(ypos);
      xpos = cone4.getXPosition();
			xpos = xpos + (XMult * 2.5);
			cone4.setXPosition(xpos);
			ypos = cone4.getYPosition();
			ypos = ypos + (YMult * 2.5);
			cone4.setYPosition(ypos);
      xpos = cone5.getXPosition();
			xpos = xpos + (XMult * 2.5);
			cone5.setXPosition(xpos);
			ypos = cone5.getYPosition();
			ypos = ypos + (YMult * 2.5);
			cone5.setYPosition(ypos);
			if (xpos >= 500)
			{
				XMult = -1;
			}
			if (xpos <= 0)
			{
				XMult = 1;
			}
			if (ypos >= 500)
			{
				YMult = -1;
			}
			if (ypos <= 0)
			{
				YMult = 1;
			}
			myArena.pause();
			}
  }
}
