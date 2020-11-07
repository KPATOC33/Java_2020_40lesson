package Day3;
//это выдает все нечетные числа до 15
public class break_continue {
    public static void main(String[] args) {
for (int i = 0; i<=15;i++) {
    //i%2==0   i переменная % подели на число следующее 2 (у любого четного числа остаток при деление равен 0)
    if (i%2==0) {
        continue;
    }
    System.out.println("Это не четное число."+i);
}
    }
}


//package Day3;
//
//public class break_continue {
//    public static void main(String[] args) {
//        int i = 0;
//        while (true) {
//            if (i == 15)
//                // если if равен 15 то срабатывает  break;  и остонавливает
//                break;
//            System.out.println(i);
//            i++;
//
//        }
//        System.out.println("Мы вышли из цикла.");
//    }
//}
