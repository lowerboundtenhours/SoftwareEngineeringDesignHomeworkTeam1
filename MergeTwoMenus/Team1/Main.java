import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<String> read_file(String filename) {
        List<String> allLines = new ArrayList<String>();
        try {
            allLines = Files.readAllLines(Paths.get(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public static void main(String[] args) {
        String filename = args[0];
        int mode = 0;
        ArrayList<ArrayList<String> > inputs = new ArrayList<ArrayList<String> >(2);
        inputs.add(new ArrayList<String>());
        inputs.add(new ArrayList<String>());
        for (String line : read_file(filename)) {
            if (line.equals("Diner")) {
                mode = 0;
            } else if (line.equals("PancakeHouse")) {
                mode = 1;
            } else {
                inputs.get(mode).add(line);
            }
        }
        DinerMenu dinerMenu = new DinerMenu(inputs.get(0));
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(inputs.get(1));

        System.out.println("PancakeHouseMenu:");
        traversePrint(pancakeHouseMenu.createIterator());

        System.out.println("DinerMenu:");
        traversePrint(dinerMenu.createIterator());
    }

    public static void traversePrint(MenuIterator iter) {
        while (!iter.isDone()) {
            System.out.println(iter.currentItem());
            iter.next();
        }
    }
}
