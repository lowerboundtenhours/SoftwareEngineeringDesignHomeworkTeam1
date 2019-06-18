import java.util.ArrayList;
import java.util.Collections;

public class MedianRankingStrategy implements RankingStrategy {

    public float calc(ArrayList<Float> values) {
        Collections.sort(values);
        int idx = values.size() / 2 - 1;

        if (values.size() % 2 == 0) {
            return (values.get(idx) + values.get(idx + 1)) / 2;
        } else {
            return values.get(idx);
        }
        
    }
}