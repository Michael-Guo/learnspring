package beanannotation.javabased;

public class StringStore implements Store {
    public void init() {
        System.out.println("This is init");
    }

    public void destroy() {
        System.out.println("This is destory");
    }
}
