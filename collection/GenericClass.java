package collection;

import java.util.Arrays;

public class GenericClass/*<T>*/<T extends Object>{
    Object[] t = new Object[4];
    public void add(T t){
        int location = -1;
        for(int i = 0 ; i < 4 ; i++){
            if(this.t[i]==null){
                location = i;
                break;
            }
        }
        if(location==-1) System.out.println("Overflow");
        else this.t[location] = t;

    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + Arrays.toString(t) +
                '}';
    }
}
