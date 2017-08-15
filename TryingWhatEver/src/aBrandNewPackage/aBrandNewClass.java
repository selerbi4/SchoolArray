package aBrandNewPackage;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Daniel on 8/15/2017.
 */
public class aBrandNewClass {
    public static final int MAX_STUDENTS = 50;
    public static final int MIN_STUDENTS = 0;
    public static final int MAX_GRADE=100;
    public static final int MIN_GRADE=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students are in your class?:");
        int students_in_class = in.nextInt();
        String names[] = new String[students_in_class];
        int grades[] = new int[students_in_class];
        int sum = 0;
        while (students_in_class < MIN_STUDENTS || students_in_class > MAX_STUDENTS) {
            System.err.println("Sorry, but the number is invild please try again(between 1-50");
            students_in_class = in.nextInt();


        }

        for (int i = 0; i < students_in_class; i++) {
    int jj = 0;


                System.out.println("What is the student name?");
                String student_name = in.next();
                names[i]=student_name;
                System.out.println("What is the grade?");
                int grade = in.nextInt();
                while (grade<MIN_GRADE || grade>MAX_GRADE){
                    System.err.println("Sorry!But the grade you have entered is invild please try again.");
                    grade = in.nextInt();
                }
                grades[i] = grade;
                sum = sum + grade;


            }

        System.out.println("Would you like to see or verify the grades?(Answer yes/no)");
        String yes = in.next();
        if (yes.contains("yes")) {
        for (int b=0;b<names.length;b++){
            System.out.println("The student " + names[(b)] + " grade is " + grades[b]);

            }

            System.out.println("Would like to know the avarage of the grades?");
            String maybe =in.next();
            if (maybe.contains("yes")){

                int avarage = sum/students_in_class;
                System.out.println("The avarage is - " + avarage);
            }
            else {
                System.out.println("Closed.");
            }


        }

        }



        }








