import java.util.*;

class GuessNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;
        do
        {
            System.out.print("Guess the number : ");
            usernumber = sc.nextInt();
            if(usernumber == mynumber)
            {
            System.out.println("WOOH....CORRECT");
            break;
            }
            else if(usernumber > mynumber)
            {
            System.out.println("Your number is larger");
            }
            else
            {
            System.out.println("Your number is smaller");
            }
        }while(usernumber > 0);
        System.out.print("My number was : ");
        System.out.println(mynumber);
    }
}