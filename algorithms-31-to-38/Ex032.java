public class Ex032 {
    public static void main(String[] args) throws InterruptedException {
        int counter = 100;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("           COUNTING FROM 100 TO 200           ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Thread.sleep(1000);

        while (counter <= 200) {
            System.out.println("--> " + counter);
            Thread.sleep(200);
            counter ++;
        }
    }
}
