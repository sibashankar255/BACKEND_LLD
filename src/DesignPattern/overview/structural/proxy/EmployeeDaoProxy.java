package DesignPattern.overview.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(int x) {
        if (x==5){
            employeeDao.create(x);
        }else {
            throw new RuntimeException("not equal to 5");
        }
    }
}
