package homework4pt2;

public class Homework4 {
    public static void main(String[] args) {
        int productNumber;
        String productName;
        double price;
        int amount;
        int days;
        double totalSales;
        double salesPerDay;
    //Order 1
        productNumber = 1;
        productName = "smartphone";
        price = 399.99;
        amount = 10;
        days = 5;
        totalSales = price * amount;
        salesPerDay = totalSales / days;
        System.out.println( "Product No " + productNumber + ": " + productName + ",");
        System.out.printf( "Total sales for %d days is EUR %.2f,%n", days, totalSales);
        System.out.printf( "Sales per day is EUR %.2f.%n", salesPerDay);
    //Order 2
        productNumber = 2;
        productName = "laptop";
        price = 1299.99;
        amount = 17;
        days = 7;
        totalSales = price * amount;
        salesPerDay = totalSales / days;
        System.out.println( "Product No " + productNumber + ": " + productName + ",");
        System.out.printf( "Total sales for %d days is EUR %.2f,%n", days, totalSales);
        System.out.printf( "Sales per day is EUR %.2f.%n", salesPerDay);
    }
}
