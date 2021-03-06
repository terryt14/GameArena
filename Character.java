public class Character
{
  public static void main(String[] args)
  {
    GameArena myArena = new GameArena(500,500);
    Rectangle topGrass = new Rectangle(250.0,40.0,500.0,80.0,"GREEN");
    Rectangle bottomGrass = new Rectangle(250.0,460.0,500.0,80.0,"GREEN");
    myArena.addRectangle(topGrass);
    myArena.addRectangle(bottomGrass);
    Rectangle body = new Rectangle(250.0,250.0,40.0,20.0,"RED");
    Rectangle top = new Rectangle(250.0,240.0,25.0,10.0,"RED");
    Ball leftWheel = new Ball(240.0,270.0,10,"GREY");
    Ball rightWheel = new Ball(260.0,270.0,10,"GREY");
    myArena.addBall(leftWheel);
    myArena.addBall(rightWheel);
    myArena.addRectangle(body);
    myArena.addRectangle(top);
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
    double xpos;
    double ypos;
    double xcar = 0;
    double ycar = 0;
    double xconemin = 0;
    double xconemax = 0;
    double yconemin = 0;
    double yconemax = 0;
    double xcone = 500;
    double ycone = 500;
    double XMult = 2;
    double YMult = 1;
    while(true)
	{
	  xpos = cone1.getXPosition();
	  xpos = xpos + (XMult * 2.5);
	  cone1.setXPosition(xpos);
	  xcone = xpos;
	  xconemin = xcone - 10;
	  xconemax = xcone + 10;
	  ypos = cone1.getYPosition();
	  ypos = ypos + (YMult * 2.5);
	  cone1.setYPosition(ypos);
	  ycone = ypos;
	  yconemin = ycone - 10;
	  yconemax = ycone + 10;
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
	  if (myArena.upPressed())
	  {
	  if (ycar > 0)
	  {
		ypos = body.getYPosition();
		ypos = ypos - 3.5;
		body.setYPosition(ypos);
		ycar = ypos;

		ypos = top.getYPosition();
		ypos = ypos - 3.5;
		top.setYPosition(ypos);

		ypos = leftWheel.getYPosition();
		ypos = ypos - 3.5;
		leftWheel.setYPosition(ypos);

		ypos = rightWheel.getYPosition();
		ypos = ypos - 3.5;
		rightWheel.setYPosition(ypos);
	  }
	  }
	  if (myArena.downPressed())
	  {
	  if (ycar < 500)
	  {
		ypos = body.getYPosition();
	    ypos = ypos + 3.5;
	    body.setYPosition(ypos);
	    ycar = ypos;
		
		ypos = top.getYPosition();
	    ypos = ypos + 3.5;
	    top.setYPosition(ypos);
		
		ypos = leftWheel.getYPosition();
	    ypos = ypos + 3.5;
	    leftWheel.setYPosition(ypos);
		
		ypos = rightWheel.getYPosition();
	    ypos = ypos + 3.5;
	    rightWheel.setYPosition(ypos);
	    }
      }
      if (myArena.rightPressed())
	  {
	  if (xcar < 500)
	  {
		xpos = body.getXPosition();
	    xpos = xpos + 3.5;
	    body.setXPosition(xpos);
	    xcar = xpos;
		
		xpos = top.getXPosition();
	    xpos = xpos + 3.5;
	    top.setXPosition(xpos);
		
		xpos = leftWheel.getXPosition();
	    xpos = xpos + 3.5;
	    leftWheel.setXPosition(xpos);
		
		xpos = rightWheel.getXPosition();
	    xpos = xpos + 3.5;
	    rightWheel.setXPosition(xpos);
	    }
	}
	if (myArena.leftPressed())
	  {
	  if (xcar > 0)
	  {
		xpos = body.getXPosition();
	    xpos = xpos - 3.5;
	    body.setXPosition(xpos);
	    xcar = xpos;
		
		xpos = top.getXPosition();
	    xpos = xpos - 3.5;
	    top.setXPosition(xpos);
		
		xpos = leftWheel.getXPosition();
	    xpos = xpos - 3.5;
	    leftWheel.setXPosition(xpos);
		
		xpos = rightWheel.getXPosition();
	    xpos = xpos - 3.5;
	    rightWheel.setXPosition(xpos);
	    }
	}
	if ((xconemin < xcar) && (xcar < xconemax) && (yconemin < ycar) && (ycar < yconemax))
		break;
	myArena.pause();
	}
  }
}
