package TE1;

public class  Employee{

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private double getMonthlySalary() {
        return monthlySalary;
    }

    private void setMonthlySalary(double monthlySalary) {
        this.monthlySalary=(monthlySalary>=0)?monthlySalary:0.0;
    }
    public void raise(double raisePercentage){
        if (!(raisePercentage < 0)) {
            this.setMonthlySalary(this.getMonthlySalary()+
                    this.getMonthlySalary()*raisePercentage);
        }
    }
    private double yearlySalary(){
        return (this.getMonthlySalary()*12);
    }
    @Override
    public String toString() {
        return "First Name:"+this.getFirstName() +".\t\tlast Name:"+this.getLastName()
                +"\t\tMonthly Salary: "+this.getMonthlySalary()+"\t\tYearly Salary: "+this.yearlySalary();
    }
}