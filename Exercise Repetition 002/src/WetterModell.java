
import java.util.ArrayList;
import javax.swing.AbstractListModel;



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

}
