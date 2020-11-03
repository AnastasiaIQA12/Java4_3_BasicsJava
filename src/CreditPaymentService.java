public class CreditPaymentService {
    public float calculate (int sum,int term,float bet){
        int term_in_month = term *12;
        float bet_in_month = bet/12/100;
        float a = (float) Math.pow(1+bet_in_month,term_in_month);
        float annuity_rate = (bet_in_month * a)/(a-1);
        float month_cost= annuity_rate *sum;
        return month_cost;
    }
}
