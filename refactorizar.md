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




