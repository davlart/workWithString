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

    }
}
