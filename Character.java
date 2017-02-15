public class Character
{
  public static void main(String[] args)
  {
    GameArena myArena = new GameArena(500,500);
    Rectangle body = new Rectangle(250.0,250.0,40.0,20.0,"RED");
    Rectangle top = new Rectangle(250.0,270.0,25.0,10.0,"RED");
    Ball leftWheel = new Ball(260.0,230.0,10,"GREY");
    Ball rightWheel = new Ball(240.0,230.0,10,"GREY");
    myArena.addBall(leftWheel);
    myArena.addBall(rightWheel);
    myArena.addRectangle(body);
    myArena.addRectangle(top);
    double xPos;
    double yPos;
  }
}
