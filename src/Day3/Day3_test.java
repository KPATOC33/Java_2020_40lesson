//Задача 3
package Day3;

import java.util.Scanner;

public class Day3_test {
    public static void main(String[] args) {
        //сканируем данные от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
//создаем переменную в которой отчитываем количество этераций
        int counter = 0;
        //цикл до 5
        while (counter < 5) {


//считываем данные от пользователя
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            // увеличиваем на 1 ( инкрементируем )
            counter++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}

//ЗАДАЧА 2
//package Day3;
//
//        import java.util.Scanner;
//
//public class Day3_test {
//    public static void main(String[] args) {
//        //сканируем данные от пользователя
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Введите число ");
//// принемаем данные в переменные a b
//        while (true) {
//            double a = scanner.nextDouble();
//            double b = scanner.nextDouble();
//
//            //проверям что b равен 0
//            if (b == 0)
//                break;
//
//            System.out.println(a / b);
//
//        }
//    }}

//ЗАДАЧА 1
//package Day3;
//
//        import java.util.Scanner;
//
//public class Day3_test {
//    public static void main(String[] args) {
////создаем обьект типа Scanner и добавляем входной поток System.in (Сообщение от пользователя )
//
//        Scanner scanner =new Scanner(System.in);
////Просто выводим сообщение в консоль с инструкцией
//        System.out.println("Введите город ");
//// с while програма будет работать до тех пор пока пользователь не введет stop
//        while (true) {
//            //Читаем строку от пользователя и помещаем ее в city
//            String city =scanner.nextLine();
////условие что если пользователь введет stop то программа остановится
//            //метод equals используется для сравнения строк
//            if (city.equals("Stop"))
//                // если было введено слово stop то программа останавливается при помощи break
//                break;
//// switch  проверят что если эта страка равняется значению из case то в консоль выводится строка РОССИЯ
//            switch (city){
//                case "Москва":
//                case "Владивосток":
//                case "Ростов":
//                    System.out.println("Россия");
//                    break;
//                case "Рим":
//                case "Милан":
//                case "Турин":
//                    System.out.println("Италия");
//                    break;
//                case "Ливерпуль":
//                case "Манчестер":
//                case "Лондон":
//                    System.out.println("Англия");
//                    break;
//                case "Берлин":
//                case "Мюнхен":
//                case "Кёльн":
//                    System.out.println("Германия");
//                    break;
//                // Если вводится не известный город в строку city
//                default:
//                    System.out.println("Не известная страна");
//            }}}}



//День 3
//        Темы:
//        Урок 10: Оператор switch
//https://www.youtube.com/watch?v=QJHcGWbzk3U&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=10&ab_channel=alishev
//        Урок 9: Операторы break и continue
//https://www.youtube.com/watch?v=otfC1v5YVAY&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=9&ab_channel=alishev
//        Доп. статьи:
//        Методы класса String: ​ https://metanit.com/java/tutorial/7.2.php
//        Особое внимание обратите на раздел “Сравнение строк” и метод ​ equals()​ . Этот
//        метод понадобится вам. Строки в Java не должны сравниваться с помощью ​ ==​ , а
//        должны сравниваться с помощью метода ​ equals()​ .
//        Доп. информация по оператору switch:
//        1) В операторе ​ switch​ , если код в блоках ​ case​совпадает, эти блоки можно
//        объединить.
//        Пример:​Мы хотим выводить в консоль слово “привет”, если пользователь ввел число
//        10, 20 или 30. В этом случае, оператор ​ switch​будет выглядеть следующим образом:
//        Scanner scanner = ​ new​Scanner(System.​ in​ );
//        int​number = scanner.​ nextInt​ ();
//        switch​ (number) {
//        ​ case​​ 10​ :
//        ​ case​​ 20​ :
//        ​ case​​ 30​ :
//        System.​ out​ .​ println​ (​ "привет"​ );
//        ​ break​ ;
//        } 2
//        ) В операторе ​ switch​также может использоваться команда ​ default​ . Эта команда
//        нужна для того, чтобы описать, что будет выполняться, если ни одно из
//        вышеописанных условий не покажет совпадение.
//        Пример:​Мы хотим выводить в консоль слово “привет”, если пользователь ввел число
//        10, 20 или 30. Но если пользователь ввел любое другое число, мы хотим выводить на
//        экран слово “пока”.
//        Код оператора ​ switch​для этого:
//        switch​ (number) {
//        ​ case​​ 10​ :
//        ​ case​​ 20​ :
//        ​ case​​ 30​ :
//        System.​ out​ .​ println​ (​ "привет"​ );
//        ​ break​ ;
//        ​ default​ :System.​ out​ .​ println​ (​ "пока"​ );
//        } Д
//        оп. информация по ключевому слову ​ break​ :
//        Ключевое слово ​ break​прерывает выполнение структур ​ for​ , ​ while​и ​ switch​ .
//        При этом, ​ break​прерывает только ту структуру, внутри которой он был вызван, но не
//        прерывает внешние структуры.
//        Например, если один цикл ​ for​вложен внутрь другого цикла ​ for​ :
//        for​(​ int​i = ​ 0​ ; i < ​ 10​ ; i++) {
//        ​fo
//        r​(​ int​j = ​ 0​ ; j < ​ 10​ ; j++) {
//        System.​ out​ .​ print​ (j + ​ " "​ ); ​ // выводим j на одной строке
//        ​ if​(j == ​ 5​ )
//        ​ break​ ;
//        } S
//        ystem.​ out​ .​ println​ (); ​ // переходим на следующую строку
//        } b
//        reak, вызванный внутри вложенного цикла ​ for​прервет выполнение только этого
//        вложенного цикла, а внешний цикл ​ for​будет работать.
//        Поэтому вывод вышеописанного кода будет следующим:
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        Строк 10, то есть внешний цикл ​ for​отработал в полном размере, но столбцов только
//        6. Значит каждый раз внутренний цикл ​ for​прерывался из-за ​ break​ .
//        Задачи:
//        1. Реализовать программу, которая в консоль выводит название страны, принимая на
//        вход название города. Программа должна работать до тех пор, пока не будет введено
//        слово “​ Stop​ ”.
//        Реализовать, используя следующие данные:
//        Москва, Владивосток, Ростов - Россия
//        Рим, Милан, Турин - ИталияЛиверпуль, Манчестер, Лондон - Англия
//        Берлин, Мюнхен, Кёльн - Германия
//        При вводе любого другого города, вывести сообщение “Неизвестная страна”.
//        Пример:
//        Милан​- ваш ввод в консоль
//        Италия​- ответ программы
//        Дублин​- ваш ввод в консоль
//        Неизвестная страна​- ответ программы
//        Stop​- ваш ввод в консоль
//        *программа завершила работу*
//        2. Реализовать программу, которая пока работает, принимает на вход от пользователя
//        два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
//        результат деления и выводит его в консоль. Программа останавливает свою работу
//        тогда, когда пользователь вводит 0 в качестве делителя.
//        (для этих вещественных чисел необходимо использовать тип ​ double​и метод
//        nextDouble()​у ​ Scanner​ ’а соответственно).
//        Пример:
//        1 2​- ваш ввод в консоль
//        0.5​- ответ программы
//        100 77​- ваш ввод в консоль
//        1.2987012987012987​- ответ программы
//        3 0​- ваш ввод в консоль
//        работа программы завершается
//        3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
//        делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
//        и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
//        того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
//        выводим в консоль сообщение “Деление на 0”.
//        Ключевое слово ​ else​использовать в этой программе нельзя.
//        Пример:
//        4 2​- ваш ввод в консоль
//        2.0​- ответ программы
//        100 0​- ваш ввод в консоль
//        Деление на 0​- ответ программы
//        13 10​- ваш ввод в консоль
//        1.3​- ответ программы
//        и так далее… (еще 2 итерации)