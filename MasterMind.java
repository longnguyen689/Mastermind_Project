package mastermind; //use in NetBeans
import java.io.*;
import java.lang.Enum;
import java.util.Random;
import java.util.Scanner;

enum Color
{
  RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE; //declare color constants

  public void DisplayAllColors()
  { //assign colors to an array and print
    Color[] arr = Color.values(); 
    for(Color col : arr){
        //System.out.print(col + " ");
        System.out.printf("%s ", col);
    }
        System.out.println();
  }
  
  public static Color getRandomColor()
  {
    Random random = new Random(); //create an instance of Random class
    return values()[random.nextInt(values().length)]; //then invoke nextInt() using that instance
    //values() is of enum. returning any value in values()
  }
  

}

public class MasterMind
{
    public static void HiddenColors(Color[] arr)
    {/*will call getRandomColor()
      *will need an array to store random colors
      *to easily compare the result.
      *Safer to store the generated somewhere until the game finishes*/

        for(int i = 0; i < 4; i++){
            arr[i] = Color.getRandomColor();
        }
        for(int i = 0; i < 4; i++){
            System.out.printf("%s ", arr[i]);
        }
    }
    
    public static void Trials(Color[] arr)
    {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter 4 colors: ");
        
        String[] trialColor = new String[4];
        for(int i = 0; i < trialColor.length; i++){
            trialColor[i] = scan.nextLine();
            
        }
        
        
    }
    
    
    public static void main(String[] args)
    {
        Color c1 = Color.RED; //initialize an object of Color class
        c1.DisplayAllColors(); //display all colors at the beginning of the game

        //print a list of random numbers
        System.out.println("\ngetRandomColor():");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s ", Color.getRandomColor());
        }
        System.out.println();
        
        System.out.println("\nHiddenColor():");
        Color[] hidden = Color.values();
        HiddenColors(hidden);
  }

}