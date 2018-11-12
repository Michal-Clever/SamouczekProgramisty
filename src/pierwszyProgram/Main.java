package pierwszyProgram;

public class Main {
    public static void main(String[] args) {
        String message = "To jest mój pierwszy łańcuch znaków! Potocznie \"string\".";
        System.out.println(message);
        String productName = "Coca" + "Cola";

        System.out.println(productName.indexOf('o'));


       // String str = "abc";



        char data[] = {'a', 'b', 'c'};
        String str = new String(data);


        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);



        String name = "Jan Kowalski";
        String[]parts = name.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        for (String part : parts) {
            System.out.print(part.charAt(0));
        }
    }
}
//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html