
import java.text.SimpleDateFormat;
import java.util.Date;



public class WetterWert {
protected int temperatur,luftfeuchtigkeit;
protected Date zeitpunkt;

    public WetterWert(int temperatur, int luftfeuchtigkeit, Date zeitpunkt) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
    }
    public String toString(){
        SimpleDateFormat f=new SimpleDateFormat("dd.mm - hh:mm:ss");
        String s= String.format("%s - %d° - %d",f.format(zeitpunkt),temperatur,luftfeuchtigkeit);
        return s+"%";
    }

}
