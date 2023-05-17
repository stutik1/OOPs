package StreamExample;

import java.util.Objects;

public class Employee {
    int emp_id, salary;
    String name, address, department, email;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmp_id() == employee.getEmp_id() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getEmail(), employee.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp_id(), getSalary(), getName(), getAddress(), getDepartment(), getEmail());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
