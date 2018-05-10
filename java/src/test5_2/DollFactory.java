package test5_2;

public class DollFactory {
    public static Doll newDoll(String name) {
        if (name == "cloth") {
            return new ClothDoll();
        }
        if (name == "babi") {
            return new BabiDoll();
        }
        return null;
    }
}
