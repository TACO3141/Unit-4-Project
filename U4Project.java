import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class U4Project
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Exception Caught: Matrix.Backend.Main.UserNotRecognizedException: Biometric failure. Manual Override Intiated.\n...");
    try
      {
        TimeUnit.SECONDS.sleep(3);
      }
    catch(InterruptedException e)
      {
      }
    System.out.println("Override Successful. Welcome, administrator. Data corrupted. Enter new password:");
    String password = scan.nextLine();
    System.out.println("\nPassword contains " +  password.length() + " characters.\n");
    String backwardsPassword = "";
    char[] arr = password.toCharArray();
    int highIndex = arr.length - 1;
    int lowIndex = 0;
    char temporary = 'a';
    while (lowIndex < highIndex)
    {
      temporary = arr[highIndex];
      arr[highIndex] = arr[lowIndex];
      arr[lowIndex] = temporary;
      highIndex --;
      lowIndex ++;
    }
    for (int i = 0; i < arr.length; i++)
    {
      backwardsPassword = backwardsPassword + arr[i];
    }
    System.out.println("Backwards password:\n" + backwardsPassword + "\n");
    System.out.println("Enter method:\n{S} - Scramble\n{X} - Sort");
    //Implement a sorting system!!!!!!! 😛
  }
}
