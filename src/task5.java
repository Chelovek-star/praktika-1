public class task5 {
    public static void main(String[] args) {
        String product = "Coffee";
        int quantity = 3;
        double price = 1250.0;
        double discountPercent = 10.0;
        double totalPrice = quantity * price;
        double discountAmount = totalPrice * (discountPercent / 100);
        double finalPrice = totalPrice - discountAmount;
        System.out.println("Тауар атауы: " + product);
        System.out.println("Саны: " + quantity);
        System.out.println("Өз бағасы: " + totalPrice);
        System.out.println("Жеңілдік сомасы: " + discountAmount);
        System.out.println("Қорытынды құны: " + finalPrice);
    }
}

