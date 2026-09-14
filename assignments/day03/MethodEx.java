public class MethodEx {

    // 1. 반환값과 입력값이 모두 있는 메서드 (두 수의 합)
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // 2. 입력값은 있지만 반환값은 없는 메서드 (void)
    public static void greet(String name) {
        System.out.println("반갑습니다, " + name + "님!");
        System.out.println("오늘도 즐거운 자바 코딩 되세요.");
    }

    // 3. 성인 여부를 판별해서 boolean을 돌려주는 메서드
    public static boolean isAdult(int age) {
        if (age >= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 메서드 호출 실습 ===");

        // greet 메서드 호출
        greet("오준석");
        greet("김경환");

        // add 메서드 호출 및 결과 받기
        int calcResult = add(10, 20);
        System.out.println("10 + 20 = " + calcResult);

        // isAdult 메서드 호출
        boolean adultCheck = isAdult(15);
        System.out.println("15세는 성인인가요? " + adultCheck);
    }
}