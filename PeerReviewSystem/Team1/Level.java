
public class Level {
    private String name;
    private float score;

    public Level(String name, float score) {
        this.name = name;
        this.score = score;
    }

    public float getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }
}