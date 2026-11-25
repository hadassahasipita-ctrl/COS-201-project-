public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");

        for (int number = 2; number <= 500; number++) {
            boolean isPrime = true;

            // Only check divisors up to the square root of 'number' for efficiency
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break; // No need to check further divisors once one is found
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
