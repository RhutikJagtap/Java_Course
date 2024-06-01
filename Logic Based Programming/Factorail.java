class Factorail {

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = calculateFactorial(5);
        System.out.println("Factorial is = " + result);
    }
}
