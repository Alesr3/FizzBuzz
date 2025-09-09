package lab1;

public class Multiples {
    public static void main(String[] args) {
        // 3 and 5 multiples in [1, 1000)
        System.out.println(multiples(3, 5, 1000));
    }

    static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                counter += 1;
            }
        }
        return counter;
    }
}
