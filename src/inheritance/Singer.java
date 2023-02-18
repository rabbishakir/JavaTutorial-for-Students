package inheritance;

public class Singer extends Gender{
    public Singer(String name) {
        super(name);
    }

    public void singAsong(){
        System.out.println(this.getName() + " O bijli chole jeo naah");
    }

}
