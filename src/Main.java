import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer;
        Scanner in = new Scanner(System.in);
        TestText results = new TestText();
        TestText questions = new TestText();
        TestText answers = new TestText();
        System.out.println("Здравствуйте, этот тест предназначен для выяснения ваших\nличностных качеств. Для запуска наберите цифру 1. Ответы выбирайте с помощью цифр.");
        answer = in.nextInt();
        int count = 0;
        if (answer == 1) {
            for (int i = 0; i < questions.questions.length; i++) {
                System.out.println(questions.questions[i] + answers.answers[i]);
                answer = in.nextInt();
                switch (answer) {
                    case 1:
                        count -= 2;
                        break;
                    case 2:
                        count += 3;
                        break;
                    case 3:
                        count += 5;
                        break;
                    case 4:
                        count -= 1;
                        break;
                    default:
                        System.out.println("Вы ввели неправильное значение!");
                        System.exit(0);
                }
            }
            if (count < 0) System.out.println(results.results[0]);
            else if (count >= 0 && count < 5) System.out.println(results.results[1]);
            else if (count >= 5 && count < 10) System.out.println(results.results[2]);
            else if (count >= 10 && count < 15) System.out.println(results.results[3]);
            else if (count >= 15 && count < 20) System.out.println(results.results[4]);
            else System.out.println(results.results[5]);
        }

        else System.out.println("Выход...");
    }
}
