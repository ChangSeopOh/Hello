package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class IO {
	public static void main(String[] args) {
		

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileInputStream fis = null;
      Properties menu = new Properties();

      ArrayList<Object> drink = new ArrayList<Object>();
      ArrayList<Object> c = new ArrayList<Object>();
      String name = null;
      int count = 0;
      int money = 0;
      int total=0;
      try {
         fis = new FileInputStream("src/menu.properties");
         menu.load(fis);
         System.out.println("************************************");
         System.out.println("***            MENU              ***");
         System.out.println("************************************");
         for (Object okey : menu.keySet()) {
            String key = (String) okey;
            System.out.println("  " + key + " : " + menu.getProperty(key) + " ");
         }

         do {
          
            System.out.print("������ ��ðڽ��ϱ�? >");
            name = br.readLine();
          
            if (menu.containsKey(name)) {
            	  drink.add(name);
               System.out.print("������ ��ðڽ��ϱ�? >");               
               count =Integer.valueOf(br.readLine());
               c.add(count);
               for (int i = 0; i < count; i++) {
                  String str = menu.getProperty(name);
                  money += Integer.valueOf(str);
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

        for(int i =0; i<drink.size();i++){
        	System.out.print(drink.toString()+" ��"+c.toString()+"�ܿ�");
        }
        for(int i =0; i<c.size();i++){
        	total += money;
        }
     
          System.out.println("�� ����� "+money+"�Դϴ�.");
         System.out.println("�ȳ���������~");

      } catch (Exception e) {
         e.printStackTrace();
      }

	}
      
   }

