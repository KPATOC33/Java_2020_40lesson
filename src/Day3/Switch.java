package Day3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //создаем обьект типа Scanner и добавляем входной поток System.in
Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст ");
        //nextInt метод принемающий числовые данные
        //nextLine метод принемающий числовые данные
        String age  = scanner.nextLine();
        switch(age) {
            case "Ноль" :
                System.out.println("Ты родился ");
                break;
            case "Семь" :
                System.out.println("Ты пошел в школу ");
                break;
            case "Восемнадцать" :
                System.out.println("Ты закончил школу ");
                break;
                //default ставят для обозначения того что не одно из условий не сработало
            default:
                System.out.println("Ни одно из условий не сработало ");
        }
    }
}



//package Day3;
//
//        import java.util.Scanner;
//
//public class Switch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи возраст ");
//        //nextInt метод принемающий числовые данные
//         //nextLine метод принемающий числовые данные
//        int age  = scanner.nextInt();
//        switch(age) {
//            case 0 :
//                System.out.println("Ты родился ");
//                break;
//            case 7 :
//                System.out.println("Ты пошел в школу ");
//                break;
//            case 18 :
//                System.out.println("Ты закончил школу ");
//                break;
//            //default ставят для обозначения того что не одно из условий не сработало
//            default:
//                System.out.println("Ни одно из условий не сработало ");
//        }
//    }
//}
