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
        System.out.println(name+address+phonenumber + married + age);

        String nameAge= name+age;
        System.out.println(nameAge); // string and int add korle string hobe

        // string and number can not be added. it will show as string so the answer should be 300300
        String num1 = "300";
        int num2 = 300;

        System.out.println(num1+num2);

/*
        more data type
*/
        char digit = 8;
        float f = (float) 1.325; // float should be casted like this
        double d = 1.23;

        System.out.println(digit + f + d);



    }

    public static void PrintHello(String name){
        System.out.println("My Name is "+name);
    }
}


