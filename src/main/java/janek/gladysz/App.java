package janek.gladysz;

import javax.xml.namespace.QName;

public class App {


    public static void main(String[] args) {

        Employ chef = new Employ ("Zdzichu");
        System.out.println(chef.fullInfo());


        ChamsterSchool school = new ChamsterSchool();
        System.out.println(school.name);
        school.name = "Wpuściliśmy wirusy do waszych laptopów Ha HA Ha";
        if (school.cantine){
            System.out.println("Szkoła ma Stołówkę");
        }
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
            System.out.println("w nowej szkole " + newschool);
            System.out.println("witajcie.chomikowie");
            System.out.println("wszystko jest tu w rozmiarze pani " + newschool);
            System.out.println("w nowej szkole " + newschool);

        }

    }
}








