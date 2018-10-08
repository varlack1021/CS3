import java.util.Scanner;

/*
 *Recursive version of binary search
*/
public class BinarySearchRecursion {

  public static void main (String args[]) {

    System.out.println("Pick a number between 0 and 1000000");
    System.out.println("Answer the following question press Y for yes and press any key for no");
    System.out.println("Your number was: " + recursively(100, 0));
  }

//-----------------------------------------------------------------------------
 /*
  *Continiously cuts the search field in half until the differnce betwween max and min is zero or 1s
 */
  public static int recursively(int max, int min) {

    System.out.println("Greater than " + ( max + min ) / 2);

    Scanner in = new Scanner(System.in);
    String answer = in.next();

    if (max - min == 0 && max - min != 1)
    return max;

    else if (answer.equalsIgnoreCase("Y"))
    return recursively(max, ((max + min) / 2));

    else
    return recursively(((max + min)) / 2 , min);
  }
}
