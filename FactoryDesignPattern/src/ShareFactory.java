public class ShareFactory{

    //use getShape method to get object of type shape
    public Main.Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Main.Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Main.Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Main.Square();
        }

        return null;
    }
}
