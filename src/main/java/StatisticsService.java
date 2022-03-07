public class StatisticsService {

    public long findsum(long[] incomes) {

        long sum = 0;

        for (long income : incomes) {

            sum += income;

        }

        return sum;

    }

    public long findmin(long[] incomes) {

        long min = incomes[0];

        for (long income : incomes)

            if (min > income)

                min = income;

        return min;

    }

    public long averageAmount(long[] incomes) {

        return findsum(incomes) / incomes.length;

    }

}

