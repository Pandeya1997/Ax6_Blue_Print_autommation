package Home_Work_02_May_Arry;

public class BX6_HW_5_find_maxno {
    public static void main(String[] args) {
      int [] arr = {30,50,60,90,10, 100,999};
       int  m  = arr[0];
        for(int  i =0 ; i < arr.length;i++) {
            if(arr[i] >m){
             m   =  arr [i];
            }
         //   System.out.println(m);
        }

        System.out.println(m);


      /*  int i;
      for( i =0 ; i < arr.length;i++) {
          System.out.print(i+"  ");
          System.out.println(arr[i]+ " ,");

      }
        System.out.println(i);
      i= i-1;
        System.out.println(arr[i]);
        System.out.println(i);

       */
    }

}
