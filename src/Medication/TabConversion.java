package Medication;

import java.util.Arrays;

public class TabConversion {

    // sans args
    public String toString(){
        return "Ceci est un temple de la Class TabConversion";
    }

    // tab de int; return un tableau
    public String toString(int[] ele){
        return Arrays.toString(ele);
    }

    // tab de double
    public String toString(double[] ele){
        return Arrays.toString(ele);
    }

    // tab de String; return une string
    public String toString(String[] ele){
        return String.join(" ",ele);
    }


    // String[] split(String regex, int limit)
    // idee: limite c split le nombre de fois le txt a partir de regex
    // return une list
    public String stringRemove(String txt,String regex,int limit){

        if (limit == 1){ return "il faut un limite + grand que 1, principe base sur le regex pour spliter";}
        String[] msg = txt.split(regex, limit);
        return toString(msg);
    }

    public String[] stringTab(String txt,String regex,int limit){

        String[] msg = txt.split(regex, limit);
        return msg;
    }






}
