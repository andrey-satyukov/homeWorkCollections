import java.util.Arrays;

public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {

        employee[0] = new Employee("Иванов", "Иван", "Иванович", 3, 30000);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 3, 32000);
        employee[2] = new Employee("Сидоров1", "Сидор", "Сидорович", 3, 300_000);
        employee[3] = new Employee("Сидоров2", "Сидор", "Сидорович", 3, 300_000);
        employee[4] = new Employee("Сидоров3", "Сидор", "Сидорович", 3, 300_000);
        employee[5] = new Employee("Сидоров4", "Сидор", "Сидорович", 3, 300_000);
        employee[6] = new Employee("Сидоров5", "Сидор", "Сидорович", 3, 300_000);
        employee[7] = new Employee("Сидоров6", "Сидор", "Сидорович", 3, 300_000);
        employee[8] = new Employee("Сидоров7", "Сидор", "Сидорович", 3, 300_000);
        employee[9] = new Employee("Сидоров8", "Сидор", "Сидорович", 3, 300_000);
        listEmployes();
        System.out.println("Сумма затрат на з/п = " + amountCost());
        System.out.println("Сотрудник с минимальной з/п = " + findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной з/п = " + findEmployeeMaxSalary());
        System.out.println("Средняя з/п = " + averageSalary());
        listNames();
    }

    public static void listEmployes() {
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static double amountCost() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeMinSalary() {
        double min = 0;
        int k = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                k = i;
            }
        }
        return employee[k];
    }

    public static Employee findEmployeeMaxSalary() {
        double max = employee[0].getSalary();
        int k = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                k = i;
            }
        }
        return employee[k];
    }

    public static double averageSalary() {
        return amountCost() / employee.length;
    }

    public static void listNames() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getSurName() + " " + employee[i].getPatronymic());
        }
    }
}