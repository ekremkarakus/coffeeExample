import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Ekrem Karakus
 */
public  abstract class Coffee {

    String price = "";
    int type;

    List<HashMap<String,Integer>> content = new ArrayList<>();

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setContent(List content) {
        this.content = content;
    }

    public List getContent() {
        return  this.content;
    }

    public String getOrderDetails(){
        return null;
    }
}
