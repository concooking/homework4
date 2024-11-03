public class Main {
    public static void main(String[] args) {
    // Задача 1
    System.out.println("Задача 1");
    int salaryMonth = 29000;
    int totalSalary = 0;
    int i = 0;
        while (totalSalary <= 2_459_000) {
        totalSalary = totalSalary + 15_000;
        totalSalary = totalSalary + salaryMonth;
        System.out.println("Месяц " + i + " сумма накоплений равна " + totalSalary + " рублей");
        }
    }
}