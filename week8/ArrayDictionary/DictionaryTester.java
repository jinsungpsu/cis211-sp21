public class DictionaryTester {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new ArrayDictionary<>();
        dictionary.insert("Book", "A fiction/nonfiction story usually on paper.");
        dictionary.insert("Cup", "a container");
        dictionary.insert("song", "musical notes something something");
        dictionary.insert("plate", "holds food");

        System.out.println(dictionary.search("Book"));

        dictionary.remove("Book");

        System.out.println(dictionary.search("Book"));
    }
}
