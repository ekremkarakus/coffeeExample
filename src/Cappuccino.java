import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author Ekrem Karakus
 */
public class Cappuccino  extends  Coffee{

    public Cappuccino(){
        HashMap<String,Integer> value = new HashMap<>();
        value.put("Espresso",1);
        content.add(value);

        value.put("Milk Foam",2);
        content.add(value);

        value.put("Steamed Milk",2);
        content.add(value);
        this.type = 3;
        this.price = "27 ₺";
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
        String detail= "Cappuccino seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
