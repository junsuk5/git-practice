import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇점이세요? :");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.print("A 학점");
        }
        if (90 > score && score >= 80) {
            System.out.print("B 학점");
        }
        if (80 > score && score >= 70) {
            System.out.print("C 학점");
        } else if ( 70 > score) {
            System.out.print("재수강 대상(F)입니다. 힘내세요!");
        }
    }
}
