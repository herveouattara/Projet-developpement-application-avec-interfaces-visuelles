
import java.awt.*;
import javax.swing.*;

public class PanneauImage extends JPanel {
    
    private Image image;
    
    public PanneauImage()
    {
        super();
        this.image=null;
    }
    
    public PanneauImage(Image img)
    {   super();
        this.image=img;
    }
    
    public Image getImage () { return image;}
    public void setImage (Image img) { this.image=img;this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if (image != null)
        {
         g.drawImage(image,0,0, this.getWidth(), this.getHeight(),this);
         System.out.println("drawImage dans Paint dans le panneau "+this.getWidth()+" "+this.getHeight());
        }
        
      
    }



}
