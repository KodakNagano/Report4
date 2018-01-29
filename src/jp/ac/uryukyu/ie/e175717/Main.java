package jp.ac.uryukyu.ie.e175717;

public class Main {
    public static void main (String args[]){
        String  a;
        a = "3．14";
        try{
            System.out.println(a.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        }

        double value;
        value = Double.parseDouble(a);
    }
}
