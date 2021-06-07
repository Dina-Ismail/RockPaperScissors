//Purpose: This is the implementation of the classic game, Rock Paper Scissors.
//Author: Dina Ismail
//Date: April 6th 2021
//Time: 7:19 PM

import java.util.Scanner;
public class RockPaperScissors {
    public static void main (String []args){

        System.out.println("Welcome to the Classic game, Rock Paper Scissors!");
        System.out.println("**************************************************");

        System.out.println("Would you like to enter admin mode or play mode?, type admin TO SET WINNING AND LOOSING MESSAGES DISPLAYED DURING THE GAME otherwise type play to start your game using the default messages");
        Scanner userScan = new Scanner(System.in);

        String mode =userScan.nextLine();
        //here the user chooses either to log as an ADMIN or a PLAYER
        /*logging in as an ADMIN will help the user to setup customized the winning and loosing messages, other wise the program will use the default*/
        switch(mode)
        {
            case("admin"):
                System.out.println("please press enter to confirm! ");
               //this will set the messages array
                Messages.setMessageList(userScan.nextLine());
        //after finishing setting up the messages the program will log the user to the player panel automatically
            case("play"):

            System.out.println("Please enter your first name, Enter 5 if you want to skip");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            //if user chose to skip entering the first name then he will be required to enter his nick name as the game operates with the nickname while firstname is not required
            if ("5".equals(name)) {
                //here we will use the constructor with the argument then the name entered will be used as the nick name for the game
                System.out.println("Enter your nickname to be used in the game!");
                Player newPlayer = new Player(scan.nextLine());//nickname is set here by overloaded constructor
                String nickName = newPlayer.getNickName();
                System.out.println("Great! We're all set! Ready " + newPlayer.getNickName().toUpperCase() + " ??");
                newPlayer.RockPaperScissors(nickName);
            }//end of if skip
            else {
                Player newPlayer = new Player();
                newPlayer.setFirstName(name);
                System.out.println("Welcome " + newPlayer.getFirstName());
                System.out.println("Now enter your nickname to be used in the game, if you'd like to use your first name just retype it!");
                newPlayer.setNickName(scan.nextLine());
                String nickName = newPlayer.getNickName();
                System.out.println("Great! We're all set! Ready " + newPlayer.getNickName().toUpperCase() + " ??");
                newPlayer.RockPaperScissors(nickName);
            }
            default: System.out.println("Please type admin or play only");
        }//end of switch

    }//end of main
}//end of class
