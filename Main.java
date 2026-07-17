
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.insert(5, "java");
        System.out.println(sb);
        sb.delete(5 ,9);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.toString());

    }
}