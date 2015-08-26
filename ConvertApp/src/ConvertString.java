import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 8/26/15.
 */
public class ConvertString {
    private Map<String,String> hashArr;
    private long count = 0;
    private int sizeArr = 26;
    private char a='a';
    private char z='z';
    private int [] codeArr = new int [sizeArr];
    private int currentPos =0;

    public ConvertString() {
        hashArr = new HashMap<String, String>();

        for (int i=0; i < sizeArr; i++) {
            codeArr[i] = a+i;
        }

    }



    public String getHashCode(final String str) {

        int decimal = (int) (count/sizeArr);
        int mantisa = (int) (count%sizeArr);

        StringBuilder sb = new StringBuilder();
        if (decimal > 0) {
            while (decimal >= sizeArr) {
                sb.append(z);
                decimal = decimal -sizeArr;
            }
            sb.append((char) codeArr[decimal]);
        }
        sb.append((char)codeArr[mantisa]);

        hashArr.put(sb.toString(),str);
        count++;

        return sb.toString();
    }


    public String getLongString(final String code) {
        if (hashArr.containsKey(code)) {
            return hashArr.get(code);
        }
        return null;
    }
}
