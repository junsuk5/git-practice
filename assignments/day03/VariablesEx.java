public class VariablesEx {
    public static void main(String[] args) {
        // 1. 변수 선언과 초기화
        String playerName = "오준석";
        int level = 1;
        final double pi = 3.14;
        double health = 100.0;
        boolean isAlive = true;

        System.out.println("=== 게임 시작 ===");
        System.out.println("플레이어: " + playerName);
        System.out.println("현재 레벨: " + level);
        System.out.println("현재 체력: " + health);
        System.out.println("생존 여부: " + isAlive);

        // 2. 변수 값 변경 (상자의 내용물 바꾸기)
        System.out.println("\n--- 몬스터에게 공격당함! (-30 체력) ---");
        health = health - 30.0; // 기존 체력에서 30을 빼서 다시 health에 저장
        level = level + 1;      // 사냥 성공으로 레벨업!

        System.out.println("변경된 체력: " + health);
        System.out.println("변경된 레벨: " + level);
    }
}
