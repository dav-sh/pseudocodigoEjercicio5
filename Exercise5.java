import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of ages: ");
        int ages = s.nextInt();
        int counter = 0;
        int male = 0;
        int female = 0;
        while (counter < ages){
            s.nextLine();
            System.out.print("Enter the gender (F/M): ");
            String gender = s.nextLine();
            System.out.print("Enter the age: ");
            int age = s.nextInt();
            if (gender.equals("M") && age <18){
                male++;
            }else if(gender.equals("F") && (age>=18)){
                female++;
            }
            counter++;

        }
        System.out.println("Number of underage man: "+male);
        System.out.print("Number of female of legal age: "+female);
    }
}