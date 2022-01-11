/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadine
 */
import java.awt.*;
import java.io.File;
import javax.swing.*;

public class LesImages extends javax.swing.JFrame {



    private Image imgPanneau; 
    private Image imgBouton;
    private PanneauImage PanImage;
    private BoutonImage BtImage;
    
    public LesImages() {
        initComponents();
        PanImage= new PanneauImage();
        Panneau.add(PanImage);
        BtImage = new BoutonImage();
        jPanel1.add(BtImage);
        
        initImages();
        remplirListeImagesRessources();
    }
    
    public void initImages()
    {
        imgPanneau = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MesImages/bouquet.png"));
        PanImage.setImage(imgPanneau);
        
        imgBouton = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MesImages/bouquet.png"));
        BtImage.setImage(imgBouton);
        
    }

     public void remplirListeImagesRessources()
     {
        String path=new File("").getAbsolutePath();
        String repImages = path+"\\src\\MesImages";
        System.out.println(repImages);
        
        File rep= new File (repImages);
        String[] fileList = rep.list();
       for (int i=0; i<fileList.length; i++)
          ListeImgRessources.addItem(fileList[i]);
      
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LBouton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LPanneau = new javax.swing.JLabel();
        Panneau = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ListeImgRessources = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Parcourir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        LBouton.setText("Image sur bouton dédié");
        jPanel1.add(LBouton);

        jPanel5.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        LPanneau.setText("Image dans un panneau dédié");
        jPanel3.add(LPanneau);

        Panneau.setLayout(new java.awt.GridLayout(1, 1));
        jPanel3.add(Panneau);

        jPanel5.add(jPanel3);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(1, 4));

        jLabel5.setText("Image en ressource");
        jPanel4.add(jLabel5);

        ListeImgRessources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeImgRessourcesActionPerformed(evt);
            }
        });
        jPanel4.add(ListeImgRessources);

        jLabel6.setText("Autre image");
        jPanel4.add(jLabel6);

        Parcourir.setText("Parcourir");
        Parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcourirActionPerformed(evt);
            }
        });
        jPanel4.add(Parcourir);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListeImgRessourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeImgRessourcesActionPerformed
       

        String fich = ListeImgRessources.getSelectedItem().toString();
        System.out.println(fich);
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MesImages/"+fich));
        BtImage.setImage(img);

       
    }//GEN-LAST:event_ListeImgRessourcesActionPerformed

    private void ParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcourirActionPerformed
    JFileChooser jf= new JFileChooser();
    if (jf.showOpenDialog(this)== JFileChooser.APPROVE_OPTION)
    { String path = jf.getSelectedFile().getPath(); // chemin complet;
      Image img4=Toolkit.getDefaultToolkit().getImage(path);
      PanImage.setImage(img4);
    }   
    }//GEN-LAST:event_ParcourirActionPerformed

    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LesImages lim= new LesImages();
                lim.setSize(800, 600);
                lim.setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBouton;
    private javax.swing.JLabel LPanneau;
    private javax.swing.JComboBox<String> ListeImgRessources;
    private javax.swing.JPanel Panneau;
    private javax.swing.JButton Parcourir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
