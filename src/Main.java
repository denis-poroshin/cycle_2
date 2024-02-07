public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задание 1");
        int sum = 2_459_000;
        int save = 15_000;
        int total = 0;
        int month = 0;
        while (total <= sum)
        {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            total += save;
            month += 1;

        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задание 2");
        int num = 1;
        int number = 10;
        while (num <= number)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println(" ");
        for (int i = number; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 3");
        int totalPeopleCountryY = 12_000_000;
        int newTotalPeopleCountryY = 0;
        int birthRate = 17;
        int mortality = 8;

        for (int years = 1; years <= 10; years++)
        {
            totalPeopleCountryY += totalPeopleCountryY / 1000 * (birthRate - mortality);
            System.out.println("Год " + years + ", численность населения составляет " + totalPeopleCountryY);

        }
        System.out.println("Задание 4");
        double percent = 0.07;
        month = 0;
        save = 15_000;
        while (save <= 12_000_000)
        {

            System.out.println("Месяц " + month + ", сумма накоплений " + save);
            month += 1;
            save += save * percent;
        }
        System.out.println("Месяц " + month + ", сумма накоплений " + save);
        System.out.println("Задание 5");
        month = 0;
        save = 15_000;

        while (save <= 12_000_000)
        {


            month += 1;
            save += save * percent;
            if (month % 6 == 0)
            {
                System.out.println("Месяц " + month + ", сумма накоплений " + save);

            }
        }
        System.out.println("Задание 6");
        month = 0;
        save = 15_000;
        int maxMonth = 9 * 12;
        for (month = 1; maxMonth >= month; month++)
        {
            save += save * percent;
            if (month % 6 == 0)
            {
                System.out.println("Месяц " + month + ", сумма накоплений " + save);
            }
        }
        System.out.println("Задание 7");
        int friday = 5;
        total = 0;

        month = 31;
        for (int dey = 1; month >= dey; dey++)
        {
            total += 1;
            if (total == friday)
            {
                System.out.println("Сегодня пятница, " + dey + "-е число. Необходимо подготовить отчет");

            }
            if (total == 7)
            {
                total = 0;
            }
        }
        System.out.println("Задание 8");
        int thisYear = 2024;

        int nextYear = 2024 + 100;
        int appearanceCometYear = 79;
        total = 0;

        for (int lastYear = 1825; nextYear >= lastYear; lastYear++)
        {
            total++;

            if (total == appearanceCometYear)
            {
                System.out.println(lastYear);
                total = 0;
            }

        }















    }
}