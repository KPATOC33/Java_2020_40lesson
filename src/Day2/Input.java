package Day2;
//---------------------------------- ЭТО ВЫВОДИТ ЧИСЛО
import java.util.Scanner;//Что бы класс Scanner работал его надо импортировать так import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // System.in добавляет входной поток данных
        Scanner s= new Scanner (System.in);
        //один из методов сканера
        System.out.println("Введите какое-нибудь число");
        //далее создаем новый обьект класа String и ссыдаем его на то что будет получено с клавиатуры
 // используем метод nextLine от считает одну строчку с клавиатры чего нибудь .строчка продолжается до тех пор пока не нажмем на Enter
        int x = s.nextInt();
        System.out.println("вы ввели" + x);
    }
}

//---------------------------------- ЭТО ВЫВОДИТ ТЕКСТ
//package Day2;

//        import java.util.Scanner;//Что бы класс Scaner работал его надо импортировать так import java.util.Scanner;

//public class Input {
 //   public static void main(String[] args) {
  //      // System.in добавляет входной поток данных
   //     Scanner s= new Scanner (System.in);
    //    //один из методов сканера
  //      System.out.println("Введите что-нибудь");
     //   //далее создаем новый обьект класа String и ссыдаем его на то что будет получено с клавиатуры
      //  // используем метод nextLine от считает одну строчку с клавиатры чего нибудь .строчка продолжается до тех пор пока не нажмем на Enter
     //   String string = s.nextLine();
     //   System.out.println("вы ввели" + string);
  //  }
//}
//----------------------------------ВЫВОДИТ ОТВЕТ
 //   Введите что-нибудь
  //      привет
  //      вы ввели привет

   //     Process finished with exit code 0