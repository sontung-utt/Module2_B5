public class Cars {
    private String name;
    private String engine;
    public static int count;
    public Cars(String name, String engine) {
        this.name = name;
        this.engine = engine;
        count++;
    }
}
