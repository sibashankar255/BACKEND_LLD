package DesignPattern.overview.structural.proxy;

public class Client {
    public static void main(String[] args) {
        EmployeeDao empDaoProxy = new EmployeeDaoProxy();
        empDaoProxy.create(05);
    }
}
