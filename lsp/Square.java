/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.lsp;

/**
 *
 * @author Astr
 */
public class Square extends Shapes{

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public int getArea() {
        return super.getArea(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    
    public int getSide() {
      return super.getWidth();
    }
}
