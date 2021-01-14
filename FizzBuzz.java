
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class FizzBuzz {
    public static void main(String args[]){
        //Tom Scott Video: https://www.youtube.com/watch?v=QPZ0pIK_wsc
        //Need to find a way check if a certain number is a multiple of another number
        //Show a word if the condition is true
        //Need to find a way to make if scalable, put more conditions on the problem
        
        //Creating variables
        Scanner myObj = new Scanner(System.in);  
            //To make it scalable I used to arraylists in sinc to store user input
        ArrayList<Integer> numbers = new ArrayList(); 
        ArrayList<String> words = new ArrayList(); 
        int iterations;
        int choice=1;
        int index= 1;
        boolean showedWord;
                
        //Setting the game up
        System.out.println("Enter the desired number of iterations");
        iterations = Integer.parseInt(myObj.nextLine());  
        //Getting the conditions from the user
        System.out.println("Choose a number");
        numbers.add(0,Integer.parseInt(myObj.nextLine()));
        System.out.println("Choose a word to be attached to "+numbers.get(0)+": ");
        words.add(0,myObj.nextLine());
        System.out.println("Do you want to enter more numbers/words (1 - Yes, 2 - No)");
        choice = Integer.parseInt(myObj.nextLine()); 
        //Loop to enable the user to enter as many conditions as desired
        for(;choice == 1; index++){ 
            System.out.println("Choose a number");
            numbers.add(index,Integer.parseInt(myObj.nextLine()));
            System.out.println("Choose a a word to be attached to "+numbers.get(index)+": ");
            words.add(index,myObj.nextLine());
            index++;
            System.out.println("Do you want to enter more number/words (1 - Yes, 2 - No)");
            choice = Integer.parseInt(myObj.nextLine());
        }
        
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Lets Begin the game");
        //The actual logic of the FizzBuzz Game
        for (int i = 1; i <= iterations; i++) { 	
            showedWord=false;
            String sentence= "";
            //Looping to check if the current number is a mutiple of a number in the Arraylist
            for (int counter = 0; counter < numbers.size(); counter++) { 		      
         	if(i%numbers.get(counter)==0){
                    //The two ArrayLists are in sinc so I can use counter to get the matching word
                    sentence += words.get(counter);
                    //Flaging that the condition has been met
                    showedWord=true;               
                }
            }
            
            //Displaying for the user
            if(!showedWord){
                System.out.println(i);
            } else {
                System.out.println(i+" - "+sentence);
            }
      }
    }
}
