package Prak10;

public class TestFrame {
    public static void main(String[] args){
        MusicDocument MDc1 = new MusicDocument();
        TextDocument TDc1 = new TextDocument();
        CreateTextDocument FTdc1 = new CreateTextDocument();
        CreateMusicDocument FMdc1 = new CreateMusicDocument();
        new Frame(TDc1,FTdc1);
    }
}
