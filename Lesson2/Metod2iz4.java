/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
Во всех остальных случаях метод должен возвращать false.

Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас.
Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат.
Попробуйте составить формулу с использованием булевых операторов.
Если не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.

При записи сложных выражений рекомендуется использовать скобки, чтобы не запутаться в порядке применения операторов.

В качестве примера уже указано заведомо некорректное решение задачи. Исправьте его.

Совет тем, у кого не проходит какой-то из тестов.
В данной задаче возможно всего 16 комбинаций значений входных параметров.
Их можно выписать на бумажку, посчитать для них правильные ответы и сравнить с тем, что выдает ваше решение.
Попробуйте самостоятельно проделать это, найти ошибку и исправить решение.
 */
import java.util.Scanner;
public class Metod2iz4 {
    public static void main(String[] args) {
        System.out.println("Введите 4 параметра через Enter, каждый true/false.\nПараметр 1: ");
        Scanner input =new Scanner(System.in);
        boolean par1=input.nextBoolean(); //Вводим первый параметр
        System.out.println("Параметр 2: ");
        boolean par2=input.nextBoolean();
        System.out.println("Параметр 3: ");
        boolean par3=input.nextBoolean();
        System.out.println("Параметр 4: ");
        boolean par4=input.nextBoolean();
        System.out.println(logic(par1,par2,par3,par4));
    }
    public static boolean logic(boolean a,boolean b,boolean c,boolean d){
        int counter =0;
        if (a) {
            counter = counter + 1;
        }
        if (b) {
            counter = counter + 1;
        }
        if (c) {
            counter = counter + 1;
        }
        if (d) {
            counter = counter + 1;
        }
        switch (counter) {
            case 2:
                return true;
            default:
              return false;
        }
    }
}




