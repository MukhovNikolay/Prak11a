package Prak10;

public class TextDocument implements IDocument{
    String path ="\\C:\\Users\\коля\\Desktop\\Files";
    String name ="TextFile.txt";
    TextDocument(){
    }
    TextDocument(String path,String name){
        this.path = path;
        this.name = name;
    }
    public IDocument getType(){
        return new TextDocument();
    }
    public String getPath(){
        return path;
    }
    public String getName(){
        return name;
    }
    public String getTypeToString(){
        return "TextDocument";
    }
}
