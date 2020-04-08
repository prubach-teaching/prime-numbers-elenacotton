package sgh;

public class PrimeNumbers {

    public static void main(String[] args) {
 // define limit
 int limit = 10;
 // start loop
 for (int x = 2; x < 10; x++) {
 boolean isPrime = true;
 // verify if x is a prime number
 for (int y = 2; y < x ; y++) {
 if (x % y == 0) {
 isPrime = false;
 break;
 }
 }
 if (isPrime)
 System.out.print(x + ", ");
 }
 }
}
