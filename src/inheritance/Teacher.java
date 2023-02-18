package inheritance;

public class Teacher extends Gender {
    public Teacher(String name) {
        super(name);
    }

    public void teachAlesson(){
        System.out.println(this.getName() + "Education is the backbon of a nation");
    }

}
