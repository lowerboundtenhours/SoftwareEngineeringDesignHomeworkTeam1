public class Descriptor {
    private Level level;
    private String description;
    public Descriptor(Level level, String description) {
        this.level = level;
        this.description = description;
    }

    public Level getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}

