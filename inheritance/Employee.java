public class Employee extends Person{
    private long employee_id;
    private String address;
    public Employee(String name, int age ,long employee_id,String address){
        super(name,age);
        this.employee_id = employee_id;
        this.address = address;
    }
}
