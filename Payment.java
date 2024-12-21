public class Payment {
    private final double fee;
    private String paymentStatus;

    public Payment(double fee,String paymentStatus ) {
        this.fee = fee;
        this.paymentStatus = "Pending";
    }

    public void processPayment() {
        this.paymentStatus = "Completed";
        System.out.println("Payment of " + fee + " processed successfully.");
    }

    public void generateReceipt() {
        System.out.println("Receipt: Paid " + fee + " for parking.");
    }

    public void printPaymentStatus() {
        System.out.println("Payment status: " + paymentStatus);
    }
}