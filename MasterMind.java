package mastermind; //use in NetBeans
//package side_project;
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
enum Result
{
BLACK, WHITE, NONE;
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
    
    public static final int NUM_COLOR = 4;
    
    public static void CheckResult(Color[] hidden, Color[] input)
    {
        
        int black = 0, white = 0, i = 0, j = 0;
        Result[] result = new Result[NUM_COLOR];
        String[] inputCopy = new String[NUM_COLOR];
        String[] hiddenCopy = new String[NUM_COLOR];
        
        //CHECK POSITION AND COLOR
        for(i = 0; i < NUM_COLOR; i++)
        {
            
            if( input[i].equals(hidden[i]))
            {
                black++; //count number of matching color and position
            }
            else{ //not black then save to an other arr for check color
                inputCopy[j] = input[i].toString();
                hiddenCopy[j] = hidden[i].toString();
                j++;
            }
        }
        
        //CHECK FOR MATCHING COLOR
        for(i = 0; i < NUM_COLOR-black; i++){
            for(j = 0; j < NUM_COLOR-black; j++){
                if(inputCopy[i].equals(hiddenCopy[j])){
                    white++;//count number of matching color, exclude the one that already mark as black
                }
            }
        }
        //FILL RESULT
        for(i = 0; i < black; i++){
            result[i] =  Result.BLACK;
        }
        for(i = black; i < white; i++){
            result[i] = Result.WHITE;
        }
        
        //FILL THE REST OF RESULT WITH NONE
        if(black + white < NUM_COLOR){
            int nextIndex = black+white;
            for(i = nextIndex; i < NUM_COLOR; i++){
                result[i] = Result.NONE;
            }
        }
        //PRINT OUT FOR TESTING
        System.out.printf("RESULT: ");
        for (i = 0; i < NUM_COLOR; i++) {
            System.out.printf("%s ", result[i]);
        }
        
    }
    
    
    public static void main(String[] args)
    {
        Color c1 = Color.RED; //initialize an object of Color class
        c1.DisplayAllColors(); //display all colors at the beginning of the game
        /*
         //print a list of random numbers
         System.out.println("\ngetRandomColor():");
         for (int i = 0; i < 4; i++) {
         System.out.printf("%s ", Color.getRandomColor());
         }
         System.out.println();
         
         System.out.println("\nHiddenColor():");
         Color[] hidden = Color.values();
         HiddenColors(hidden);
         */
        
        //for checking purpose only :)
        Color[] hidden_test = new Color[NUM_COLOR];
        Color[] input_test = new Color[NUM_COLOR];
        System.out.printf("HIDEN: ");
        for (int i = 0; i < NUM_COLOR; i++) {
            
            hidden_test[i] = Color.getRandomColor();
            System.out.printf("%s ", hidden_test[i]);
        }
        System.out.printf("\n");
        System.out.printf("INPUT: ");
        for (int i = 0; i < NUM_COLOR; i++) {
            
            input_test[i] = Color.getRandomColor();
            System.out.printf("%s ", input_test[i]);
        }
        System.out.printf("\n");
        CheckResult(hidden_test,input_test);
    }
    
}
