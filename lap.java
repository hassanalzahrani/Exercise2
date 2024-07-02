import java.util.Scanner;

public class lap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your role admin, superuser, user  ");
        String role = scanner.nextLine();


        if (role.equals("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        } else {
            System.out.println("welcome user");
        }


        // second task
        System.out.println("input 1st nummber");
        int num1 = scanner.nextInt();
        System.out.println("input 2nd number");
        int num2 = scanner.nextInt();
        System.out.print("enter 3rd number");
        int num3 = scanner.nextInt();
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("The greatest: " + greatest);




        // third task


        System.out.println("please enter number 1");
        System.out.println("please enter number 2");
        System.out.println("please enter number 3");
        System.out.println(" please enter number 4");
        System.out.println("please enter number 5");
        System.out.println("please enter number 6");
        System.out.println("please enter number 7");


        int number2 = scanner.nextInt();

            switch (number2) {
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thursaday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("saturday");
                    break;
                default:
                    System.out.println("please enter number between 1 and 7");
            }




            // fourth task


                    System.out.print("Enter your numeric score: ");
                    int numericScore = scanner.nextInt();

                    String letterGrade;

                    if (numericScore >= 90) {
                        letterGrade = "A";
                    } else if (numericScore >= 80) {
                        letterGrade = "B";
                    } else if (numericScore >= 70) {
                        letterGrade = "C";
                    } else if (numericScore >= 60) {
                        letterGrade = "D";
                    } else {
                        letterGrade = "F";
                    }

                    System.out.println("Numeric Score: " + numericScore);
                    System.out.println("Letter Grade: " + letterGrade);
  // fifth task
        
        
  System.out.print("Enter your age: ");
  int age = scanner.nextInt();

  String category;

  if (age < 13) {
      category = "Child";
  } else if (age <= 19) { 
      category = "Teenager";
  } else {
      category = "Adult";
  }

  System.out.println("You are an " + category + ".");


}
}