public class Waitress {
    private PancakeMenu pancakeMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeMenu pancakeMenu, DinerMenu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void print() {
        System.out.println("PancakeHouseMenu:");
        this.pancakeMenu.print();
        System.out.println("DinerMenu:");
        this.dinerMenu.print();
    }
}
