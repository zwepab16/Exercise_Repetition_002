
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class WetterModell extends AbstractListModel {
private ArrayList<WetterWert> list=new ArrayList();

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
   
 public void save() {
     System.out.println("sas");
        JFileChooser chooser = new JFileChooser("C:\\Users\\Zwetti Patrick\\Documents\\3.Jahrgang\\POS\\Neuer Ordner\\Exercise_Repetition_002");
        chooser.showSaveDialog(chooser);
    
       
         File f =   chooser.getSelectedFile();
          try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(f))) {  
            for (WetterWert wert : list) {
                bw.write(wert.zeitpunkt.getTime() + ",");
                bw.write(wert.temperatur + ",");
                bw.write(wert.luftfeuchtigkeit);
                bw.newLine();
            
            }
        } catch (Exception ex) {
        }
    }

}
