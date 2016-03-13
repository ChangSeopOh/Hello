package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

// ������� �Է� BufferedReader ���
// ������ ��ðڽ��ϱ�? > ��������� ~~ �׷� �޴��� �����ϴ�
// ������ ��ðڽ��ϱ�? > 2
// �� �ֹ��Ͻǰǰ���? yes/no
// n,no�� ��� ����ٳ��� 2�ܿ� 8000���Դϴ�.
// y,yes�� ��� ��� ������ ��ðڽ��ϱ�� �ݺ�
// ����ٳ���2��, ��ī1�ܿ� 11000���Դϴ�.
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
          
            System.out.print("������ ��ðڽ��ϱ�? >");
            name = br.readLine().trim();
            if (menu.containsKey(name)) {
               System.out.print("������ ��ðڽ��ϱ�? >");               
               count =Integer.valueOf(br.readLine());
               for (int i = 0; i < count; i++) {
                  String str = menu.getProperty(name);
                  don += Integer.valueOf(str);
               }
               for(CoffeeVO c:orderList){ // �����޴� �� �ֹ��ϸ� ������ �߰�
                  if(c.getName().equals(name)) c.setCount(c.getCount()+count);
                  else orderList.add(new CoffeeVO(name, count, don));
               }               
            } else
               System.out.println("�׷� �޴��� �����ϴ�. >");
            System.out.print("�� �ֹ��Ͻðڽ��ϱ�? (yes/no)>");
            String input = br.readLine();
            if (input.equals("yes") || input.equals("y"))
               continue;
            else if (input.equals("no") || input.equals("n"))
               break;
            ;
         } while (true);

         if (!(orderList.isEmpty()))
            printOrder(orderList);
         System.out.println("�ȳ���������~");

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   private static void printOrder(ArrayList<CoffeeVO> orderList) {
      int sum = 0;
      for (CoffeeVO c : orderList) {
         sum += c.getValue();
         System.out.print(c.getName() + " " + c.getCount() + "�� ");
      }
      System.out.println("��" + sum + "���Դϴ�.");

   }
}