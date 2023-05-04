package lab4.company;
import java.util.regex.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String regex1="[@]";
        String regex2="[aeiouAEIOU]";
        String regex3="k|kr+";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);
        System.out.print("Input the text string:");  // Read the input string to check the match
        String text=sc.nextLine();
        Matcher matcher1 = pattern1.matcher(text);  // Create a matcher
        Matcher matcher2 = pattern2.matcher(text);
        Matcher matcher3 = pattern3.matcher(text);
        if(matcher1.find()) // for checking mail id valid or not
        {
            System.out.println("Entered text is the valid EmailID.");
        }
        else
        {
            System.out.println("Entered text is not the valid EmailID.");
        }
        if(matcher2.find()) // For checking text has vowels or not
        {
            System.out.println("Entered text has vowels.");
        }
        else
        {
            System.out.println("Entered text doesn't have any vowels.");
        }
        if(matcher3.find())  // for checking the k followed r or not
        {
            System.out.println("Entered text has k followed by zero or more r's");
        }
        else
        {
            System.out.println("Entered text has not k followed by zero or more r's");
        }
        //hi
    }

}

