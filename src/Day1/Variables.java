package Day1;

//Задание 1 - Переменные
// урок https://www.youtube.com/watch?v=lmK15qB_r70&feature=youtu.be&ab_channel=alishev
public class Variables{
    public static void main (String[] args) {
        // Целочисленные типы данных
        int myInt; //задекларировали переменную * каждое слово должно быть заглавным *int - будет целочисленное число
        myInt = 557; //Инициализируем переменную
        // int myInt = 557;  *можно и так
        short myShort = 3266;  //short вмещает 16 битные числа от -32 тысяч до +32 тысяч
        long myLong = 24724824; // вмещает 64 бита и хранит большие числа
        //тип данных DOUABLE - FLOAT * Вещественные типы данных
        double myDouble =235.35; // 64 хранит информаций
        float myFloat =2362.4f;   // 32 бита информаций * f дает понять что это не doable так как он по у молчинию
        //Тип данных СИМВОЛ
        char c = 'a'; //  символы в одинарных кавычках
        boolean b = true; // true  или false

        byte myByte = 100;  // числа от -128 до 128 числа
        System.out.println(myInt); // вывели на экран
    }
}
