import java.util.HashMap;

public class MasterGameMain {
  private int currentIndex = 0;
  private int currentState = 0;
  private HashMap<Integer, Snapshot> snapshots = new HashMap<Integer, Snapshot>();

  public MasterGameMain() {
  }

  public void play() {
    currentState++;
    System.out.printf("Play~ Current State: %s\n", currentState);
  }

  /** Load snapshot given index. **/
  public void load(int index) {
    Snapshot snapshot = snapshots.get(index);
    int state = snapshot.getState();
    currentState = state;
    System.out.printf("Load!  Current State: %d\n", currentState);
  }

  /** Save current state to snapshots. **/
  public void save() {
    snapshots.put(currentIndex, new Snapshot(currentState));
    // For debugging
    // System.out.println(snapshots);
    currentIndex++;
  }

}
