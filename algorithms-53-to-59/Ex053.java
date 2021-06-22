public class Ex053 {
    public static void main(String[] args) throws InterruptedException {
        int[] num = new int[10];

        for (int i=0; i < num.length; i++) {
            num[i] = (i + 1);
        }
        System.out.println("Printing...");
        Thread.sleep(500);
        for (int j : num) {
            System.out.print(j + "  ");
            Thread.sleep(300);
        }
    }
}
