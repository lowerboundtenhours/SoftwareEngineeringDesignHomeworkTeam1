
public class Criterion {
    
    private String name;
    private Level level;
    private String descriptor;

    public Criterion(String name, Level level, String desc) {
        this.name = name;
        this.level = level;
        this.descriptor = desc;
    }

    public String getName() {
        return this.name;
    }

    public Level getLevel() {
        return this.level;
    }

    public String getDescriptor() {
        return this.descriptor;
    }
}