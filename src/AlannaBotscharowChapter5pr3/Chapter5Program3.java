package AlannaBotscharowChapter5pr3;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 11/18
 * Hex number converter.
 */
public class Chapter5Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to enter a number between 0 and 15.
		
			System.out.println("Please enter an integer between 0 and 15");
			
			
			
			
			//user inputs
			
			int num = input.nextInt(); 
			
			
			
			//if statements. 
				//display corresponding hex number. 
			
				if (num == 0) {
					System.out.println("The hex value for " + num + " is 0");
				}
				else if (num == 1){
					System.out.println("The hex value for " + num + " is 1");
				}
				else if (num == 2){
					System.out.println("The hex value for " + num + " is 2");
				}
				else if (num == 3){
					System.out.println("The hex value for " + num + " is 3");
				}
				else if (num == 4){
					System.out.println("The hex value for " + num + " is 4");
				}
				else if (num == 5){
					System.out.println("The hex value for " + num + " is 5");
				}
				else if (num == 6){
					System.out.println("The hex value for " + num + " is 6");
				}
				else if (num == 7){
					System.out.println("The hex value for " + num + " is 7");
				}
				else if (num == 8){
					System.out.println("The hex value for " + num + " is 8");
				}
				else if (num == 9){
					System.out.println("The hex value for " + num + " is 9");
				}
				else if (num == 10){
					System.out.println("The hex value for " + num + " is A");
					
				}
				else if (num == 11){
					System.out.println("The hex value for " + num + " is B");
				}
				else if (num == 12){
					System.out.println("The hex value for " + num + " is C");
				}
				else if (num == 13){
					System.out.println("The hex value for " + num + " is D");
				}
				else if (num == 14){
					System.out.println("The hex value for " + num + " is E");
				}
				else if (num == 15){
					System.out.println("The hex value for " + num + " is F");
				}
				else {
					System.out.println("Make sure that you are entering a NUMBER between 0 and 15!");
				}
				
				
				
				
	}

}
