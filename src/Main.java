import java.util.Arrays;

public class Main {
    // Problem 1
    public static int findMinRecursive(int[] arr, int index){
        if (index==arr.length - 1) {
            return arr[index];
        }
        return Math.min(arr[index], findMinRecursive(arr, index + 1));
    }

    // Problem 2
    public static double findAverageRecursive(int[] arr, int index, int sum){
        if (index==arr.length){
            return (double) sum/arr.length;
        }
        return findAverageRecursive(arr, index + 1, sum + arr[index]);
    }

    // Problem 3
    public static boolean isPrimeRecursive(int n, int divisor){
        if (n<2) return false;
        if (divisor > Math.sqrt(n)) return true;
        if (n%divisor==0) return false;
        return isPrimeRecursive(n, divisor + 1);
    }

    // Problem 4
    public static long factorial(int n){
        if (n<=1) return 1;
        return n * factorial(n - 1);
    }

    // Problem 5
    public static long fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6
    public static long power(int a, int n){
        if (n==0) return 1;
        return a*power(a, n-1);
    }

    // Problem 7
    public static void permute(String str, String result){
        if (str.length()==0){
            System.out.println(result);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            permute(ros, result + ch);
        }
    }

    // Problem 8
    public static boolean isNumericRecursive(String s, int index){
        if (index==s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isNumericRecursive(s, index+1);
    }

    // Problem 9
    public static long binomialCoefficient(int n, int k){
        if (k==0||k==n) return 1;
        return binomialCoefficient(n-1, k-1)  + binomialCoefficient(n-1, k);
    }

    // Problem 10
    public static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args){
        System.out.println("Min (2,7,4,0,5): " + findMinRecursive(new int[]{2, 7, 4, 0, 5}, 0));
        System.out.println("Average (1,2,3,4,5): " + findAverageRecursive(new int[]{1, 2, 3, 4, 5}, 0, 0));
        System.out.println("Is prime (5): " + (isPrimeRecursive(5, 2) ? "Prime" : "Composite"));
        System.out.println("Factorial (7): " + factorial(7));
        System.out.println("Fibonacci (8): " + fibonacci(8));
        System.out.println("Power (3^4): " + power(3, 4));
        System.out.println("Permutations of 'ABC':");
        permute("ABC", "");
        System.out.println("Is Numeric ('64384'): " + (isNumericRecursive("64384", 0) ? "Yes" : "No"));
        System.out.println("Binomial Coefficient (7, 2): " + binomialCoefficient(7, 2));
        System.out.println("GCD (36, 16): " + gcd(36, 16));
    }
}
