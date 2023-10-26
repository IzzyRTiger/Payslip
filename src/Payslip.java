class Payslip {
    private String name;
    private int hourlyRate;
    private int hoursWorked;
    private static final double taxRate = 0.30;

    public Payslip(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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


}
