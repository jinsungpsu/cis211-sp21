public class DictionaryTester {
    public static void main(String[] args) {




        Dictionary<String, String> test = new HashDictionary<>();
        test.insert("a", "aa"); // this is going to be inserted into index 1, b/c hash func returned 1
        test.insert("b", "bb"); // this is going to be inserted into index 2, b/c hash func returned 2
        test.insert("c", "cc"); // this is going to be inserted into index 3, even though hash func returned 1

        System.out.println(test.search("c"));



















        Dictionary<String, String> dictionary = new ArrayDictionary<>();

        dictionary.insert("Book", "A fiction/nonfiction story usually on paper.");
        // dictArray["Book"] = "A fiction/nonfiction... "

        String key = "Book";
        String value = "A fiction/nonfiction story usually on paper.";

        final int ARR_SIZE = 10000;
        String[] arrDictionary = new String[ARR_SIZE];

        int indexSpot = key.hashCode();

        arrDictionary[indexSpot%ARR_SIZE] = value;

        int searchSpot = key.hashCode();

        System.out.println("Hash value is: " + searchSpot);
        System.out.println("Has value of " + ("hello").hashCode());

        System.out.println(key + " value is: " + arrDictionary[searchSpot%ARR_SIZE]);

        dictionary.insert("Cup", "a container");
        dictionary.insert("song", "musical notes something something");
        dictionary.insert("plate", "holds food");

        System.out.println(dictionary.search("Book"));

        dictionary.remove("Book");

        System.out.println(dictionary.search("Book"));

        Object object = new Object();

    }
}
