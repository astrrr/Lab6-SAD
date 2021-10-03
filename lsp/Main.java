/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.lsp;

/**
 *
 * @author Astr
 */
public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Shapes reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Shapes reg2 = new Square(5);
        reg2.setWidth(width);
        reg2.setHeight(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg2.getArea());
        
        Shapes reg3 = new Square(5);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + reg3.getWidth());
        System.out.println("Height = " + reg3.getHeight());
        System.out.println("Area = " + reg3.getArea());
        
    }
}
