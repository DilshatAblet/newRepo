package day04_Variable;

public class OCA_Oracle {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}
