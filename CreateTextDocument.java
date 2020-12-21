package Prak10;

public class CreateTextDocument implements ICreateDocument{
    TextDocument Tc1 = new TextDocument("\\C:\\Users\\коля\\Desktop\\Files","TextFile");
    public IDocument CreateNew(String path,String name) {
        return new TextDocument(path,name);
    }
    public IDocument CreateOpen(String path,String name){
        return new TextDocument(path,name);
    }
}
