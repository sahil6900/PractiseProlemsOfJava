package org.example.design.patterns.factory;

public class OperatingSystemFactory {

    public static OperatingSystem getOS(String str){
        if(str.equalsIgnoreCase("blackberry")){
            return new BlackBerry();
        }else if(str.equalsIgnoreCase("apple")){
            return new Apple();
        }
            return new Android();
    }
}
