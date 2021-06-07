/*Purpose: Messages class act as a blueprint for messages, winning or loss, this class is usable for simple games as it allows the user to enter the messages and it's not hard coded*/
//Author: Dina Ismail
//Date: April 4th 2021
//Time: 11:17 PM
import java.util.Random;
import java.util.Scanner;

public class Messages {

    //multidimensional array 3 rows and 5 columns
    private static String[][]  messageList = new String[3][5]; // this stores notification messages shown to the user after playing each round according to it's type (loss or win)
    public static boolean isEmpty=true;
    //default constructor
    public Messages(){

    }
    //a method to set the messages in the array using for loop
    public  static void setMessageList(String message)
    {
        System.out.println("Please read the instructions carefully!");
        System.out.println("===========================================");


        System.out.println("Please enter the message");
        isEmpty  = false;

        for(int i = 0; i<3; i++)
        {
            for(int j =0; j<5;j++)
            {
                System.out.println("Type 0 means a winning message type, type 1 then loss message, type 2 is a tie");
                System.out.println("Message for Type: "+i);
                Scanner scan = new Scanner(System.in);
                messageList[i][j] = scan.nextLine();
            }
        }
            System.out.println("You have successfully added the winning and loss message to be used during playinga!");
        for(int i = 0; i<3; i++)
        {
            for(int j =0; j<5;j++)
            {
                System.out.println(messageList[i][j]);
            }
        }
    }

//getter
    public static String getMessage(int type)
    {
        Random rd = new Random();
       int j= rd.nextInt(5);

        return messageList[type][j];
    }


}
