import java.util.Scanner;

public class UpDownGame {

    // 안내 메시지를 출력하는 메서드
    public static void printWelcome() {
        // 안내 문구
        System.out.println("================================");
        System.out.println("🎮 1부터 100 사이의 숫자를 맞춰보세요!");
        // 퀴즈 1 기준으로 안내 메시지의 범위 숫자를 1부터 100이라고 명시함으로 해당 숫자 퀴즈가 1~100까지 맞추도록 유도.
        System.out.println("================================");
    }

    // 힌트를 출력하고 정답 여부를 반환하는 메서드
    public static boolean checkGuess(int target, int userGuess) {
        if (userGuess == target) { // 사용자가 입력한 숫자와 정답이 같았을 때 맞춘거다 ( userGuess (사용자 입력), target (주어진 수)
            System.out.println("🎯 정답입니다! 축하합니다!");
            return true; // 맞춤! (true 값을 반환한다 - boolean 값이니까)
        } else if (userGuess < target) {
            System.out.println("🔼 UP! 더 큰 숫자입니다.");
            return false; // 못맞춤 (false 값을 반환한다 - 앞의 boolean 값이니까)
        } else {
            System.out.println("🔽 DOWN! 더 작은 숫자입니다.");
            return false; // 못맞춤 (false 값을 반환한다 - 앞의 boolean 값이니까)
        }
    }

    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 자바 도구 (Scanner) 객체 생성
        /* Scanner 객체 생성했을때 int 계열만 받는게 아니라 String, Double, Float 등 다양하게 입력받을 수 있음 (nextInt(), nextDouble() 등등
           Scanner sc = new Scanner(System.in)
           스캐너 생성 (new)
           System.in을 통해 입력 받은 값을 바이트 단위로 받아들이 겠다는 의미
           System.out.print("아무 값이나 넣는다 치면")
           String message = sc.nextLine();
           이런식으로 String message는 메모리에 String 타입이 들어가도록 만들고, nextLine에서 \n을 포함하는 하나의 라인을 읽고 버린 나머지만 리턴
           메모리에 버퍼내용을 적재한다.
        */
        Scanner scanner = new Scanner(System.in);

        //현재 제시받은 코드 자체는 정답 변수가 이미 정해져있으므로 출력문구와 정닫 숫자 설정 또는 난수 생성 범위까지 했을때
        int targetNumber = 63; // 우리가 맞출 정답 숫자 (1~100)
        int attempts = 0;      // 시도 횟수를 셀 변수
        boolean isCorrect = false; // 기본값은 false 즉 못맞춘 상태

        printWelcome();

        // 정답을 맞출 때까지 무한 반복
        while (!isCorrect) {
            System.out.print("숫자를 입력하세요: ");
            int guess = scanner.nextInt(); // 사용자가 친 숫자 읽기
            attempts++;
            isCorrect = checkGuess(targetNumber, guess);
            if (isCorrect) { // isCorrect면 못맞춘 상태 이므로 이걸 계속 반복
                while (attempts <= 5) { // 시도가 5회까지 되도록 계속 반복
                    break; // break 문을 통해서 while 문 탈출
                }
            }
        }
        System.out.println("총 " + attempts + "번 만에 정답을 맞추셨습니다!"); // 게임 종료 후 총 시도횟수 출력
        scanner.close(); // 자원 누수를 막기위해 Scanner 사용을 종료.
    }
}