import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

class U4Project
{
  public static void main(String[] args)
  {
    boolean sorted = false;
    String toPrint = "";
    int temp = 0;
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
    if (choice.toLowerCase().equals("s"))
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
    else if (choice.toLowerCase().equals("b"))
    {
      System.out.println("Numberizing password... any symbols or non-letters will be left out.");
      char[] sortArr = (password.toLowerCase()).toCharArray();
      int[] unsortedInts = new int[sortArr.length];
      for (int numberize = 0; numberize < sortArr.length; numberize++)
      {
        if (sortArr[numberize] == 'a')
        {
          unsortedInts[numberize] = 1;
        }
        else if (sortArr[numberize] == 'b')
        {
          unsortedInts[numberize] = 2;
        }
        else if (sortArr[numberize] == 'c')
        {
          unsortedInts[numberize] = 3;
        }
        else if (sortArr[numberize] == 'd')
        {
          unsortedInts[numberize] = 4;
        }
        else if (sortArr[numberize] == 'e')
        {
          unsortedInts[numberize] = 5;
        }
        else if (sortArr[numberize] == 'f')
        {
          unsortedInts[numberize] = 6;
        }
        else if (sortArr[numberize] == 'g')
        {
          unsortedInts[numberize] = 7;
        }
        else if (sortArr[numberize] == 'h')
        {
          unsortedInts[numberize] = 8;
        }
        else if (sortArr[numberize] == 'i')
        {
          unsortedInts[numberize] = 9;
        }
        else if (sortArr[numberize] == 'j')
        {
          unsortedInts[numberize] = 10;
        }
        else if (sortArr[numberize] == 'k')
        {
          unsortedInts[numberize] = 11;
        }
        else if (sortArr[numberize] == 'l')
        {
          unsortedInts[numberize] = 12;
        }
        else if (sortArr[numberize] == 'm')
        {
          unsortedInts[numberize] = 13;
        }
        else if (sortArr[numberize] == 'n')
        {
          unsortedInts[numberize] = 14;
        }
        else if (sortArr[numberize] == 'o')
        {
          unsortedInts[numberize] = 15;
        }
        else if (sortArr[numberize] == 'p')
        {
          unsortedInts[numberize] = 16;
        }
        else if (sortArr[numberize] == 'q')
        {
          unsortedInts[numberize] = 17;
        }
        else if (sortArr[numberize] == 'r')
        {
          unsortedInts[numberize] = 18;
        }
        else if (sortArr[numberize] == 's')
        {
          unsortedInts[numberize] = 19;
        }
        else if (sortArr[numberize] == 't')
        {
          unsortedInts[numberize] = 20;
        }
        else if (sortArr[numberize] == 'u')
        {
          unsortedInts[numberize] = 21;
        }
        else if (sortArr[numberize] == 'v')
        {
          unsortedInts[numberize] = 22;
        }
        else if (sortArr[numberize] == 'w')
        {
          unsortedInts[numberize] = 23;
        }
        else if (sortArr[numberize] == 'x')
        {
          unsortedInts[numberize] = 24;
        }
        else if (sortArr[numberize] == 'y')
        {
          unsortedInts[numberize] = 25;
        }
        else if (sortArr[numberize] == 'z')
        {
          unsortedInts[numberize] = 26;
        }
      }
      System.out.println("Sorting...");
      while (sorted == false)
      {
        sorted = true;
        for (int sortIndex = 0; sortIndex < unsortedInts.length - 1; sortIndex++)
        {
          if (unsortedInts[sortIndex] > unsortedInts[sortIndex + 1])
          {
            temp = unsortedInts[sortIndex];
            unsortedInts[sortIndex] = unsortedInts[sortIndex + 1];
            unsortedInts[sortIndex + 1] = temp;
            sorted = false;
          }
        }
      }
      System.out.println("Sorted password: " + Arrays.toString(unsortedInts));
    }
  }
}
