package Prak10;

public class CreateImageDocument {
    ImageDocument Ic1 = new ImageDocument("\\C:\\Users\\коля\\Desktop\\Files","ImageFile");
    public IDocument CreateNew(String path,String name) {
        return new ImageDocument(path,name);
    }
    public IDocument CreateOpen(String path,String name){
        return new ImageDocument(path,name);
    }
}
