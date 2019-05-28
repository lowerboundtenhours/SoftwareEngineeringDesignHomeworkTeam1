public interface MenuIterator {
    public MenuItem first();
    public void next();
    public boolean isDone();
    public MenuItem currentItem();
}

