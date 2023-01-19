public class PremetiveDataAndEqual {
    public static void main(String[] args){

        // reference type and primitive data type

//        primitive data type is like a box and contains simple value
//        and it is stored in the memory dirrectly

            int a = 100;
            int b = a;
            char c = 'C';
            System.out.println(c+a);

//          reference dara type are comples data example "String" cause it holds the reference of the data which is stored in a different memory location

            String s = "hello"; // here "s" will be stored in a memory address and that address will link to the actual data "hello". they will have the same reference

            String k = s; // so the k and s will have the same value as they reference the same address


            // == and .equal() method

        int x =10;
        int z = 10;
        System.out.println(x==z);

        String s1 = "Rabbi Shakir";
        String s2 = "Rabbi Shakir";

        System.out.println(s1 == s2);  // though it is giving the right answer, it is not the right way

        System.out.println(s1.equals(s2));  // this is the right way to do it





    }

}
