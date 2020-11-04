public class CreditPaymentService {
    public float calculate(int sum, int term, float bet) {
        int TermInMonth = term * 12;
        float BetInMonth = bet / 12 / 100;
        float a = (float) Math.pow(1 + BetInMonth, TermInMonth);
        float AnnuityRate = (BetInMonth * a) / (a - 1);
        float MonthCost = AnnuityRate * sum;
        return MonthCost;
    }
}
