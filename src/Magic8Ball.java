import java.util.Scanner;

    public class Magic8Ball {

      public static void main(String[]args) {
          //declare
          Scanner keyboard;
          String question;


          //initializing phase
          keyboard = new Scanner(System.in);
          System.out.println("Give me a number between 1 and 100");
          int firstNumber = keyboard.nextInt();
          System.out.println("Now ask me a question");
          question = keyboard.nextLine();

          if (10>= firstNumber && firstNumber >0) {
              System.out.println("No");
          }
         else if (20>firstNumber && firstNumber>10) {
              System.out.println("That is pretty good");

          }
          else if (30>firstNumber && firstNumber>20) {
              System.out.println("That is pretty good");

          } else if (40>firstNumber && firstNumber>30) {
              System.out.println("That is pretty good");

          } else if (50>firstNumber && firstNumber>40) {
              System.out.println("That is pretty good");

          } else if (60>firstNumber && firstNumber>50) {
              System.out.println("That is pretty good");

          } else if (70>firstNumber && firstNumber>60) {
              System.out.println("That is pretty good");

          } else if (80>firstNumber && firstNumber>70) {
              System.out.println("That is pretty good");


          }
      }

        }