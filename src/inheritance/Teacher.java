package inheritance;

public class Teacher extends Human {
    public Teacher(String name) {
        super(name);
    }

    public void teachAlesson(){
        System.out.println(this.getName() + "Education is the backbon of a nation");
    }

}
