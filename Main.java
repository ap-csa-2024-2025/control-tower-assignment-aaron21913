import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane airplane1 = new Airplane();
   Airplane airplane2 = new Airplane(AAA02, 15.8, 128, 0, 0);
   // TODO: Create a Scanner
   
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter call sign for Airplane 3");
   String callSign =  input.nextLine();
   System.out.println("Enter distance for Airplane 3");
   Double distance = input.nextDouble();
   System.out.println("Enter direction for Airplane 3");
   int direction = input.nextInt();
   System.out.println("Enter the altitude for Airplane 3");
   int altitude = input.nextInt();

   // TODO: Create Airplane 3 from inputs
   Airplane airplane3 = new Airplane(callSign, distance, direction, altitude);
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");
   
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is ");
   System.out.println("The distance between Airplane 1 and Airplane 3 is ");
   System.out.println("The distance between Airplane 2 and Airplane 3 is ");
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is ");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is ");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is ");
   
   // TODO: Airplane 1 changes
   
   // TODO: Airplane 2 changes
   
   // TODO: Airplane 3 changes
   
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is ");
   System.out.println("The distance between Airplane 1 and Airplane 3 is ");
   System.out.println("The distance between Airplane 2 and Airplane 3 is ");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is ");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is ");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is ");
  }
}
