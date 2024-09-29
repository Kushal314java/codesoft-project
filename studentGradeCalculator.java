import java.util.Scanner;

public class studentGradeCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter the Five Subject Marks : ");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        float percent = total / 5;
        System.out.println("Total : " + total );
        System.out.println("Percentage : "+ percent);
         
        if(percent>=90){
            System.out.println("Grade A");
        }else if(percent>=80){
            System.out.println("Grade B");
        }else if(percent>=70){
            System.out.println("Grade C");
        }else if(percent>=60){
            System.out.println("Grade D");
        }else if(percent>=50){
            System.out.println("Grade E");
        }else {
            System.out.println("Grade F");
        }
    }
}
