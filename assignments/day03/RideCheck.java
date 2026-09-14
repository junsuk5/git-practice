public class RideCheck {
    public static void main(String[] args) {
        int age = 11;
        double height = 135.0;
        boolean hasHeartDisease = false; // 심장 질환 여부

        System.out.println("나이: " + age + "세, 키: " + height + "cm");

        // 탑승 조건: 나이 12세 이상, 키 140cm 이상, 심장 질환이 없어야 함
        if (hasHeartDisease) {
            System.out.println("❌ 심장 질환이 있으므로 탑승할 수 없습니다.");
        } else if (age >= 12 && height >= 140.0) {
            System.out.println("🎉 축하합니다! 단독 탑승이 가능합니다.");
        } else if (age >= 10 && height >= 130.0) {
            System.out.println("⚠️ 보호자 동반 시에만 탑승할 수 있습니다.");
        } else {
            System.out.println("❌ 키 또는 나이 제한으로 탑승할 수 없습니다.");
        }
    }
}