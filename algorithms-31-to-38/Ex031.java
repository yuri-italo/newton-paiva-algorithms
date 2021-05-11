public class Ex031 {
    public static void main(String[] args) throws InterruptedException {
        int counter = 1;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("            COUNTING FROM 1 TO 10             ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Thread.sleep(1000);

        while (counter <= 100){
            System.out.println("--> " + counter);
            Thread.sleep(200);
            counter ++;
        }
    }
}
