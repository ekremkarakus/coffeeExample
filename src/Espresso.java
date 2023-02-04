import java.util.*;

/**
 * @author Ekrem Karakus
 */
public class Espresso extends  Coffee{

    private List<HashMap<String,Integer>> content = new ArrayList<>();

    public Espresso(){
        HashMap<String,Integer> value = new HashMap<>();
        value.put("Espresso",1);
        content.add(value);

        this.type = 1;
        this.price = "20 ₺";
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
        String detail= "Espresso seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
