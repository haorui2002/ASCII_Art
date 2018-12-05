/**
 * ============================================================================
 *
 * Class FlashCards
 *
 * File: FlashCards.java
 *
 * ============================================================================
 *
 * @author: Hally Zhou
 * Course: AP Computer Science - Blue 1
 * Date: December 3, 2018
 * Version: https://github.com/haorui22002/ASCII_Art/commit/master
 * GO CUBS GO
 * Why passing variables? Global Var the best
 */

/**
 * -------------------------------
 * Declare Constants
 * And Global Variables
 * -------------------------------
 */
public class ASCII_Art {
    public static final String STARS = "9 1\\1|1/2\t9 1\\1|1/2\t9 1\\1|1/2\t9 1\\1|1/2\t9 1\\1|1/08 1-1 1*1 1-2\t8 1-1 1*1 1-2\t8 1-1 1*1 1-2\t8 1-1 1*1 1-2\t8 1-1 1*1 1-09 1/1|1\\2\t9 1/1|1\\2\t9 1/1|1\\2\t9 1/1|1\\2\t9 1/1|1\\00";
    public static final String TOPS  = "9 1/2\\2\t9 1/2\\2\t9 1/2\\2\t9 1/2\\2\t9 1/2\\08 1/1o2/1\\2\t8 1/1o2/1\\2\t8 1/1o2/1\\2\t8 1/1o2/1\\2\t8 1/1o2/1\\07 2/1\\2/2\\2\t7 2/1\\2/2\\2\t7 2/1\\2/2\\2\t7 2/1\\2/2\\2\t7 2/1\\2/2\\00";
    public static final String MIDS  = "8 3/1o1\\2\t8 3/1o1\\2\t8 3/1o1\\2\t8 3/1o1\\2\t8 3/1o1\\07 2/1o2/2\\2\t7 2/1o2/2\\2\t7 2/1o2/2\\2\t7 2/1o2/2\\2\t7 2/1o2/2\\06 2/1\\3/1o2\\2\t6 2/1\\3/1o2\\2\t6 2/1\\3/1o2\\2\t6 2/1\\3/1o2\\2\t6 2/1\\3/1o2\\05 1/1o2\\1/2\\2/1\\1o1\t5 1/1o2\\1/2\\2/1\\1o1\t5 1/1o2\\1/2\\2/1\\1o1\t5 1/1o2\\1/2\\2/1\\1o1\t5 1/1o2\\1/2\\2/1\\1o00";
    public static final String BOTS  = "6 2/1\\1/1o1/3\\2\t6 2/1\\1/1o1/3\\2\t6 2/1\\1/1o1/3\\2\t6 2/1\\1/1o1/3\\2\t6 2/1\\1/1o1/3\\05 1/1o2\\1/2\\2/1\\1o1\t5 1/1o2\\1/2\\2/1o1\\1\t5 1/1o2\\1/2\\2/1o1\\1\t5 1/1o2\\1/2\\2/1o1\\1\t5 1/1o2\\1/2\\2/1o1\\04 1/1\\3/1o2\\2/3\\1\t4 1/1\\3/1o2\\2/3\\1\t4 1/1\\3/1o2\\2/3\\1\t4 1/1\\3/1o2\\2/3\\1\t4 1/1\\3/1o2\\2/3\\03 1/1o1/2\\1/3\\1o3\\1/1\\1\t3 1/1o1/2\\1/3\\1o3\\1/1\\1\t3 1/1o1/2\\1/3\\1o3\\1/1\\1\t3 1/1o1/2\\1/3\\1o3\\1/1\\1\t3 1/1o1/2\\1/3\\1o3\\1/1\\02 1o4\\2/2\\2/1o1/1\\1/1o1\\1\t2 1o4\\2/2\\2/1o1/1\\1/1o1\\1\t2 1o4\\2/2\\2/1o1/1\\1/1o1\\1\t2 1o4\\2/2\\2/1o1/1\\1/1o1\\1\t2 1o4\\2/2\\2/1o1/1\\1/1o1\\00";
    public static final String BASES = "8 1(3_1)2\t8 1(3_1)2\t8 1(3_1)2\t8 1(3_1)2\t8 1(3_1)00";

    // public static String out = "";

    /**
     * -------------------------------
     * Main Method
     * This method do nothing other than call printString()
     * -------------------------------
     */
    public static void main(String[] args)
    {
        String input = STARS + TOPS + MIDS + BOTS + BASES;

        System.out.print(printString(input));
    }


    /**
     * method: printString
     * * This is the method that is actually running, it is a void, it does not return anything
     * @param input, the string of the "ASCII" code
     * @return (str)out, which is the result of printString
     * @return
     */

    public static String printString(String input)
    {
        String out = "";
        //String input = combined; //input = teacher given
        Integer count; //for while loop, not printing 00 as /n/n
        Character a;
        Character b;
        //a and b are the input from input

        //I remove the first char of the string, so length()>0 = if exist
        while(input.length() > 0) {
            if(input.length() != 0) {
                a = input.charAt(0); //read the first char in the string
                input = input.substring(1); //than remove it
                count = 0;
                while(Character.getNumericValue(a) == 0) { //if the char a is 0
                    //the reason that I use while is, if I use if, it can only print 1 \n if there is 00000000
                    //but in this assignment, it seem like that the teacher only want me to print 1 \n if there is two 0
                    if (input.length() != 0) {
                        a = input.charAt(0);
                        input = input.substring(1);
                        if(count<1) //so it doesn't print 2 /n if there is 00
                            out += "\n";
                        count++;
                    }
                    else
                        break;
                }
                if(input.length() != 0) { //if string exist

                    b = input.charAt(0); //take the first char out
                    input = input.substring(1, input.length()); //than remove
                    /* this part actually never run
                    while(Character.getNumericValue(b)==0) {

                        b = input.charAt(0);
                        input = input.substring(1, input.length());
                        ASCII_Art.out += "\n";

                    }
                    */
                }
                else
                    break;

                int c = Character.getNumericValue(a);//convert char to int so it can for loop
                for(int y = 0; y < c; y++) {

                    out += b.toString();//add char b c times into the str out
                }
            }
            else
                break;
        }
        //System.out.print(out);//gg
        return out;
    }

}
