import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author Ekrem Karakus
 */
public class Americano extends  Coffee{

    public Americano(){
        HashMap<String,Integer> value = new HashMap<>();
        value.put("Espresso",1);
        content.add(value);

        value.put("Hot Water",4);
        content.add(value);

        this.type = 6;
        this.price = "25 ₺";
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
        String detail= "Americano seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
