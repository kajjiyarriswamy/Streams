package org.example;

public class Employee {

    private  int age;
    private Integer employeeId;

    private String title;

    private String gender;

    private int salary;

    public Employee(Integer employeeId, String title,String gender, int salary,int age) {
        this.employeeId = employeeId;
        this.title = title;
        this.gender = gender;
        this.salary = salary;
        this.age=age;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
