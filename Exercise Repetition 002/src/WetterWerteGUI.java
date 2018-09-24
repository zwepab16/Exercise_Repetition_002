
import java.util.Date;


public class WetterWerteGUI extends javax.swing.JFrame {
WetterModell model =new WetterModell();

    public WetterWerteGUI() {
        initComponents();
        setSlider();
        list.setModel(model);
    }
    public void setSlider(){
      tempSlider.setMinimum(-20);
      tempSlider.setMaximum(40);
      tempSlider.setMajorTickSpacing(10);
      tempSlider.setMinorTickSpacing(5);
      tempSlider.createStandardLabels(5);
      tempSlider.setPaintTicks(true);
      tempSlider.setPaintLabels(true);

      LuftSlider.setMinimum(0);
      LuftSlider.setMaximum(100);
      LuftSlider.setValue(100);
      LuftSlider.setMajorTickSpacing(20);
      LuftSlider.setMinorTickSpacing(10);
      LuftSlider.createStandardLabels(10);
      LuftSlider.setPaintTicks(true);
      LuftSlider.setPaintLabels(true);

    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tempSlider = new javax.swing.JSlider();
        lbTemp = new javax.swing.JLabel();
        lbLuft = new javax.swing.JLabel();
        LuftSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        btEinfügen = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSpeichern = new javax.swing.JMenuItem();
        miLaden = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Eingabe");

        jLabel2.setText("Anzeige");

        tempSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tempSliderStateChanged(evt);
            }
        });

        lbTemp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTemp.setText("Temperatur");

        lbLuft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLuft.setText("Luftfeuchtigkeit");

        LuftSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LuftSliderStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(list);

        btEinfügen.setText("Einfügen");
        btEinfügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEinfügenActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        miSpeichern.setText("Datei-speichern");
        miSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSpeichernActionPerformed(evt);
            }
        });
        jMenu1.add(miSpeichern);

        miLaden.setText("Datei-laden");
        miLaden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLadenActionPerformed(evt);
            }
        });
        jMenu1.add(miLaden);

        jMenuItem1.setText("Datei-beenden");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tempSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(lbLuft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LuftSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEinfügen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tempSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lbLuft, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuftSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEinfügen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tempSliderStateChanged
    lbTemp.setText("Temperatur: "+tempSlider.getValue()+"°");
    }//GEN-LAST:event_tempSliderStateChanged

    private void LuftSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LuftSliderStateChanged
        lbLuft.setText("Luftfeuchtigkeit: "+LuftSlider.getValue()+"%");
    }//GEN-LAST:event_LuftSliderStateChanged

    private void miLadenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLadenActionPerformed
     
    }//GEN-LAST:event_miLadenActionPerformed

    private void miSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSpeichernActionPerformed
    
    }//GEN-LAST:event_miSpeichernActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btEinfügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEinfügenActionPerformed
   Date d=new Date();
        model.add(new WetterWert(tempSlider.getValue(),LuftSlider.getValue(), d));
    }//GEN-LAST:event_btEinfügenActionPerformed

   
    public static void main(String args[]) {
 
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new WetterWerteGUI().setVisible(true);
           }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider LuftSlider;
    private javax.swing.JButton btEinfügen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLuft;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuItem miLaden;
    private javax.swing.JMenuItem miSpeichern;
    private javax.swing.JSlider tempSlider;
    // End of variables declaration//GEN-END:variables
}
