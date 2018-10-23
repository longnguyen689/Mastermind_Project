import java.io.*;
public class MasterMind{
  public static void main(String[] args){
    System.out.printf("hello world");
  }



}

public class colorList{
  protected String red, blue, green, yellow, orange, purple;
  public void displayList(){
    System.out.println(red);
    System.out.println(blue);
    System.out.println(green);
    System.out.println(yellow);
    System.out.println(orange);
    System.out.println(purple);
  }
}

public class mystoriousColor extends colorList{
  private String color;

  public void generateRandom(){

  }
}
