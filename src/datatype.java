public class datatype {
    public static void main(String[] args){
        PrintHello("Rabbi Shakir");
        String name, address, phonenumber;
        int age = 40;
        boolean married;
        name="Rabbi";
        address = "6176 Edsall road, Alexandria";
        phonenumber= "480 341 0432";
        married = true;
        System.out.println(name+address+phonenumber+married+age);

        String nameAge= name+age;
        System.out.println(nameAge); // string and int add korle string hobe

    }

    public static void PrintHello(String name){
        System.out.println("My Name is "+name);
    }
}


