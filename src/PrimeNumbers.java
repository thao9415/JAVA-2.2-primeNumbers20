public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count=0;
        for (int number= 0; count <= 20; number++) {
            if (isPrime(number)) {
                System.out.print(number + "\t");
                count++;
            }
        }
    }


}
