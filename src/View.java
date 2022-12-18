import java.util.Scanner;
public class View implements UIView {
    private Presenter presenter;
    private Scanner scanner;
    /**
     * общение с пользователем
     */
    public View() {
        scanner = new Scanner(System.in);
    }
    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }
    @Override
    public void start() {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("\033[1;34m***Выбирай, что будем делать***\033[0m");
                System.out.println("\033[1;34m1\033[0m - Создать первый массив чисел" +
                        "\n\033[1;34m2\033[0m - Вычислить разницу элементов" +
                        "\n\033[1;34m3\033[0m - Вычислить частное элементов" +
                        "\n\033[1;34m4\033[0m - Распечатать массивы" +
                        "\n\033[1;35mДля выхода нажмите (0)\033[0m");
                String key = scan.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.generateNumberLengsMass(minFirst(), maxFirst());
                        break;
                    case "2":
                        presenter.subtraction();
                        break;
                    case "3":
                        presenter.division();
                        break;
                    case "4":
                        presenter.print();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
    @Override
    public Integer minFirst() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input namber min -> ");
        Integer min = s.nextInt();
        return  min;
    }
    @Override
    public Integer maxFirst() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input namber max -> ");
        Integer max = s.nextInt();
        return  max;
    }
}
