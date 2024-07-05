import Package_AccesModifier.*;

// Access modifiers - 
// public - if you want access anything from a package to the outside of package declare it as public
// private - private variables can be used only in its class

/*
 *                                   Public         Private     Protected    Default
 * same class                         Yes            Yes          Yes          Yes
 * same package subclass              Yes            No           Yes          Yes
 * same package non subclass          Yes            No           Yes          Yes
 * different package subclass         Yes            No           Yes          No
 * different package non-subclass     Yes            No           No           No
 * 
 */

/*
 *
 * Note : 
 * i. try to declare your class public
 * ii. try to keep instance variable as private
 * ii. try to use public or protected for methods
 * 
 */

public class Hello {

    public static void main(String args[]) throws ClassNotFoundException {
        A obj = new A();
        System.out.println(obj.marks);

        B obj1 = new B();
        System.out.println(obj1.marks);
    }
}

