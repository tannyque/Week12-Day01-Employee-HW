package Staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private int salary;

    public Employee(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus(){
       return this.salary * 0.01;
    }
}
