package homework11.task8;

public class Print {
    public static void main(String[] args) {

        SubscriptionPlan.comparePlans(SubscriptionPlan.FREE, SubscriptionPlan.BASIC);
        SubscriptionPlan.comparePlans(SubscriptionPlan.ENTERPRISE, SubscriptionPlan.PREMIUM);
        SubscriptionPlan.comparePlans(SubscriptionPlan.FREE, SubscriptionPlan.FREE);

        SubscriptionPlan.FREE.printBenefits();
        SubscriptionPlan.BASIC.printBenefits();
        SubscriptionPlan.PREMIUM.printBenefits();
        SubscriptionPlan.ENTERPRISE.printBenefits();

    }
}
