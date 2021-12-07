public class HelloWorld {
  public static void main(String[] args) {
    // int cont = 2;
    // int x = 100;
    // int aux = 0;
    // boolean flag = true;
    // for (int i = 2;i < 100; i++) {
    //   if (i == 2) {
    //     System.out.println(2);
    //   }
    //   else if (i == 3) {
    //     System.out.println(3);
    //   }
    //   while ((cont < i) && flag ) {
    //     if (i%cont == 0) {
    //       flag = false;
    //     }
    //     cont++;
    //   }
    //   if (flag) {
    //     System.out.println(i);
    //   }
    //   cont = 2;
    // }

    int cont = 2;
    int x = 15;
    boolean aux = true;
    while(cont < x/2) {
      if (x%cont == 0) {
        aux = false;
      }
      cont++;
    }
    if (aux) {
      System.out.println(x);
    }





  }

}
