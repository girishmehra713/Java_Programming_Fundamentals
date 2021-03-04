import java.util.*;
public class Main {
    public static void main(String args[]) {
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);

        

        // sb1 = sb1.append(" is a good person!!!!hanjii");
        // sb2 = sb2.append(" is not a good person!ahhdbjasdnsa");
        sb1.insert(12," Yes he is Great Na");
        sb2.insert(15," is Fuddu");

        // sb1.reverse();
        sb2.delete(19,23);
        sb2.deleteCharAt(19);

        s1 = sb1.toString();
        s2 = sb2.toString();
        int len1 = sb1.length();
        int len2 = sb2.length();
        int cap1 = sb1.capacity();
        int cap2 = sb2.capacity();
        
        System.out.println("Length of " + s1 + " = " + len1);
        System.out.println("Length of " + s2 + " = " + len2);

        System.out.println("Capacity of sb1 = "+cap1);
        System.out.println("Capacity of sb2 = "+cap2);


    }
}