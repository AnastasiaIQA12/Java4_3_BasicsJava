public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int MonthPay = (int) service.calculate(1_000_000, 3, 9.99f);
        System.out.println(MonthPay);
        int MonthPay1 = (int) service.calculate(1_000_000, 2, 9.99f);
        System.out.println(MonthPay1);
        int MonthPay2 = (int) service.calculate(1_000_000, 1, 9.99f);
        System.out.println(MonthPay2);

    }
}
