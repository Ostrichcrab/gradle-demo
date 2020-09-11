import java.util.*;
public class DarkDemo{
    public static void main(String[] args){
        System.out.println("Hi");
        DarkLaunch darkLaunch = new DarkLaunch();
         IDarkFeature darkFeature = darkLaunch.getDarkFeature("call_newapi_getUserById");
          System.out.println(darkFeature.enabled());
         System.out.println(darkFeature.dark(1100));
    }
}