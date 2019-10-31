package be.technifutur.devmob9.l2j;

public class ExerciceList {
  public static void main (String[] args) {
    List origine = null;
    printList(origine);

    origine = push(origine, 14);
    printList(origine);

    origine = push(origine, 10);
    printList(origine);

    origine = add(origine, 20);
    printList(origine);

    origine = insert(origine, 15, 1);
    printList(origine);

    int prev = set(origine, 12, 0);
    System.out.println(prev);
    printList(origine);

    System.out.println(get(origine, size(origine) - 1));

    System.out.println("indexOf 14 : " + indexOf(origine, 14));
    System.out.println("indexOf 13 : " + indexOf(origine, 13));
  }

  public static void printList (List l) {
    if (null == l) {
      System.out.println("Liste vide");
    }
    else {
      int pos = 0;
      while (null != l) {
        System.out.print(pos++);
        System.out.print(": ");
        System.out.println(l.val);
        l = l.next;
      }
    }
    System.out.println();
  }

  public static List push (List l, int val) {
    List c = new List();
    c.val = val;
    c.next = l;
    return c;
  }

  public static int size (List l) {
    int s = 0;
    while (l != null) {
      s++;
      l = l.next;
    }
    return s;
  }

  public static List add (List l, int val) {
    List c = new List();
    List prev = l;
    c.val = val;
    if (null != l) {
      while (null != prev.next) {
        prev = prev.next;
      }
      prev.next = c;
    }
    else {
      l = c;
    }
    return l;
  }

  public static List insert (List l, int val, int pos) {
    List c = new List();
    List prev;
    c.val = val;
    if (0 == pos) {
      c.next = l;
      l = c;
    }
    else {
      prev = l;
      while (1 < pos--) {
        prev = prev.next;
      }
      c.next = prev.next;
      prev.next = c;
    }
    return l;
  }

  public static int get (List l, int pos) {
    while (0 < pos--) {
      l = l.next;
    }
    return l.val;
  }

  public static int set (List l, int val, int pos) {
    int ret;
    while (0 < pos--) {
      l = l.next;
    }
    ret = l.val;
    l.val = val;
    return ret;
  }

  public static int indexOf (List l, int val) {
    int pos = 0;
    boolean found = false;
    while (null != l && !found) {
      if (l.val == val) {
        found = true;
      }
      else {
        l = l.next;
        pos++;
      }
    }
    return found ? pos : -1;
  }
}