public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        if ((this.name.equals(o.name))&&(this.age==o.age)) {
            return 0;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
