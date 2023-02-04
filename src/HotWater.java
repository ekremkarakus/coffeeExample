import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author Ekrem Karakus
 */
public class HotWater extends  Coffee{

    public HotWater(){
        HashMap<String,Integer> value = new HashMap<>();

        value.put("Hot Water",5);
        content.add(value);

        this.type = 7;
        this.price = "5 ₺";
        this.setContent(content);
    }
    @Override
    public String getOrderDetails(){

        ListIterator<HashMap<String,Integer>> iterator
                = this.content.listIterator();
        String contentDetail="";
        HashMap<String,Integer> hashMap = iterator.next();
        Set<String> keyStrings = hashMap.keySet();
        String keyValue;
        Integer doze;
        for(String keys : keyStrings){
            doze = hashMap.get(keys);
            contentDetail+= doze.toString() + " doz " + keys +",";
        }
        contentDetail = contentDetail.substring(0,contentDetail.length()-1);
        String detail= "Hot Water seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
