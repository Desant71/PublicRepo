public class Main {
    public static void main(String[] args) {
        SalesManager sales = new SalesManager(new int[]{100, 200, 500, -2917, 50968});
        System.out.println(sales.max());
    }
}