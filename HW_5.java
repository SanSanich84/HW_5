package HomeWork_5;
import javax.imageio.stream.FileImageOutputStream;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntToLongFunction;

public class HW_5 {

    public static void main(String[] args) {
        newEmployee();



    }
    public static void newEmployee()
    {   int j = 0;
        String[][] array = new String[3][6];
        Scanner scanner = new Scanner(System.in);
        employee employee = new employee();
        while (j<3) {
            System.out.println("Добавление карточки нового сотрудника:");
            System.out.print("Ф.И.О.: ");
            employee.FIO = scanner.next();
            System.out.println();
            System.out.print("Должность: ");
            employee.position = scanner.next();
            System.out.println();
            System.out.print("email: ");
            employee.eMail = scanner.next();
            System.out.println();
            System.out.print("Ном. телефона: ");
            employee.telephone = scanner.next();
            System.out.println();
            System.out.print("Оклад: ");
            employee.salary = scanner.nextFloat();
            System.out.println();
            System.out.print("Возраст: ");
            employee.age = scanner.nextInt();
            System.out.println();
            employee.consoleOut();
            int i = 0;
            array[j][i] = employee.FIO;
            i++;
            array[j][i] = employee.position;
            i++;
            array[j][i] = employee.eMail;
            i++;
            array[j][i] = employee.telephone;
            i++;
            array[j][i] = String.valueOf(employee.salary);
            i++;
            array[j][i] = String.valueOf(employee.age);
            i++;j++;
            System.out.println("Количество созданных элементов массива: " + j);

        }
        System.out.print(Arrays.deepToString(array).replace("], ", "]\n"));
        System.out.println();
        System.out.println("Список сотрудников в возрате от 40 лет: ");
        for (int i = 0; i < 3; i++) {
            if (Integer.valueOf(array[i][5]) >= 40){
                for (int k = 0; k <= 5; k++) {
                    System.out.print(array[i][k] + " ");
                }
                System.out.println();
            }

        }
    }
}
