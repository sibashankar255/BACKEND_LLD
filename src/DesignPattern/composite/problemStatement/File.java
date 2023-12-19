package DesignPattern.composite.problemStatement;

public class File {
    String fileName;

    public File(String file){
        this.fileName=file;
    }

    public void ls(){
        System.out.println("file Name: "+fileName);
    }
}
