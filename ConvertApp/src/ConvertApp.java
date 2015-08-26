/**
 * Created by user on 8/24/15.
 */
public class ConvertApp {


    public static void main(String args[]) {

        ConvertString cs = new ConvertString();
        for (int i =0 ; i< 1000; i++) {
            System.out.println(cs.getHashCode("String"+i));
        }

        System.out.println(cs.getLongString("z"));


    }
}
