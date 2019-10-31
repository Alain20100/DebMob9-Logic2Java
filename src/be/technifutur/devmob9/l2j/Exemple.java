package be.technifutur.devmob9.l2j;

import java.util.Scanner;

public class Exemple {
  public static void main (String[] args) {
    int val = 0;
    String sval = null;
    Scanner sc = new Scanner(System.in);

    int[] tab = new int[] {1,2,2,2,5,5,5,6,6,8,9,10,20};
    System.out.print("Valeur cherchée : ");
    sval = sc.nextLine();
    val = Integer.parseInt(sval);

    System.out.println("La valeur se trouve à la position : " + (Exemple.indexOf(tab, val) +1));
  }

  private static int indexOf (int[] t, int v) {
    int pl = 0;
    int ph = t.length - 1;
    int pm = 0;
    int ret = -1;

    while (pl < ph) {
      pm = (pl + ph) / 2;
      if (v > t[pm]) {
        pl = pm + 1;
      }
      else {
        ph = pm;
      }
    }
    if (v == t[pl]) {
      ret = pl;
    }
    return ret;
  }
}