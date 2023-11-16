package DesignPattern.PrototypeRegistry;

public class IntelligentStudent extends Student{
    int iQ;


//    public IntelligentStudent(){
//
//    }

    //copy constructor
    public IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iQ=s.iQ;
    }

    public IntelligentStudent() {
        super();

    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
