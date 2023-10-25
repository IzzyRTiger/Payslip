import java.util.Scanner;

class Payslip {
    private String name;
    private int hourlyRate;
    private int hoursWorked;
    private static final double taxRate = 0.30;

    public Payslip() {

    }

    public Payslip(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyrate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int calculateSalary() {
        return hourlyRate * hoursWorked;

    }

    public double calculateNetSalary() {
        double salary = calculateSalary();
        return salary - (salary * taxRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("What is the empolyees name?");
        String name = scanner.nextLine();

    System.out.print("What is their hourly rate?");
        int hourlyRate = scanner.nextInt();

    System.out.print("How many hours did they work this month?");
        int hoursWorked = scanner.nextInt();

    Payslip Payslip = new Payslip(name, hourlyRate, hoursWorked);  

    System.out.println(" ");
    System.out.println("Calculating..."); 
    System.out.println(" ");
    System.out.println("--------------------");
    System.out.println("## PAYMENT INFORMATION ##");
    System.out.println("Name: " + Payslip.getName());
    System.out.println("Hourly rate: $" + Payslip.getHourlyrate());
    System.out.println("Hours worked: " + Payslip.getHoursWorked());
    System.out.println(" ");
    System.out.println("Salary before tax: $" + Payslip.calculateSalary());
    System.out.println("Salary after tax: $" + Payslip.calculateNetSalary());
    System.out.println("If you have any questions regarding your salary, contact Bob");
    System.out.println("--------------------");

    scanner.close();
    }
}

