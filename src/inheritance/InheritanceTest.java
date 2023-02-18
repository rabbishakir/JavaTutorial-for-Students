package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("This is the Inheritance Test Main class");

        //lets make objects of those classes

        Doctor dr = new Doctor("Mithila");
        Singer sr = new Singer("james");
        Teacher tr = new Teacher("Ata sir ");

        // lets call those methods in those classes

        dr.howToLooseFat();

        // these are inhetated from the Human class
        dr.sleep();
        dr.eat();
        dr.whatsYourGender();


        sr.singAsong();

        // these are inhetated from the Human class
        sr.sleep();
        sr.eat();


        tr.teachAlesson();

        // these are inhetated from the Human class
        tr.sleep();
        tr.eat();
        tr.whatsYourGender();




    }

}
