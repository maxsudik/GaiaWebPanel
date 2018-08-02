package Helper;

public class GaiaHelper {

    public void Wait3() {
        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Wait5() {
        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

