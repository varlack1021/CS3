import java.util.Scanner;

/*
 *Iterative method for Binary BinarySearch
 *
 */

public class BinarySearch {
static int max = 1000000;
static int min = 0;
  public static void main(String args[]) {

    System.out.println("\nPick a number between " + min + " and " + max + "\nAnswer the following questions and the prorgram will find your number");
    System.out.println("Press Y for yes and press N for No\n");

//Continiously shrinks the search field until the difference between max and min is zero and the difference is 1

    while (max - min != 0 && max - min != 1)
    {

      System.out.println("Is your number greater than: " + ((max + min)/2) + "?");
      run();

    }

    System.out.println("Your number was: " + max);
  }

//----------------------------------------------------
/*
 *Shrinks the search field as the user answers questions and cuts the search field in half
 *Updates the max and min global variables
*/
  public static void shrinkField(String response) {

    if(response.equalsIgnoreCase("Y")) {

    min = (max + min ) /2;

  } else {
    max = (max + min) /2;
  }
}
//---------------------------------------------------------

/*
 *Runs the shrinkField method
*/
  public static void run() {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    shrinkField(input);
  }
}

//---------------------------------------------------------
