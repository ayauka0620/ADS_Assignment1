import java.util.Arrays;

public class Main {
    //problem 1
    public static int findMin(int[] arr){
        int min=arr[0];
        for (int num : arr){
            if (num < min){
                min=num;
            }
        }
        return min;
    }

    //problem 2
    public static double findAverage(int[] arr){
        int sum=0;
        for (int num : arr) {
            sum+=num;
        }
        return (double) sum/arr.length;
    }

    //problem 3
    public static boolean isPrime(int n){
        if (n<2) return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) return false;
        }
        return true;
    }

    //problem 4
    public static long factorial (int n){
        if (n<=1) return 1;
        return n*factorial(n-1);
    }

    //problem 5
    public static long fibonacci (int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //problem 6
    public static long power (int a, int n){
        if (n==0) return 1;
        return a*power(a, n-1);
    }

    //problem 7
    public static void permute (String str, String result){
        if (str.length()==0){
            System.out.println(result);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            String ros=str.substring(0, i)+str.substring(i+1);
            permute(ros, result+ch);
        }
    }

    //problem 8
    public static boolean isNumeric(String s){
        return s.matches("\\d+");
    }

    //problem 9
    public static long binomialCoefficient(int n, int k){
        if (k==0 || k==n) return 1;
        return binomialCoefficient(n-1, k-1)+binomialCoefficient(n-1, k);
    }

    //problem 10
    public static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args){
        System.out.println("Min (2,7,4,0,5): " + findMin(new int[]{2, 7, 4, 0, 5}));
        System.out.println("Average (1,2,3,4,5): " + findAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Is prime (5): " + (isPrime(5) ? "Prime" : "Composite"));
        System.out.println("Factorial (7): " + factorial(7));
        System.out.println("Fibonacci (8): " + fibonacci(8));
        System.out.println("Power (3^4): " + power(3, 4));
        System.out.println("Permutations of 'ABC':");
        permute("ABC", "");
        System.out.println("Is Numeric ('64384'): " + (isNumeric("64384") ? "Yes" : "No"));
        System.out.println("Binomial Coefficient (7, 2): " + binomialCoefficient(7, 2));
        System.out.println("GCD (36, 16): " + gcd(36, 16));
    }
}