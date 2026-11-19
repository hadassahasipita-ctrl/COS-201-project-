public class ForLoop {
    public static void main(String[] args) {
        int primeCount = 0;

        for (int number = 1; number < 500; number++) {
            if (isPrime(number)) {
                primeCount++;
                System.out.println(primeCount + ": " + number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // 1 and numbers below 2 are not prime
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
