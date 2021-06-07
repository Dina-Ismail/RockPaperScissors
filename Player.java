/*Purpose: Player blue print class*/
//Author: Dina Ismail
//Date: March 21st 2021
//Time: 5:54 PM

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String firstName;
    private String nickName;

    //default constructor
    public Player()
    {

    }
    //constructor with one argument which is the nickname of player
    public Player(String name)
    {

        nickName = name;
    }
    //setters
    public void setFirstName(String firstName)
    {

        this.firstName = firstName;
    }
    public void setNickName(String nickName)
    {

        this.nickName = nickName;
    }
//getters
    public String getNickName() {

        return nickName;
    }

    public String getFirstName() {

        return firstName;
    }

    //game method
    public  void  RockPaperScissors(String nickName)
    {
        int turns =0; //number of turns counter
        int playerScore=0; //player score
        int computerScore=0;//computer score
        //Array with the 3 game options R for Rock, P for Paper, S for Scissors
        char [] gameOptions = {'R','P','S'};

        try {
            while (turns < 5) // the game goes up to 5 turns before announcing the winner
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please " + nickName + " play your turn, R for Rock, P for Paper and S for Scissors");
                char playerInput = scan.nextLine().toUpperCase().trim().charAt(0);//turn user input to upper case and truncate only first letter
                Random rd = new Random();// Instantiate an object from class Random
                turns++;
                char input = gameOptions[rd.nextInt(3)];//variable saves the random input from the array
                //All cases
                int type = 2;
                if (input == playerInput)
                {
                    //The  program is checking if there is a customized messages or the user chose to skip
                    if(Messages.isEmpty == true ) {
                        System.out.println("It's a tie");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                    if (playerInput == 'R')
                    {
                        System.out.println("You Chose: Rock");
                        System.out.println("The Computer Chose : Rock");
                    } else
                    if (playerInput == 'P')
                    {
                        System.out.println("You Chose: Paper");
                        System.out.println("The Computer Chose : Paper");
                    }
                    else
                    if (playerInput == 'S')
                    {
                        System.out.println("You Chose: Scissors");
                        System.out.println("The Computer Chose : Scissors");
                    }
                } else if ((input == 'R') && (playerInput == 'P')) {
                    type = 0;
                    System.out.println("You Chose: Paper");
                    System.out.println("The Computer Chose : Rock");
                    playerScore++;
                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU GOT IT!");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }


                } else if ((input == 'R') && (playerInput == 'S')) {
                    type=1;
                    System.out.println("You Chose: Scissor");
                    System.out.println("The Computer Chose: Rock");
                    computerScore++;
                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU LOST THIS TURN!");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                } else if ((input == 'P') && (playerInput == 'R')) {
                    type=1;
                    System.out.println("You Chose: Rock");
                    System.out.println("The Computer Chose : Paper");
                    computerScore++;


                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU LOST THIS TURN");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                } else if ((input == 'P') && (playerInput == 'S')) {
                    type=0;
                    System.out.println("You Chose: Scissor");
                    System.out.println("The Computer Chose : Paper");
                    playerScore++;
                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU GOT IT!");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                } else if ((input == 'S') && (playerInput == 'R')) {
                    type=0;

                    System.out.println("You Chose: Rock");
                    System.out.println("The Computer Chose : Scissor");
                    playerScore++;
                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU GOT IT!");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                } else if ((input == 'S') && (playerInput == 'P')) {
                    type=1;
                    System.out.println("You Chose: Paper");
                    System.out.println("The Computer Chose : Scissor");
                    computerScore++;
                    if(Messages.isEmpty == true ) {
                        System.out.println("YOU LOST THIS TURN!");
                    }
                    else {
                        System.out.println(Messages.getMessage(type));
                    }
                } else {
                    //if user entered any input other than valid options
                    System.out.println("Something went Wrong! Please make sure to enter one of the valid options,R,P,S");
                    turns--;
                }

            }//end of while
            //thats the announcement of the total scores and winner
            System.out.println("******************************************************************************");
            System.out.println("The total Scores are --> Your Score is " + playerScore + "," + " Computer Score " + computerScore);
            System.out.println("*********************************************************************************");
            if (playerScore > computerScore) {
                System.out.println("YOU ARE THE WINNER!!!!!!!!!!!!");
            } else if (playerScore < computerScore) {
                System.out.println("You Lost :( ");

            } else
                System.out.print("It's A TIE!!");


        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Sorry! An unexpected error happened! Please make sure not to press Space Bar or Enter button");
        }

    }
}
