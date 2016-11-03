package dog.cyotee;

/**
 * A simple example proving how Java handles assigning values.
 * Just run to see the proofs.
 */
public class App
{
    public static void main( String[] args )
    {
        int int1 = 1;
        int int2 = 2;

        System.out.println("int1 is : " + int1);
        System.out.println("int2 is : " + int2);
        System.out.println("Setting int1 to int2.");

        int1 = int2;

        System.out.println("int1 is : " + int1);
        System.out.println("int2 is : " + int2);
        System.out.println("Setting int2 to 3.");

        int2 = 3;

        System.out.println("Now, if int1 returns 3, then we know Java passes primitives by reference.");
        System.out.println("If int1 still equals 2, then we know Java passes primitives by value.");
        System.out.println("int1 is : " + int1);

        if (int1 == int2){

            System.out.println("Java passes primitives like int by reference");
        }

        if (int1 == 2){
            System.out.println("Java passes primitives like int by value");
        }

        Test test1 = new Test("Test 1");
        Test test2 = new Test("Test 2");

        System.out.println("test1 is the same as test2: " + test1.getInstanceName());
        System.out.println("test2 is the same as test1: " + test2.getInstanceName());
        System.out.println("Setting test1 to test2.");

        test1 = test2;

        System.out.println("test1 is : " + test1.getInstanceName());
        System.out.println("test2 is : " + test2.getInstanceName());
        System.out.println("Now changing the name of test2 to Test 3");

        test2.setInstanceName("Test 3");

        System.out.println("Now, if test1 returns a different instance from test2, then we know Java passes objects by value.");
        System.out.println("If test1 is the same instance as test2, then we know Java passes objects by reference.");

        System.out.println("test1 is : " + test1.getInstanceName());

        if (test1.equals(test2)){

            System.out.println("Java passes objects by reference");
        }

        if (!test1.equals(test2)){
            System.out.println("Java passes objects by value");
        }

        System.out.println("But what about Strings?");

        String string1 = "String 1";
        String string2 = "String 2";

        System.out.println("string1 : " + string1);
        System.out.println("string2 : " + string2);
        System.out.println("Setting string1 to string2.");

        string1 = string2;

        System.out.println("string1 is : " + string1);
        System.out.println("string2 is : " + string2);
        System.out.println("Now changing the name of string2 to String 3");

        string2 = "String 3";

        System.out.println("Now, if test1 returns a different instance from test2, then we know Java passes objects by value.");
        System.out.println("If test1 is the same instance as test2, then we know Java passes objects by reference.");

        System.out.println("string1 is : " + string1);

        if (string1.equals(string2)){

            System.out.println("Java passes Strings by reference");
        }

        if (!string1.equals(string2)){
            System.out.println("Java passes Strings by value");
        }
    }
}
