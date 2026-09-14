public class EvenSum {
    public static void main(String[] args) {
        int evenSum = 0;
        for( int i = 1; i <= 30; i++ ) {
            if (i % 2 == 0){
                evenSum = evenSum + i;
            }
        }
        System.out.println(evenSum);
    }
}
