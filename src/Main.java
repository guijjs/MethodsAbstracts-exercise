import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.enums.Color;
import entities.Square;
import entities.Circle;
import entities.Shape;
public class Main{
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
  
    List<Shape> shapeList = new ArrayList<>();
    System.out.print("Quantas formas irá querer adicionar: ");
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
      System.out.println("DADOS DA FORMA #" + i+1 +": ");
      System.out.print("CIRCULO OU QUADRADO(C/Q): ");
      char option = sc.next().toLowerCase().charAt(0);
      if(option == 'q'){
        System.out.print("INFORME A COR DO QUADRADO(BLACk/BLUE/RED): ");
        Color color = Color.valueOf(sc.next().toUpperCase());
        System.out.print("INFORME A MEDIDA DE UM DOS LADOS: ");
        double sideLength = sc.nextDouble();
        shapeList.add(new Square(color, sideLength));
      }else if(option == 'c'){
        System.out.print("INFORME A COR DO CIRCULO(BLACK/BLUE/RED): ");
        Color color = Color.valueOf(sc.next().toUpperCase());
        System.out.print("INFORME A MEDIDA DO RAIO: ");
        double radius = sc.nextDouble();
        shapeList.add(new Circle(color, radius));
      }else{
        while(option != 'c' || option != 'q'){
          System.out.print("FORMATO GEOMÉTRICO INVÁLIDO, INFORME UM VÁLIDO(c/q): ");
           option = sc.next().toLowerCase().charAt(0);
          if(option == 'q'){
            System.out.print("INFORME A COR DO QUADRADO(BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            System.out.print("INFORME A MEDIDA DE UM DOS LADOS: ");
            double sideLength = sc.nextDouble();
            shapeList.add(new Square(color, sideLength));
            break;
          }else if(option == 'c'){
            System.out.print("INFORME A COR DO CIRCULO(BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            System.out.print("INFORME A MEDIDA DO RAIO DO CIRCULO: ");
            Double radius = sc.nextDouble();
            shapeList.add(new Circle(color, radius));
            break;
          };
        }
      }
    };
    System.out.println("\nAREAS DOS FORMATOS GEOMÉTRICOS: ");
    for(Shape forma : shapeList){
      System.out.println(String.format("%.2f", forma.area()));
    }
    sc.close();
  }
}
