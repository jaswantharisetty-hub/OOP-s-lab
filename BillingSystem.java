public class BillingSystem {
    public static void main(String[] args) {
        InvoiceProcessor myInvoice = new RetailInvoice();
        System.out.println("--- Starting Invoice Processing ---");

        myInvoice.generateInvoice("CUST-1001", 500.00);
        System.out.println("\n--- Testing Internal Logic ---");
        myInvoice.processFinalBilling(1000.00);
    }
}

class InvoiceProcessor {
    public void generateInvoice(String customerId, double amount) {
        System.out.println("Generating Standard Invoice...");
        System.out.println("Customer: " + customerId);
        System.out.println("Base Amount: $" + amount);
    }
    public void processFinalBilling(double amount) {
        double tax = calculateInternalTax(amount);
        System.out.println("Standard Processor: Processing billing with tax: $" + tax);
    }

  
    private double calculateInternalTax(double amount) {
        return amount * 0.15; 
    }
}

class RetailInvoice extends InvoiceProcessor {
  
    public void generateInvoice(String customerId, double amount) {
        System.out.println("Generating RETAIL Invoice (Discount Applied)...");
        double discount = amount * 0.10; // 10% Retail Discount
        double finalAmount = amount - discount;
        
        System.out.println("Customer ID: " + customerId);
        System.out.println("Original: $" + amount);
        System.out.println("Retail Discount (10%): -$" + discount);
        System.out.println("Total Due: $" + finalAmount);
    }
}