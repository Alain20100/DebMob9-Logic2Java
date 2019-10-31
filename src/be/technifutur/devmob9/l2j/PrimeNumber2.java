package be.technifutur.devmob9.l2j;

public class PrimeNumber2 {

  private static final int LEN = 1000000;

  public static void main (String[] args) {
    int[] prime = new int[LEN];
    double sqrt = 0.0;
    boolean isPrime;
    int i;
    int max;
    int v;
    int numPrime;

    System.out.println(System.currentTimeMillis());

    prime[0] = 2;
    numPrime = 1;
    v = 3;
    while (LEN > numPrime) {
      max = v / 2;
      i = 1;
      isPrime = true;
      while (isPrime && i < numPrime && prime[i] < max) {
        max = v / prime[i];
        isPrime = (0 != (v % prime[i++]));
      }
      if (isPrime) {
        prime[numPrime++] = v;
      }
      v += 2;
    }

    System.out.println(System.currentTimeMillis());

    System.out.println(java.util.Arrays.toString(prime));
  }
}