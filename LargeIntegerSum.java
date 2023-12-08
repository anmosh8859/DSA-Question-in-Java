import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeIntegerSum {
    String lis(String a, String b){
        int alen = a.length();
        int blen = b.length();
        int max = alen>blen?alen:blen;

        int [] inta = new int[max];
        for (int i = max - alen; i < max; i++) {
            inta[i] = Integer.parseInt(String.valueOf(a.charAt(i + alen - max)));
        }
        int [] intb = new int[max];
        for (int i = max - blen; i < max; i++) {
            intb[i] = Integer.parseInt(String.valueOf(b.charAt(i + blen - max)));
        }

        int carry = 0;
        for (int i = max - 1; i >= 0; i--) {
            int temp = (inta[i] + intb[i] + carry);
            intb[i] = temp%10;
            carry = temp/10;
        }

        if(carry!=0) a = String.valueOf(carry);
        else a = "";

        for (int i = 0; i < max; i++) {
            a += String.valueOf(intb[i]);
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        String b = bf.readLine();
        LargeIntegerSum lis = new LargeIntegerSum();
        System.out.println(" = " + lis.lis(a,b));
    }
}
