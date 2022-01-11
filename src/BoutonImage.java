
import java.awt.*;
import javax.swing.*;


public class BoutonImage extends JButton {
    
     private Image image;
    
    public BoutonImage()
    {
        super();
        this.image=null;
    }
    
    public BoutonImage(Image img)
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
         Image imgB = image.getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_DEFAULT);
         this.setIcon(new ImageIcon(imgB));
        }
        
      
    }
    
    
}
