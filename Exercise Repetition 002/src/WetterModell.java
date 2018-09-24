
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class WetterModell extends AbstractListModel {
private ArrayList<WetterWert> list=new ArrayList();
private String spNa,laNa;

    @Override
    public int getSize() {
return list.size();
    }

    @Override
    public Object getElementAt(int i) {
   return list.get(i);
    }
    public void add(WetterWert e){
        list.add(e);
        fireIntervalAdded(this, list.size()-1, list.size()-1);
    }
   
 public int save() {
     int anz =0;
   
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        chooser.showSaveDialog(chooser);
    
       
         File f =   chooser.getSelectedFile();
         spNa=f.getName();
          try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(f))) {  
            for (WetterWert wert : list) {
                anz++;
                bw.write(wert.zeitpunkt.getTime() + ",");
                bw.write(wert.temperatur + ",");
                bw.write(wert.luftfeuchtigkeit+"");
                bw.newLine();
            
            }
        } catch (Exception ex) {
        }
          return anz;
    }
 public int laden(){
     list.clear();
     int anz=0;
      JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        chooser.showSaveDialog(chooser);
        File f =   chooser.getSelectedFile();
        laNa=f.getName();
                try (BufferedReader br = new BufferedReader(
                new FileReader(f))) {

            String line;
            while ((line = br.readLine()) != null) {
              anz++;
                try {

                    WetterWert w = new WetterWert(line);
                 list.add(w);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
              fireIntervalAdded(this, list.size()-1, list.size()-1);
             System.out.println(list.size());
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }

     return anz;
 }
 public String getSpeichernName(){
    return spNa;
 }
 public String getLadenName(){
    return laNa;
 }

}
