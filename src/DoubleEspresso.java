import java.util.*;

/**
 * @author Ekrem Karakus
 */
public class DoubleEspresso extends  Coffee{
    private List<HashMap<String,Integer>> content = new ArrayList<>();

    public DoubleEspresso(){
        HashMap<String,Integer> value = new HashMap<>();
        value.put("Espresso",2);
        content.add(value);

        this.type = 2;
        this.price = "29 ₺";
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
        String detail= "Double Espresso seçtiniz. Bu içeceğiniz " +
                contentDetail + " içermektedir. Afiyet Olsun." + "Ücret: " + this.getPrice();
        return detail;
    }
}
