import java.util.ArrayList;
import java.util.Scanner;

//
//
//Write a program to:
//
//        1. Allow a user to enter a browser title (if the browser is Internet Explorer, show 'Use a different browser!' and end the program).
//
//        2. Allow a user to enter the name and urls for several tabs (the user must enter at least one tab).
//
//        3. Display the name of the browser as well as the tabs that have been opened.
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        BrowserName browsername = new BrowserName();
        String ans;
        String p;
        Tabs tabinfo = new Tabs();
        String browse;

        do {
            //Browser information entered
            System.out.println("Please type Browser you are using");
            browse = keyboard.nextLine();
            browsername.setBrowser(browse);
            //Check for vailadtion
            if (browse.equalsIgnoreCase("Internet Explorer")) {
                System.out.println("Invalid Browser");
                do {
                    System.out.println("Would you like to use another Browser (Y)es or (N)o");
                    ans = keyboard.nextLine();
                    //Browser information entered
                    System.out.println("Please type Browser you are using");
                    browse = keyboard.nextLine();
                    browsername.setBrowser(browse);
                } while (!ans.equalsIgnoreCase("y"));
            }
        } while (browse.equalsIgnoreCase("")) ;

            do {

                System.out.println("<------Tab Information--->");

                tabinfo = new Tabs();
                do {
                    //Tabs Information from user
                    System.out.println("Please enter your url");
                    tabinfo.setUrl(keyboard.nextLine());
                    System.out.println("Please Enter your Title of your webpage");
                    tabinfo.setTitle(keyboard.nextLine());
                    System.out.println("Would you like to enter another Tab? Yes or No");
                    ans = keyboard.nextLine();

                } while (ans.equalsIgnoreCase("y"));

                browsername.addTabs(tabinfo);
                System.out.println("Would you like to use another Browser");
                ans = keyboard.nextLine();
            } while (ans.equalsIgnoreCase("y"));

//Print User Info

            for (Tabs eachtab : browsername.getTabsArrayList()
                    ) {
                System.out.println("Your Current Tab Information: " + eachtab + " Current Url: " + tabinfo.getUrl() + " Current Title: " + tabinfo.getTitle());
                System.out.println("Your Current Browser: " + browsername.getBrowser());
                System.out.println("Use a different Browser!");
            }
        }
    }


