public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int month_pay= (int) service.calculate(1_000_000,3,9.99f);
        System.out.println(month_pay);
        int month_pay1= (int) service.calculate(1_000_000,2,9.99f);
        System.out.println(month_pay1);
        int month_pay2= (int) service.calculate(1_000_000,1,9.99f);
        System.out.println(month_pay2);

    }
}
