public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void task1 (){

        int e = 0;
        while (e < 10) {
            System.out.print(++e + " ");
        }
        System.out.println();

        for (int i = 10; i>0; i--){
            System.out.print(i + " ");
        }


    }

    public static void task2 () {
        System.out.println("\n");

      int i = 7;
      while ( i <= 31){
          System.out.println("Today is Friday " + i +" th. Report is due.");
          i = i + 7;
      }
      }


      public static void task3(){

      int currentYear = 2022;
      int start = currentYear - 200;
      int end = currentYear + 100;

      for (int year = start; year <= end; year++ ) {
          if (year % 79 == 0){
              System.out.println(year);
          }
      }



      }




      }









