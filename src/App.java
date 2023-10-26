import java.util.Scanner;

public class App {
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
    System.out.println("Name:\t\t\t" + Payslip.getName());
    System.out.println("Hourly rate:\t\t$" + Payslip.getHourlyrate());
    System.out.println("Hours worked:\t\t" + Payslip.getHoursWorked());
    System.out.println(" ");
    System.out.println("Salary before tax:\t$" + Payslip.calculateSalary());
    System.out.println("Salary after tax:\t$" + Payslip.calculateNetSalary());
    System.out.println("If you have any questions regarding your salary, contact Bob");
    System.out.println("--------------------");

    scanner.close();
    }
}
