package HashCode;

public class Employee {
    public int empId;
    public String name;
    public String companyName;
    public int age;
    public long salary;

    public Employee(String name, int empId, int age, String companyName) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.salary = salary;
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "name: " + name + " empId : " + empId + " age: " + age + " Company :" + companyName;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == getClass()) {
            return false;
        } else {
            Employee otherEmployee = (Employee) obj;
            if (otherEmployee.empId == this.empId
                    && otherEmployee.name == this.name
                    && otherEmployee.age == this.age
                    && otherEmployee.companyName == this.companyName) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return 31 * (this.empId + this.age + name.hashCode() + companyName.hashCode());
    }

    //toString()
    //hashcode()
    //equals()
}
