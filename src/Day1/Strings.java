package Day1;

//
//https://www.youtube.com/watch?v=-YK8B4WO7nI&feature=youtu.be&ab_channel=alishev
public class Strings {
    public static void main(String[] args) {
        int x = 5;
        //ссылочные данные -СТРОКИ
        // String -это класс и пишется с большой буквы
        String s = "Hello";
        //Опирация обьеденение строк
        String space = "";
        String name = " Bob";
        //оператор обьединение
        System.out.println(s+space+name);
        System.out.println("Hello "+""+" John");
        //Обьеденям с цифрами
        System.out.println("My number is "+x);
    }
}
//Hello Bob
//Hello  John
//My number is5
//
//Process finished with exit code 0