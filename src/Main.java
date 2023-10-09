// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int amount = 100; // кол-во денег на счету клиента (руб.)
        int depositAmount = 1100; // кол-во денег при пополнении счёта 

        int bonusRub; // множитель бонусов при соблюдении условия оператора
        if (depositAmount > 1000) {
            bonusRub = 1;
        } else {
            bonusRub = 0;
        }

        int bonus; // расчёт суммы бонусов при условии что попелнение больше чем на 1000
        int bonusDivider = 1000; // делитель для расчёта бонуса
        
        if (depositAmount > bonusDivider) {
            bonus = depositAmount  * bonusRub / 100;
        } else {
            bonus = 0;
        }

        int bonusFinal = depositAmount + bonus;
        
        System.out.println("Баланс (руб.): " + amount);
        System.out.println("Сумма пополнения (руб.): " + depositAmount);
        System.out.println("Баланс без учёта бонусов после пополнения (руб.): " + (amount + depositAmount));
        System.out.println("Сумма начисленных бонусов (руб.):" + bonus);
        System.out.println("Общий баланс с учётом бонусов (руб.):" + (bonus + amount +depositAmount));

    }
}
