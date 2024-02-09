package task;

import java.util.Scanner;

public class ConsoleInterfase {
    public static void consoleInterfasee(){
      UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        boolean res = true;
        while(res) {
            System.out.println();
            System.out.println("***************************************");
            System.out.println("1: Создание пользователя. ");
            System.out.println("2: Получения пользователя.");
            System.out.println("3: Обновления пользователя ");
            System.out.println("4: Удаления пользователя");
            System.out.println("5: Сортировка пользователей по имени");
            System.out.println("6: Сортировка пользователей по email");
            System.out.println("7: Вывод списка пользователей");
            System.out.println("8: Выход из программы");
            System.out.println("***************************************");
            System.out.println();
            System.out.print("Выберите нужный пункт меню: ");

            int kons = scanner.nextInt();
            scanner.nextLine();
            switch (kons) {
                case 1:
                    System.out.println();
                    System.out.print("Введите id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();

                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print ("введите email: ");
                    String email = scanner.nextLine();

                    System.out.print("Введите адрес: ");
                    String adress = scanner.nextLine();

                    userManager.creatUser(id, name, age, email, adress);
                    System.out.println();
                    System.out.println("Пользователь успешно создан!");
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Введите id: ");
                    int one = scanner.nextInt();
                    scanner.nextLine();
                    if (!(one == 0)) {
                        System.out.println(userManager.getUser(one));
                        break;
                    }
                    System.out.println("Пользователь с таким id " + one + " не найден!");
                    break;
                case 3:
                    System.out.print("Введите id: ");
                    int idUp = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Введите имя: ");
                    String nameUp = scanner.nextLine();

                    System.out.print("Введите возраст: ");
                    int ageUp = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("введите email: ");
                    String emailUp = scanner.nextLine();

                    System.out.print("Введите адрес: ");
                    String adressUp = scanner.nextLine();

                    userManager.UpdateUser(new User(idUp, nameUp, ageUp, emailUp, adressUp));
                    break;
                case 4:
                    System.out.print("Введите id: ");
                    int remove = scanner.nextInt();

                    userManager.removeUser(remove);
                    break;
                case 5:
                    userManager.sortListName();
                    System.out.println("Сортировка по имени выполнена успешно! ");
                    System.out.println();
                    break;
                case 6:
                    userManager.sortListAdress();
                    System.out.println("Сортировка по email выполнена успешно!");
                    System.out.println();
                    break;
                case 7:
                    userManager.konsol();
                    break;
                case 8:
                    res = false;
                    break;
                default:
                    System.out.println("Неверная команда , попробуйте заново: ");
                    break;
            }

        }
    }
}
