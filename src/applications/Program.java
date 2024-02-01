package applications;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Primeira nota: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        student.grade3 = sc.nextDouble();
        System.out.println();
        System.out.println("Final Grade: "+String.format("%.2f",student.finalGrade()));

        if (student.finalGrade()>60){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
            System.out.println("Missing " + String.format("%.2f",student.missingPoints())+" Points");
        }




        sc.close();
    }
}
