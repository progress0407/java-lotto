package domain;

/**
 * Rank.java
 * 이윤을 구하고 담는 Wrapper 클래스
 *
 * @author Kimun Kim, github.com/tributetothemoon
 * @author Daeun Lee, github.com/da-nyee
 */
public class Profit {
    private final double profit;

    private Profit(double profit) {
        this.profit = profit;
    }

    public static Profit of(Money budget, Money reward) {
        return new Profit(reward.toLong() / (double) budget.toLong());
    }

    public double toDouble() {
        return this.profit;
    }
}
