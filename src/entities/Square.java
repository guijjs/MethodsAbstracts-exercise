package entities;
import entities.enums.Color;
public class Square extends Shape{
  private Double sideLength;
  public Square(){
    super();
  };
  public Square(Color color, Double sideLength){
    super(color);
    this.sideLength = sideLength;
  };

  @Override
  public Double area(){
    return Math.pow(this.sideLength, 2);
  }
}
