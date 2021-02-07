/*
Override syntax helps us in making sure that if 2 methods are present in parent as well
as child class, we are implementing the child's class methods
*/

/* Method overloading works when even one of below condition is satisfied
- number of arguments
type of arguments
 */

package OOPs;

public class Client {
    public static void main(String[] args) {
        System.out.println(" -- Case 1 --"); // P reference P instance
        P obj1 = new P();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();

        System.out.println(" \n-- Case 2 --"); // P reference P instance
        P obj2 = new C();
        System.out.println(obj2.d);
        System.out.println(((C)obj2).d);
        System.out.println(obj2.d1);
        System.out.println(((C)obj2).d2);
        obj2.fun(); // C's
        obj2.fun1(); // P's
        ((C)obj2).fun2();

        System.out.println(" \n-- Case 3 --"); // C reference P instance
//        C obj3 = new P();  Not allowed - Child class reference with parents class instance

        // child reference and child's instance
        System.out.println(" \n -- Case 4 --");
        C obj4 = new C();
        System.out.println(obj4.d); // collision arise hence value will print of reference
        System.out.println(((P)obj4).d);
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        obj4.fun();
        ((P)obj4).fun(); // wont work
        obj4.fun1();
        obj4.fun2();
    }
}
