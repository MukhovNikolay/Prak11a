package Prak10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Frame extends JFrame {
    Frame(IDocument document,ICreateDocument factory) {
        JFrame F1 = new JFrame("Document constructor");
        JMenu file = new JMenu("File");
        JMenuBar M1 = new JMenuBar();
        JMenuItem New = new JMenuItem("New");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Exit = new JMenuItem("Exit");
        JTextField Field1 = new JTextField(20);
        JTextArea Ar1 = new JTextArea();
        JPanel pnl1 = new JPanel();
        pnl1.setBounds(0,50,600,350);
        Ar1.setBounds(0,50,600,350);
        Field1.setBounds(0,0,600,50);
        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Exit);
        M1.add(file);
        F1.setJMenuBar(M1);
        F1.setSize(600,400);
        F1.setLayout(null);
        F1.add(pnl1);
        F1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        New.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F1.remove(Field1);
                pnl1.remove(Ar1);
                F1.add(Field1);
                Field1.setText("Создан новый "+ document.getTypeToString()+" "+document.getName());
                File file1 = new File(document.getPath()+"\\"+document.getName());
                try{
                    file1.delete();
                    file1.createNewFile();
                }catch (IOException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
        Open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try (FileReader r1 = new FileReader(document.getPath()+"\\"+document.getName())){
                    char[] buf = new char[256];
                    int flag;
                    while((flag = r1.read(buf))>1) {
                        if(flag<256) {
                            buf = Arrays.copyOf(buf,flag);
                        }
                    }
                    StringBuilder sb1 = new StringBuilder(buf.length);
                    for(Character c: buf){
                        sb1.append(c.charValue());
                    }
                    String st1 = sb1.toString();
                    F1.remove(Field1);
                    F1.add(Field1);
                    Field1.setText("Открыт "+ document.getTypeToString()+" "+document.getName());
                    Ar1.setText(st1);
                    pnl1.add(Ar1);
                }
                catch (IOException e1){
                    System.out.println("Файл не найден");
                }
            }
        });
        Save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = Ar1.getText();
                File file1 = new File(document.getPath() + "\\" + document.getName());
                try (FileWriter writer = new FileWriter(file1,false)){;
                    writer.write(str);
                    pnl1.remove(Ar1);
                    F1.remove(Field1);
                    F1.add(Field1);
                    Field1.setText("Документ "+ document.getTypeToString()+" "+document.getName() +" сохранен");
                }catch (IOException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
        Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                pnl1.remove(Ar1);
                F1.remove(Field1);
                F1.add(Field1);
                Field1.setText("Документ "+ document.getTypeToString()+" "+document.getName() +" закрыт");
            }
        });
        F1.setVisible(true);
    }
}
