package Basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,8,9,10);
        multiple(2,3,"Kunal","Rahul");
    }

    static void multiple(int a, int b, String ...v){}
    //variable length argument always at the end

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
