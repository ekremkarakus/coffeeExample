import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * @author Ekrem Karakus
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz");

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            System.out.println("Teşekkürler kahveniz hazırlanıyor.");
            TimeUnit.SECONDS.sleep(2);
            String detail;
            Coffee coffee = new Coffee() {
                @Override
                public String getOrderDetails() {
                    return null;
                }
            };
            switch(s) {
                case "1":
                    coffee = new Espresso();
                    break;
                case "2":
                    coffee = new DoubleEspresso();
                    break;
                case "3":
                    coffee = new Cappuccino();
                    break;
                case "4":
                    coffee = new CaffeLatte();
                    break;
                case "5":
                    coffee = new Mocha();
                    break;
                case "6":
                    coffee = new Americano();
                    break;
                case "7":
                    coffee = new HotWater();
                    break;
                default:
                    break;
            }
            detail = coffee.getOrderDetails();
            System.out.println(detail);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}