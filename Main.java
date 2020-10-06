import java.util.Scanner;

/**
 * Calculates the amount gained from interest over years
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user for the balance of the bank account
    System.out.println("Please enter a starting balance");
    double userBalance = input.nextDouble();

    //ask the user for the banks interest rate
    System.out.println("Please enter your interest rate");
    double userInterest = input.nextDouble();

    //asks the user how long they will be investing
    System.out.println("Please enter the number of years you will invest for");
    int userInvestYears = input.nextInt();

    //turns the interest rate from a percentage to a decimal 
    double interestRate = userInterest / 100;

    //Stores the interest gained from the balance * the interest rate
    double userInterestGain = 0;

    //runs until i reaches the userInvestYears
    for(int i = 1; i <= userInvestYears; i++){
      //loop action: multiplies the users balnce with the banks interest rate to get the amount of interest they will make
      userInterestGain = userBalance * interestRate;
      //loop action: adds the users balance with the amount of interest they made
      userBalance = userBalance + userInterestGain;
    }

    //prints the final balance to the screen
    System.out.println("Your final balance would be $" + userBalance);
    
  }
}
