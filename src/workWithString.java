import java.util.Scanner;


/**
 * Created by ArthurArt on 08.01.2017.
 */
public class workWithString {
    public static void task1(Scanner sc)
    {

        for (int i = 32; i <256 ; i++)
        {
            System.out.println(i+" "+(char)i );

        }
    }

    public static boolean IsDigit(char c)
    {

        if(((int)c>47)&&((int)c<59))return  true ;
        return false;

    }


    public static void task2(Scanner sc)
    {
        if(IsDigit(sc.next().charAt(0))) System.out.print("Yes");
        else System.out.print("No");



    }

    public static char toUpper(char c)
    {
        int intC = (int) c;
        if((intC>96)&&(intC<123))return  (char)(intC-32) ;
        return  c;
    }

    public static void task3(Scanner sc)
    {
        System.out.print(toUpper(sc.next().charAt(0)));
    }


    public static char InvertationCharLatin(char c)
    {
        int intC =(int)c;
        if((intC>64)&&(intC<91)||(intC>96)&&(intC<123)) return (char)(intC^1<<5);
        return c;
    }
    public static void task4(Scanner sc)
    {
        System.out.print( InvertationCharLatin(sc.next().charAt(0)));
    }

    public static  boolean compare(String S1, String S2)
    {
        char[] charArrayS1 = S1.toCharArray();
        char[] charArrayS2 = S2.toCharArray();
        if(charArrayS1.length!=charArrayS2.length) return false;

        for (int i = 0; i < charArrayS1.length; i++)
            if(charArrayS1[i]!=charArrayS2[i]) return  false;


        return  true;
    }
    public static void task5(Scanner sc)
    {
        System.out.print(compare(sc.nextLine(),sc.nextLine()));
    }


    public static void task6(Scanner sc)
    {
        int sumWord=0;
        char[] charArrayStr =  sc.nextLine().toCharArray();
        for (int i = 0; i <charArrayStr.length ; i++)
            if(charArrayStr[i]==' ') sumWord++;

        sumWord++;
        System.out.print(sumWord);
    }
    public static void task7(Scanner sc)
    {


        int index=0,bufLongWord=0, longWord=0;
        char[] charArrayStr =  sc.nextLine().trim().toCharArray();

        for (int i = 0; i <charArrayStr.length ; i++) {
            bufLongWord++;
            if (    (i == charArrayStr.length - 1)||(charArrayStr[i + 1] == ' ')) {
                if (bufLongWord > longWord) {
                    longWord = bufLongWord;
                    index = i - bufLongWord + 1; i++;
                }
                bufLongWord = 0;
            }

        }
        for (int i = index; i <index+longWord ; i++)
            System.out.print(charArrayStr[i]);


        System.out.print(" "+longWord);
    }

    public static boolean serchPolindrom(String str)
    {
        char[] charArrayStr =  str.toCharArray();
        for (int  i = 0,j=charArrayStr.length-1;  i < charArrayStr.length/2; i++,j--) {
            if(charArrayStr[i]!=charArrayStr[j]) return  false;
        }
        return true;
    }

    public static void task9(Scanner sc)
    {if(serchPolindrom(sc.next())) System.out.print("Yes");
    else System.out.print("No");

    }
    public static void task10(Scanner sc)
    {
        int i=0,j;
        StringBuilder str = new StringBuilder();
        str.append(sc.nextLine());
        while(i!=-1)
        {
            j=0;
            while(j!=str.length()){
                if(i!=j && str.charAt(i)==str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    i=-2; break;
                }
                j++;
            }
            i++;
        }
    }

    public static void task11(Scanner sc){
        StringBuilder t = new StringBuilder(); StringBuilder s = new StringBuilder();
        t.append(sc.nextLine()); s.append(sc.nextLine());
        int tl=t.length(), sl=s.length(),j=0; boolean p=false;
        for (int i = 0; i < sl; i++) {
            for ( j = tl-1; j >= 0 ; j--) {
                if(s.charAt(i+j)!=t.charAt(j)){
                    for (int k = tl-1; k >= 0; k--) {
                        if(s.charAt(i+j)==t.charAt(k)) {i+=k==tl-1?tl:tl-k-2; j=-2; break;}
                    }
                    j=-2; break;
                }
            }
            if (j==-1) p=true;
            if (i+tl>=sl || p) break;
        }
        if(p) System.out.println("yes");
        else System.out.println("no");
    }

    public static void task12(Scanner sc){
        int x=0,y=0,n=0; String way="";
        StringBuilder str=new StringBuilder();
        while(true){
            str.append(sc.nextLine());
            for (int i = 0; i <str.length() ; i++)
                if(str.charAt(i)==' ') {
                    n=0;
                    for (int j = i+1; j < str.length(); j++) {
                        n+=Integer.valueOf(String.valueOf(str.charAt(j))); n*=10;
                    }
                    n/=10;
                    str.delete(i,str.length()); way=str.toString(); break;
                }
            switch(way){
                case "N" : y +=n; break;
                case "S" : y -=n; break;
                case "E" : x +=n; break;
                case "W" : x -=n; break;
            }
            System.out.println(x+" "+ y);
            str.delete(0,str.length());
        }
    }

    public static void task13(Scanner sc){
        StringBuilder str = new StringBuilder();
        str.append(sc.nextLine());
        for (int i = 0; i <str.length() ; i++)
            if(str.charAt(i)==' ') {str.deleteCharAt(i); i--;}
        if(serchPolindrom(str.toString())) System.out.print("yes");
        else System.out.print("no");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //task1(sc);
        //task2(sc);
        //task3(sc);
        // task4(sc);
        //task5(sc);
        // task6(sc);
        //task7(sc);
        // task9(sc);
        // task10(sc);
        // task11(sc);
        // task12(sc);
        // task13(sc);

    }
}
