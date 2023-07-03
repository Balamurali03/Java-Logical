package com.java.codetest1;


import java.awt.*;  
import java.awt.event.*;  
import java.awt.geom.*;  
  
public class Color extends Frame   
{  
   /* Driver Code */      
   public Color()  
   {  
      super("Color Code Example");  
      prepareGUI();  
   }  
  
   public static void main(String[] args)  
   {  
      Color obj = new Color();    
      obj.setVisible(true);  
   }  
  
   private void prepareGUI()  
   {  
      setSize(400,400);  
      setBackground(Color.black);  
      addWindowListener(new WindowAdapter()   
      {  
         public void windowClosing(WindowEvent windowEvent)  
         {  
            System.exit(0);  
         }          
      });   
   }      
  
   public void paint(Graphics g)   
   {  
      Graphics2D g2 = (Graphics2D)g;          
      Font plainFont = new Font("Serif", Font.PLAIN, 24);          
      g2.setFont(plainFont);  
      /* Color Constant */  
      g2.setColor(Color.cyan);  
      g2.drawString("Color Code Example", 50, 70);   
      g2.setColor(Color.BLUE);  
      g2.drawString("This is written in Blue color", 50, 120);    
   }  
}  
