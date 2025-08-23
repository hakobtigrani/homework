package homework11.task8;

public enum SubscriptionPlan {

    FREE(0),
    BASIC(9.99),
    PREMIUM(19.99),
    ENTERPRISE(29.99);

    SubscriptionPlan(double MONTHLY_COST) {}

    public void printBenefits() {
        switch (this) {
            case FREE:
                System.out.println("FREE plan: Limited features, ads included.\n");
                break;
            case BASIC:
                System.out.println("BASIC plan: Access to standard features, no ads.\n");
                break;
            case PREMIUM:
                System.out.println("PREMIUM plan: All features, priority support.\n");
                break;
            case ENTERPRISE:
                System.out.println("ENTERPRISE plan: Custom solutions, dedicated support.\n");
                break;
        }
    }

    public static void comparePlans(SubscriptionPlan p1, SubscriptionPlan p2) {

        if (p1.compareTo(p2) > 0) {System.out.println(p1 + " is a higher tier than " + p2 + "\n");}
        else if (p1.compareTo(p2) < 0) {System.out.println(p2 + " is a higher tier than " + p1 + "\n");}
        else System.out.println(p1 + " and " + p2 + " are the same tier\n");

    }

}
