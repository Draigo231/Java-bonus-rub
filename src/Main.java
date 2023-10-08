import java.awt.event.WindowFocusListener;

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
        boolean isRegistered = true;

        int depositAmount = 1100;

        int bonusRub; // кол-во бонусов, если пополнение на 1000 и более рублей
        if (isRegistered) {
            bonusRub = 1;
        } else {
            bonusRub = 0;
        }

        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100 * bonusRub;
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