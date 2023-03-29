public class Employee {

    private String name;
    private String surName;
    private String patronymic;
    private int department;
    private double salary;
    private  static int count = 1;
    private int id;


    public Employee(String name, String surName, String patronymic, int department, int salary) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = count;
        this.count ++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
