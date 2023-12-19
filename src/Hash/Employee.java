package Hash;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

//    public Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean equals(Object o){
//        if (o==null || getClass() != o.getClass()){
//            return false;
//        }
//
//        if (o==this ){
//            return true;
//        }
//
//        Employee e =(Employee) o;
//        return (this.getId() == e.getId());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
