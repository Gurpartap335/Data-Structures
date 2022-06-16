package lecture.OPP.Practise;

public class HeadPhone {
    private String charge;
    private String[] controls = {"power","volume","skip","play,pause"};
    private String color;

    static boolean power = false;
    static int volume = 0;

    public static void powerOn(){
        power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp(){
        volume++;
    }

    public static void volumeDown(){
        volume--;
    }
}
