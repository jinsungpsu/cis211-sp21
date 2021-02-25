public class DLLTester {
    public static void main(String[] args) {
        DLL<String> list = new DLL<>();

        list.addFront("Hello");
        System.out.println(list); // Hello

        list.addBack("World");
        System.out.println(list); // Hello World

        list.addFront("Hey,");
        System.out.println(list); // Hey, Hello World

        list.addBack("Bye!");
        System.out.println(list); // Hey, Hello World Bye!

        if (list.contains("Bye!")) {
            // true!
        }

        if (list.contains("Whatsup?")) {
            // false
        }

        DLL<Cat> catList = new DLL<>();

        Cat cat1 = new Cat("Fluffy", 1);

        catList.addFront(new Cat("Fido", 5));
        catList.addFront(new Cat("Garfield", 15));
        catList.addFront(new Cat("Fluffy", 1));

        if (catList.contains(cat1)) {
            // true
        }
    }

}
