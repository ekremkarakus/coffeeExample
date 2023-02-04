import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author Ekrem Karakus
 */
public class CaffeLatte extends  Coffee{
    public CaffeLatte(){
        HashMap<String,Integer> value = new HashMap<>();
        value.put("Espresso",1);
        content.add(value);

        value.put("Milk Foam",1);
        content.add(value);

        value.put("Steamed Milk",3);
        content.add(value);
        this.type = 4;
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
        String detail= "Caffe Latte seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
