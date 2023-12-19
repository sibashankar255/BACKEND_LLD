package DesignPattern.overview.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(int x) {

        System.out.println("employee dao created");
    }
}
