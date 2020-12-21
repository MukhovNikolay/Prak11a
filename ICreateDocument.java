package Prak10;

public interface ICreateDocument {
    IDocument CreateNew(String path,String name);
    IDocument CreateOpen(String path,String name);
}
