/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java.GUIComponents;

/**
 *
 * @author sukhadapradhan
 */
import java.awt.*;  
import javax.swing.JFrame;  
  
public class ImageCanvas extends Canvas{
    
    public String image;
    public int width;
    public int height;

    public ImageCanvas()
    {}
    public ImageCanvas(String image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage(image);  
        g.drawImage(i, width,height,this);  
          
    }  
    public void setImage(String image) {
        this.image = image;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
  
}  
