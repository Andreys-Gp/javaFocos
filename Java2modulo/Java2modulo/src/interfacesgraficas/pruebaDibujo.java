package interfacesgraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class pruebaDibujo {
    public static void main(String[] args) {
        marcoConDibujo mimarco=new marcoConDibujo();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class marcoConDibujo extends JFrame{
    public marcoConDibujo(){
        setTitle("dibujo de prueba");
        setSize(400,400);
        laminaConFiguras milamina = new laminaConFiguras();
        add(milamina);
        milamina.setBackground(Color.magenta);

    }
}
 class laminaConFiguras extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      //  g.drawRect(50,50,200,200);
       // g.drawLine(100, 100,300,200);
       // g.drawArc(50,100,100,200,120,150);
        Graphics2D g2= (Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.BLUE);
          g2.fill(rectangulo);
          //dibujo 2d
        Ellipse2D elipse=new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //instanciar clase color
       // Color micolor2=new Color(200,300,400);
        //g2.setPaint(Color.CYAN);
        g2.setPaint(Color.green);
        g2.fill(elipse);
        //g2.draw(new Line2D.Double(100,100,300,250));


    }

 }
