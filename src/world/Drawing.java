package world;
import world.Shape;

public class Drawing {
    private Shape shape;
    public int drawingAmount;

   public Drawing(int drawingAmount, Shape shape){
       this.drawingAmount=drawingAmount;
       this.shape=shape;

   }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setDrawingAmount(int drawingAmount) {
        this.drawingAmount = drawingAmount;
    }

}