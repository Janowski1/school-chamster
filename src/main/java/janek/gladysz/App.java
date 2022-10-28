package janek.gladysz;

import javax.xml.namespace.QName;

public class App {


    public static void main(String[] args) {

        String[] names = {"boft", "mikjh", "ghytr", "surykatka"};


        for (String each : names)
            printMessage(each);
    }


    static void printMessage(String newschool) {

        if ("surykatka".equals(newschool)) {
            System.out.println("to niestety ostatni rok");
        }else{
            System.out.println("witajcie.chomikowie");
            System.out.println("wszystko jest tu w rozmiarze pani " + newschool);
            System.out.println("w nowyej szkole " + newschool);
            System.out.println("witajcie.chomikowie");
            System.out.println("wszystko jest tu w rozmiarze pani " + newschool);
            System.out.println("w nowyej szkole " + newschool);

        }

    }
}








