//CSE 110 Online
//Assignment Number: Assignment01
//Author: Harvey Day StudentId: 1208470935
//Description: Pizza Party
package Assignment01;
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numberOfPizzas;
		int numberOfSlicesPerPizza;
		int numberOfAdults;
		int numberOfChildren;
		int numberOfSlicesPerChild;
		int numberOfSlicesLeftOver;
		
		int totalNumberOfSlices;
		int totalNumberOfSlicesPerAdult;
		int totalNumberOfSlicesPerChild;
		int pizzaSlicesPerChild;
		int slicesLeftOver;
		
		System.out.println("Number of pizzas purchased: ");
		numberOfPizzas = input.nextInt();
		System.out.println("Number of slices per pizza: ");
		numberOfSlicesPerPizza = input.nextInt();
		
		System.out.println("Number of adults: ");
		numberOfAdults = input.nextInt();
		System.out.println("Number of children: ");
		numberOfChildren = input.nextInt();
		
		
		totalNumberOfSlices = numberOfPizzas * numberOfSlicesPerPizza;
		totalNumberOfSlicesPerAdult = numberOfAdults * 2;
		totalNumberOfSlicesPerChild = totalNumberOfSlices - totalNumberOfSlicesPerAdult;
		pizzaSlicesPerChild = totalNumberOfSlices / numberOfChildren;
		slicesLeftOver = totalNumberOfSlicesPerChild % numberOfChildren;
		
		System.out.println("Total Number of Slices: " + totalNumberOfSlices);
		System.out.println("Total number of slices per adult: " + totalNumberOfSlicesPerAdult);
		System.out.println("Total number of slices available per child: " + totalNumberOfSlicesPerChild);
		System.out.println("Number of slices each will get: " + pizzaSlicesPerChild);
		System.out.println("Number of slices left-over: " + slicesLeftOver);
		
		
	}

}
