public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int salaryMonth = 15000;
        int totalSalary = 0;
        int s = 1;
        while (totalSalary < 2_459_000) {
            totalSalary = totalSalary + salaryMonth;
            s++;
            System.out.println("Месяц " + s + " сумма накоплений равна " + totalSalary + " рублей");
        }
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int g = 10; g > 0; g--) {
            System.out.print(g + " ");
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            people += people * birthRate / 1000 - people * mortalityRate / 1000;
            System.out.println("Год " + year + " Численность населения составляет " + people);
        }
        System.out.println();
        // Задача 4
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int monthDeposit = 0;
        while (depositAmount <= 12_000_000) {
            depositAmount *= 1.07;
            monthDeposit++;
            System.out.println("Месяц " + monthDeposit + ", сумма накопления равна " + depositAmount + " рублей");
        }
        System.out.println("Задача 5");
        double depositOfAmount = 15000;
        int monthOfDeposit = 0;
        while (depositOfAmount <= 12_000_000) {
            monthOfDeposit++;
            depositOfAmount *= 1.07;
            if (monthOfDeposit % 6 == 0)
                System.out.println("Месяц " + monthOfDeposit + ", сумма накопления равна " + depositOfAmount + " рублей");
        }
        // Задача 6
        System.out.println("Задание 6");
        double originalAmount = 15000;
        int investmentTime = 12 * 9;
        for (int j = 1; j <= investmentTime; j++) {
            originalAmount *= 1.07;
            if (j % 6 == 0)
                System.out.printf("Месяц %s накопленя %.2f\n", j, originalAmount);
        }
        // Задача 7

        System.out.println("Задание 7");
        int friday = 5;
        for (int k = friday; k <= 31; k += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет.\n", k);
        }
        // Задача 8
        System.out.println("Задание 8");
        int currentOfYear = 2024;
        int twoHundredYearsAgo = 1824;
        int hundredYearsAhead = 2124;
        for (int j = 0; j <= hundredYearsAhead; j += 79) {
            if (j >= twoHundredYearsAgo && j <= hundredYearsAhead) {
                System.out.println(j);
            }
        }
    }
}