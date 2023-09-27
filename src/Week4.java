public class Week4 {
    public static String PriceOfTicket(int a) {
        String result = "";
        if (a < 50 || a > 300) {
            result = "Chiều cao không hợp lệ. Xin nhập lại";
        } else if (a < 100) {
            result = "Miễn Phí";
        } else if (a < 120) {
            result = "30000 đồng";
        } else if (a < 140) {
            result = "60000 đồng";
        } else if (a < 300) {
            result = "80000 đồng";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
