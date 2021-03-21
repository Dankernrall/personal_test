import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer = 0;
        int numberofquestion = 0;
        Scanner in = new Scanner(System.in);
        TestText testText = new TestText();
        System.out.println("Здравствуйте, этот тест предназначен для выяснения ваших\nличностных качеств. Для запуска наберите цифру 1. Ответы выбирайте с помощью цифр.");
        try {
            answer = in.nextInt();
        } catch (Exception InputMismatchException) {
            System.err.print("Выход...");
        }
        int count = 0;
        if (answer == 1) {
            for (int i = 0; i < testText.questions.length; i++) {
                System.out.println(testText.questions[i] + testText.answers[i]);
                answer = in.nextInt();
                if(numberofquestion == 0 && answer == 3 | answer == 4){i--;continue;}
                else if(numberofquestion == 4 && answer == 4){i--;continue;}
                switch (answer) {
                    case 1:
                        count -= 2;
                        numberofquestion++;
                        break;
                    case 2:
                        count += 3;
                        numberofquestion++;
                        break;
                    case 3:
                            count += 5;
                            numberofquestion++;
                            break;
                    case 4:
                        count -= 1;
                        numberofquestion++;
                        break;

                    default:
                        System.out.println("Вы ввели неправильное значение!");
                        System.exit(0);
                }
            }
            if (count < 0) System.out.println(testText.results[0]);
            else if (count >= 0 && count < 5) System.out.println(testText.results[1]);
            else if (count >= 5 && count < 10) System.out.println(testText.results[2]);
            else if (count >= 10 && count < 15) System.out.println(testText.results[3]);
            else if (count >= 15 && count < 20) System.out.println(testText.results[4]);
            else System.out.println(testText.results[5]);
        }
    }
}
