package lotto.model;

import java.util.Arrays;
import java.util.EnumMap;

public class WinningStatistics {

    private final EnumMap<LottoRank, Integer> winningStatistics;

    public WinningStatistics() {
        winningStatistics = new EnumMap<>(LottoRank.class);
        Arrays.stream(LottoRank.values())
                .forEach(lottoRank -> winningStatistics.put(lottoRank, 0));
    }

    public void put(LottoRank lottoRank) {
        winningStatistics.put(lottoRank, winningStatistics.get(lottoRank) + 1);
    }

    public int get(LottoRank lottoRank) {
        return winningStatistics.get(lottoRank);
    }

    public double getEarningsRate(int money) {
        long totalPrize = getTotalPrize();
        return totalPrize / (double)money;
    }

    long getTotalPrize() {
        long totalPrize = 0;
        for (LottoRank lottoRank : winningStatistics.keySet()) {
            totalPrize += lottoRank.getPrizeMoney() * winningStatistics.get(lottoRank);
        }
        return totalPrize;
    }
}
