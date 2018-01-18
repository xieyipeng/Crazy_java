package Unit6;

/**
 * ÄÚ²¿Àà
 */
public class c6_7_1_1 {
    private double weight;

    public c6_7_1_1() {
    }

    public c6_7_1_1(double weight) {
        this.weight = weight;
    }

    private class Cowleg{
        private double lengh;
        private String color;

        public Cowleg() {
        }

        public Cowleg(double lengh, String color) {
            this.lengh = lengh;
            this.color = color;
        }

        public double getLengh() {
            return lengh;
        }

        public void setLengh(double lengh) {
            this.lengh = lengh;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        private void info(){
            System.out.println(color+lengh);
            System.out.println(weight);
        }
    }
    public void test(){
        Cowleg cowleg=new Cowleg(1.2,"red");
        cowleg.info();
    }

    public static void main(String[] args) {
        c6_7_1_1 c=new c6_7_1_1(321);
        c.test();
    }
}
