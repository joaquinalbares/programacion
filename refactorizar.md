### EJEMPLO 01

```java
public class InvoicePrinter {
    public void printInvoiceA() {
        System.out.println("Invoice A");
        System.out.println("Date: 2025-04-23");
        System.out.println("Customer: John Doe");
        System.out.println("Amount: $100");
    }

    public void printInvoiceB() {
        System.out.println("Invoice B");
        System.out.println("Date: 2025-04-23");
        System.out.println("Customer: Jane Smith");
        System.out.println("Amount: $200");
    }

    public static void main(String[] args) {
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoiceA();
        printer.printInvoiceB();
    }
}
```

### EJEMPLO 02
```java
public class ReportGenerator {
    public void generateReport() {
        fetchData();
        filterData();
        calculateTotals();
        formatReport();
        exportToPDF();
        sendEmail();
        System.out.println("Report generation completed.");
    }

    private void fetchData() {
        System.out.println("Fetching data...");
    }

    private void filterData() {
        System.out.println("Filtering data...");
    }

    private void calculateTotals() {
        System.out.println("Calculating totals...");
    }

    private void formatReport() {
        System.out.println("Formatting report...");
    }

    private void exportToPDF() {
        System.out.println("Exporting to PDF...");
    }

    private void sendEmail() {
        System.out.println("Sending email with report...");
    }

    public static void main(String[] args) {
        new ReportGenerator().generateReport();
    }
}

```


### EJEMPLO 03
```java
public class EmployeeData {
    private String name;
    private int age;
    private String position;
    private String department;
    private String email;
    private String phone;
    private String address;
    private double salary;

    public EmployeeData(String name, int age, String position, String department,
                        String email, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    // Getters if needed
    public String toString() {
        return String.format("Name: %s\nAge: %d\nPosition: %s\nDepartment: %s\nEmail: %s\nPhone: %s\nAddress: %s\nSalary: %.2f",
                name, age, position, department, email, phone, address, salary);
    }
}
```
