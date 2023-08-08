public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter");
        Shape s = new Shape() {
            @Override
            public void display(int x1, int y1, int x2, int y2, int width, int height) {
            }
        };
        Rectangle r = new Rectangle();
        Legacy_Rectangle lr = new Legacy_Rectangle();
        r.display();
    }
}