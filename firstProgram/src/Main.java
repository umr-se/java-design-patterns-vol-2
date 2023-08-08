public class Main {
    record Rectangle(float length,float width){
        public float length() {
            System.out.println("Length is " + length);
            return length;
        }
        public float width() {
            System.out.println("width is " + width);

            return width;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.length();
        r.width();
    }
}