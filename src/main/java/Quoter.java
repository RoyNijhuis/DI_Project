/**
 * Created by Roy on 20-4-2015.
 */
public class Quoter {
    public int getBookPrice(String s) {
        switch(s) {
            case "1":
                return 10;
            case "2":
                return 25;
            case "3":
                return 20;
            case "4":
                return 35;
            case "5":
                return 50;
            default:
                return 0;
        }
    }
}
