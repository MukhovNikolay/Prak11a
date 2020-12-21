package Prak10;

public class MusicDocument implements IDocument{
    String path ="\\C:\\Users\\коля\\Desktop\\Files";
    String name ="MusicFile.mp4";
    MusicDocument(String path,String name){
    }
    MusicDocument(){
        this.path = path;
        this.name = name;
    }
    public IDocument getType(){
        return new MusicDocument();
    }
    public String getTypeToString(){
        return "MusicDocument";
    }
    public String getPath(){
        return path;
    }
    public String getName(){
        return name;
    }
}
