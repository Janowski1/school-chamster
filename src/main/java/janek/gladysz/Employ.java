package janek.gladysz;

public class Employ {
    int liczbawłosów;
    String firstname;

    String lastname;

    String position;

    public Employ(String firstname) {
        this.firstname = firstname;

        lastname = "Purbać";
        position = "kitchen";
    }

    public String fullInfo(){
        return firstname +" " + lastname + " " + position;
    }

}