public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree<String, App> appList = new LinkedBST<>();
        App sudoku = new App("Sudoku", 4.0f);
        App candycrush = new App("Candy Crush", 4.2f);
        appList.insert(sudoku.getName(), sudoku);
        appList.insert(candycrush.getName(), candycrush);

        System.out.println(appList.search("Sudoku"));
    }
}
