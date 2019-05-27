import java.util.Scanner; 
import java.util.Map;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        Client client = new Client();
        EditorApplication editorApplication = new EditorApplication();
        Document document = new Document();
        editorApplication.carry(document);
        Scanner input = null;
        try{
            input = new Scanner(new FileReader(args[0]));
        }catch(IOException e){
            e.printStackTrace();
        }
        while(input.hasNext()){
            client.click(editorApplication.getItem(input.next()));
        }
    }
}

class Document{

}

class Menu{
    Menu(){
        this._itemMap = new HashMap<>();
        this._itemMap.put("Cut", new CutItem());
        this._itemMap.put("Copy", new CopyItem());
        this._itemMap.put("Paste", new PasteItem());
    }
    public void setDocument(Document document){
        for(MenuItem item: this._itemMap.values()){
            item.setDocument(document);
        }
    }
    public MenuItem getItem(String command){
        return _itemMap.get(command);
    }
    private Map<String, MenuItem> _itemMap;
}

abstract class MenuItem{
    public void setDocument(Document document){
        this._document = document;
    }
    private Document _document;
    public void click(){}
}

class CutItem extends MenuItem{
    public void click(){
        System.out.println("Cut~");
    }
}

class CopyItem extends MenuItem{
    public void click(){
        System.out.println("Copying");
    }
}

class PasteItem extends MenuItem{
    public void click(){
        System.out.println("Paste Done");
    }
}

class Client{
    public void click(MenuItem menuItem){
        menuItem.click();
    }
}

class EditorApplication{
    EditorApplication(){
        _menu = new Menu();
    }
    public void carry(Document document){
        this._document = document;
        this._menu.setDocument(document);
    }
    MenuItem getItem(String command){
        return _menu.getItem(command);
    }
    private Document _document;
    private Menu _menu;
}
