package ExceptionTasks1;

import java.util.Scanner;

public class TestDrive {
    public static User[] getUsers() {
        User user1 = new User("john", "pass", "john@gmail.com", 24);
        User user2 = new User("Ironman", "qwerty12", "ironman@mail.ru", 15);//
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("Не подходит по возрасту");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User tom = getUserByLoginAndPassword(login, password);
        validateUser(tom);

        System.out.println("Доступ предоставлен");

    }
}
