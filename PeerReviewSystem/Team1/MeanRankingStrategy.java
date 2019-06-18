import java.util.ArrayList;

public class MeanRankingStrategy implements RankingStrategy {

    public float calc(ArrayList<Float> values) {
        float sum = 0;
        for (float value: values) {
            sum += value;
        }

        return sum / values.size();
    }
}