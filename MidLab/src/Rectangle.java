public class Rectangle implements Shape {
    @Override
    public void display(int x1, int y1, int x2, int y2, int width, int height) {
        System.out.println("Parameters x , y , width and height");
    }

    public void display() {
        int x1=1;
        int y1=2;
        int x2=3;
        int y2=4;
    }
}
