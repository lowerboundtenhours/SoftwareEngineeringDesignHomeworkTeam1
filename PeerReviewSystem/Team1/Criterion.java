import java.util.ArrayList;

public class Criterion {
    
    private String name;
    private ArrayList<Descriptor> descriptors = new ArrayList<>();

    public Criterion(String name) {
        this.name = name;
    }
    public void addDescriptor (Level level, String desc) {
        this.descriptors.add(new Descriptor(level, desc));
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Descriptor> getDescriptors() {
        return descriptors;
    }
}
