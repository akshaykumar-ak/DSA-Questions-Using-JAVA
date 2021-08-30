import java.util.Scanner;

public class javaStringIntroduction {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            System.out.println(A.length()+B.length());
            int len;
            int asciidiff;
            if(A.length()<B.length()||A.length()==B.length()){
                len = A.length();
            }
            else
            {
                len = B.length();
            }
            for (int i = 0; i < len; i++) {
                asciidiff=A.toLowerCase().charAt(i)-B.toLowerCase().charAt(i);
                if(asciidiff>0){
                    System.out.println("Yes");
                    break;
                }
                else if(asciidiff<0||asciidiff==0){
                    System.out.println("No");
                    break;
                }
            }
            String firstLetter = A.substring(0,1);
            String remainingLetter = A.substring(1);
            firstLetter=firstLetter.toUpperCase();
            A = firstLetter+remainingLetter;
            String BfirstLetter = B.substring(0,1);
            String BremainingLetter = B.substring(1);
            BfirstLetter=BfirstLetter.toUpperCase();
            B = BfirstLetter+BremainingLetter;
            System.out.println(A+" "+B);
            
    }
}
