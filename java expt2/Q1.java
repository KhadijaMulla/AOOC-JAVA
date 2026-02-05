class Employee{
    String firstname;
    String lastname;
    double salary;
    Employee(String myfirstname,String mylastname, double salary){
        this.firstname=myfirstname;
        this.lastname=mylastname;
        if(salary>0){
        this.salary=salary;
    }
        else {
        this.salary=0.0;
    }
    }
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }
    public String getfirstname(){
        return firstname;
    }
    public void setlastname(String lastname){
        this.lastname=lastname;
    }
    public String getlastname(){
        return lastname;
    }
    public void setsalary(double salary){
           if(salary>0){
            this.salary=salary;
    }
        
    }
    public double getsalary(){
        return salary;
    }
    public double yearsalary(){
        return salary*12;
    }
    public void rise(){
        salary=salary+(salary*0.10);
    }

}

public class Q1{
    public static void main(String[] args) {
        Employee e= new Employee("k", "m", 123);
        Employee e1=new Employee("a", "s", 456);
        //e.setfirstname("m");
        System.out.println(e.getfirstname());
        System.out.println(e.getlastname());
        //System.out.println(e.getsalary());
        // System.out.println(e.yearsalary());
        e.rise();
        System.out.println(e1.getsalary());
        System.out.println(e1.getfirstname());
        System.out.println(e1.getlastname());
        //System.out.println(e.getsalary());
        // System.out.println(e.yearsalary());
        e1.rise();
        System.out.println(e1.getsalary());
        



        
    }
}
