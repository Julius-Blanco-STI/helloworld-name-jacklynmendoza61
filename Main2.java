
package main1;

import java.util.Scanner;


public class Main1 {

    
    public static void main(String[] args) {
        System.out.println("hello world");   
        Scanner obj = new Scanner (System.in);
                  
                   
               
               System.out.println("What is your name?");
                  String name = obj.nextLine();
               System.out.println("How old are you?");
                  String age = obj.nextLine();
               System.out.println("What's your address?");
                  String add = obj.nextLine();
                  
               System.out.println("hello" + name);
               System.out.println("How old" + age);
               System.out.println("Address" + add); 
    }
    
}
