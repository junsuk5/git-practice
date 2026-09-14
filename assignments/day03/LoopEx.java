public class LoopEx {
    public static void main(String[] args) {
        // 1. 1부터 10까지의 합 구하기 (for 문)
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 총합: " + sum);

        System.out.println("\n--- 구구단 7단 출력 ---");
        int dan = 7;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

        System.out.println("\n--- 폭탄 카운트다운 (while 문) ---");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println(countdown + "초 전...");
            countdown--;
        }
        System.out.println("💥 쾅!!");
    }
}