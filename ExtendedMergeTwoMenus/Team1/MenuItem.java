public class MenuItem implements MenuComponent {
    private String item;

    public MenuItem(String item) {
        this.item = item;
    }

    public void print() {
        System.out.print("MenuItem:" + item + "\n");
    }
}
