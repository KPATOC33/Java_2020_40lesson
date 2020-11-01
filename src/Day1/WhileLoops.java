package Day1;

//Урок 4: Цикл while.
//https://www.youtube.com/watch?v=15PjODTSTaw&feature=youtu.be&ab_channel=alishev
public class WhileLoops {
    public static void main(String[] args) {
        // boolean u = 5==3; //5 равно 3 ? -false
        // System.out.println(u);
        //***********
        //int value = 7;
        //boolean t =value>5 ;
        // System.out.println(t);
        //***************
        //цикл while выполняется пока нам выдает true
        int value = 0;
        while (value<5) { //value меньше 5 ?
            System.out.println("Hello"+ value);
            value = value+1; //увеличение на +1
        }

    }
}
//"C:\Program Files\Java\jdk1.8.0_271\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\lib\idea_rt.jar=61818:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_271\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\rt.jar;E:\Рабочий Стол\GIThab\java_lessons_alishev\out\production\java_lessons_alishev" WhileLoops
//Hello0
//Hello1
//Hello2
//Hello3
//Hello4
//
//Process finished with exit code 0