package Prak10;

public class CreateMusicDocument implements ICreateDocument{
    MusicDocument Tc1 = new MusicDocument("\\C:\\Users\\коля\\Desktop\\Files","MusicFile");
    public IDocument CreateNew(String path,String name) {
        return new MusicDocument(path,name);
    }
    public IDocument CreateOpen(String path,String name){
        return new MusicDocument(path,name);
    }
}
