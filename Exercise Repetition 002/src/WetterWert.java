
import java.text.SimpleDateFormat;
import java.util.Date;



public class WetterWert {
protected int temperatur,luftfeuchtigkeit;
protected Date zeitpunkt;
protected String line;

    public WetterWert(String line) {
        this.line = line;
        String p[] =line.split(",");
        this.zeitpunkt=new Date(Long.parseLong(p[0]));
        this.temperatur = Integer.parseInt(p[1]);
        this.luftfeuchtigkeit = Integer.parseInt(p[2]);
     
    }

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

    public int getTemperatur() {
        return temperatur;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public Date getZeitpunkt() {
        return zeitpunkt;
    }

}
