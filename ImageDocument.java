package Prak10;

public class ImageDocument implements IDocument {
    String path ="\\C:\\Users\\коля\\Desktop\\Files";
    String name ="ImageFile.png";
    ImageDocument(){
    }
    ImageDocument(String Path,String name){
        this.path = path;
        this.name = name;
    }
    public IDocument getType(){
        return new ImageDocument();
    }
    public String getTypeToString(){
        return "ImageDocument";
    }
    public String getPath(){
        return path;
    }
    public String getName(){
        return name;
    }
}
