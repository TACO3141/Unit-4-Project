import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class U4Project
{
  public static void main(String[] args)
  {
    boolean sorted = false;
    String scramble = "";
    Scanner scan = new Scanner(System.in);
    System.out.println("Exception Caught: Matrix.Admin.Main.UserNotRecognizedException: Biometric failure. Manual Override Intiated.\n...");
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
    System.out.println("Enter method:\n{S} - Scramble\n{B} - Sort");
    //I chose to make bubble sort for this project. I looked up how exactly bubble sort works, but the code is 100% from my head.
    String choice = scan.nextLine();
    if (choice.toLowerCase() == "s")
    {
      System.out.println("Scramble initiated.");
      for (int i = password.length() - 1; i >= 0; i--)
      {
        int rand = (int) (Math.random() * password.length());
        scramble += password.substring(rand, rand + 1);
        password = password.substring(0, rand) + password.substring(rand + 1);
      }
      System.out.println("Password scrambled. Result:\n" + scramble);
    }
    else if (choice.toLowerCase() == "b")
    {
      char sortArr = password.toCharArray();
      while (sorted = false)
      {
        //Do it bruh 👅
      }
    }
  }
}
