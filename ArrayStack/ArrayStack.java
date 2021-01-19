public class ArrayStack implements Stack {
    private final int CAPACITY = 10;
    private int[] stack = new int[CAPACITY];
    
    
    // PUSH, POP, PEEK are basically setters/getters
    
    @Override
    public void push(int item) {
        // from StackTester.java
        // if the first thing that happens
        // is push(0)
        
        // when 0 is pushed into my stack
        // I need to put that information
        // into my stack array
        
        // would make sense to put it into
        // the 0th spot... 0 index in stack array
        
        // second time, push(1)
        // that probably should go into index 1

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }
}
