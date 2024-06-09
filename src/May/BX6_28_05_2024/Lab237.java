package May.BX6_28_05_2024;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Lab237 {
    public static void main(String[] args) {
        List v2 = new Vector();
        v2 .add("Login_page");
        v2.add("Dashboard");
        v2.add("Home_page");
        v2.add("Account_Menu");
        System.out.println(v2);

        // API End point
      //  pages loginPage, Dashboard, HomePage
        List url_page = new ArrayList();
       url_page.add("Login_page");
       url_page.add("Dashboard");
       url_page.add("Home_page");
       url_page.add("Account_Menu");
       System.out.println(url_page);

       for (int i = 0; i<url_page.size();i++){
           System.out.println(url_page.get(i));
        }
for (Object obj :url_page){
    System.out.println(obj);
}

        Iterator intr = url_page.iterator();
 while (intr.hasNext()){
     System.out.println(intr.next());
 }
    }
}
