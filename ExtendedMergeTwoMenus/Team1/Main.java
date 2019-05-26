import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Menu dinerMenu = null;
        Menu pancakeMenu = null;
        Menu menu = null;
        boolean hasSubMenu = false;
        
        try {
            File input = new File(args[0]);
            BufferedReader reader = new BufferedReader(new FileReader(input)); 
            String line;

            while((line = reader.readLine()) != null) {
                if (line.equals("PancakeHouse")) {
                    if ((dinerMenu != null) && (hasSubMenu == true)) {
                        // follow by the subMenu
                        dinerMenu.add(menu);
                        hasSubMenu = false;
                    } else if (dinerMenu == null) {
                        // follow by the dinerMenu
                        dinerMenu = menu;
                    }
                    menu = new PancakeMenu();
                
                } else if (line.equals("Diner")) {
                    if (menu != null) {
                        // follow by the pancakeMenu
                        pancakeMenu = menu;
                    }
                    menu = new DinerMenu();
                
                } else if (line.equals("SubMenu")) {
                    hasSubMenu = true;
                    if (dinerMenu == null) {
                        // follow by the dinerMenu
                        dinerMenu = menu;
                    } else {
                        // follow by the subMenu
                        dinerMenu.add(menu);
                    }
                    menu = new DinerMenu();
                
                } else {
                    MenuItem item = new MenuItem(line);
                    menu.add(item);
                }
            }

            if (hasSubMenu == true)
                dinerMenu.add(menu);
            
            if (pancakeMenu == null)
                pancakeMenu = menu;
            else if (dinerMenu == null)
                dinerMenu = menu;

            Waitress waitress = new Waitress((PancakeMenu)pancakeMenu, (DinerMenu)dinerMenu);
            waitress.print();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
