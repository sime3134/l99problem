import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Integer p= new Scanner(System.in).nextInt(), m=p;
        while(!p.toString().substring(p.toString().length()>=2?p.toString().length()-2:p.toString().length()).contains("99") &&
                !m.toString().substring(m.toString().length()>=2?m.toString().length()-2: m.toString().length()).contains("99")) {
            p++;m--;
        }
        System.out.println(String.valueOf(p).contains("99") ? p : m);}
}