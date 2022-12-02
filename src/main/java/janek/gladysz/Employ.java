package janek.gladysz;

public class Employ {
    int liczbawłosów;
    String firstname;

    String lastname;

    String position;

    public Employ(String firstname,String lastname,String position) {
        this.firstname = firstname;

        this.lastname = lastname;
        this.position = position;

    }

    public String fullInfo(){
        return firstname +" " + lastname + " " + position;
    }

    @Override
    public String toString() {
        return fullInfo();
    }
}