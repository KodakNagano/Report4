package jp.ac.uryukyu.ie.e175717;

public class Main {
    public static void main (String args[]){
        String  a;
        a = null;
        try{
            System.out.println(a.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        }
    }
}
