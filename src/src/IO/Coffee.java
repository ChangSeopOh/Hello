package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

// 사용자의 입력 BufferedReader 사용
// 무엇을 드시겠습니까? > 딸기버내너 ~~ 그런 메뉴는 없습니다
// 몇잔을 드시겠습니까? > 2
// 더 주문하실건가요? yes/no
// n,no일 경우 딸기바나나 2잔에 8000원입니다.
// y,yes일 경우 계속 무엇을 드시겠습니까로 반복
// 딸기바나나2잔, 모카1잔에 11000원입니다.
public class Coffee {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileInputStream fis = null;
      Properties menu = new Properties();

      ArrayList<CoffeeVO> orderList = new ArrayList<CoffeeVO>();
      String name = null;
      int count = 0;
      int don = 0;

      try {
         fis = new FileInputStream("src/menu.properties");
         menu.load(fis);
         System.out.println("************************************");
         System.out.println("*** Welcome to the cafe Starbuzz ***");
         System.out.println("************************************");
         System.out.println("***            MENU              ***");
         System.out.println("************************************");
         for (Object okey : menu.keySet()) {
            String key = (String) okey;
            System.out.println("  " + key + " : " + menu.getProperty(key) + " ");
         }

         do {
          
            System.out.print("무엇을 드시겠습니까? >");
            name = br.readLine().trim();
            if (menu.containsKey(name)) {
               System.out.print("몇잔을 드시겠습니까? >");               
               count =Integer.valueOf(br.readLine());
               for (int i = 0; i < count; i++) {
                  String str = menu.getProperty(name);
                  don += Integer.valueOf(str);
               }
               for(CoffeeVO c:orderList){ // 같은메뉴 또 주문하면 갯수만 추가
                  if(c.getName().equals(name)) c.setCount(c.getCount()+count);
                  else orderList.add(new CoffeeVO(name, count, don));
               }               
            } else
               System.out.println("그런 메뉴는 없습니다. >");
            System.out.print("더 주문하시겠습니까? (yes/no)>");
            String input = br.readLine();
            if (input.equals("yes") || input.equals("y"))
               continue;
            else if (input.equals("no") || input.equals("n"))
               break;
            ;
         } while (true);

         if (!(orderList.isEmpty()))
            printOrder(orderList);
         System.out.println("안녕히가세요~");

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   private static void printOrder(ArrayList<CoffeeVO> orderList) {
      int sum = 0;
      for (CoffeeVO c : orderList) {
         sum += c.getValue();
         System.out.print(c.getName() + " " + c.getCount() + "잔 ");
      }
      System.out.println("에" + sum + "원입니다.");

   }
}