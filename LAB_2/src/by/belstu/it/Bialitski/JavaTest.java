package by.belstu.it.Bialitski;

public class JavaTest {
   /** @author Vladislav
    * @version 1.0*/

    public static void main(String[] args) {
        /**@return 12
         * @thorws NotError
         * @param myParam*/
        //System.out.println("What");
        char ch ='C';
         /**@value 7
          * @see smt*/
        int i  = 5;
        short sh = 12;
        byte by = 124;
        long lg = 23121;
        boolean bl = true;
        double db = 321.213;
        String str = "";
        str+=i;
        System.out.println(str);
        str+= ch;
        str+=db;
        by =(byte)(i + by);
        i = (int)(db + lg);
        lg = (long)i + 2147483647;
        System.out.println(lg);
        System.out.println(sint);
        bl = bl&&bl;
        bl = bl^bl;
     //   bl = bl + bl;
         lg = 9223372036854775807l;
         lg = 0x7fff_ffff_fffl;
         ch='a';
         ch = '\u0051';

        ch = 97;

        ch = 'a'+ '\u0051'+97;
        System.out.println(ch);//sout
        double dd = 3.45%2.4;
        System.out.println(dd);//sout
        dd =1.0/ 0.0;

        dd = Math.log(-345);
        System.out.println(dd);//sout


        System.out.println( "this:" + Float.intBitsToFloat(0x7F800000));
        System.out.println( "And this:" +Float.intBitsToFloat(0xFF800000));

        final int cons = 11;
        double pi = Math.PI;
        double e = Math.E;

        System.out.println(Math.round(pi));
        System.out.println(Math.round(e));
        System.out.println(Math.min(Math.PI,Math.E));

        System.out.println(Math.random());
/*        Boolean b = true;
        Integer q = new Integer(2);
        System.out.println(q);
        Character cc = new Character('C');
        Byte bt = new Byte("12");
        Short shq = new Short("32");
        Long lq = new Long(2322);
        Double doub =  new Double(22.212);
        q = q << 1;
        System.out.println(q);
        doub+=doub;*/
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

/*        Integer testint = new Integer(122);
        Byte tetsbt = new Byte((byte) 12);
        byte testb = 21;
        testint = (int)testb;*/
        //testb = (Byte)testint;


        int po;
        po = Integer.parseInt("11");

        System.out.println( Integer.toHexString(po));

        System.out.println( Integer.compare(2,2));//a<b == -1
        String str12 = Integer.toString(21);
        System.out.println(Integer.bitCount(15));//4 единицы
        String CheckNull;
       // System.out.println(Integer.(CheckNull));//не работает

        //f
        String s34 = "234";
       // Integer num = new Integer(s34);
      Integer i34 = Integer.valueOf(s34);
      i34 = Integer.parseInt(s34);

        String inputString = "MyStr";
        byte[] byteArray = inputString.getBytes();
        System.out.println(byteArray);
        String outString = new String(byteArray);
        System.out.println(outString);

        String st1 = "TRUE";
        String st2 = "yes";
        boolean myBool;

        myBool = Boolean.parseBoolean(st1);
        System.out.println(myBool);
        myBool = Boolean.valueOf(st2);
        System.out.println(myBool);

        String normalName1 = "str";
        String normalName2 = "str";
        System.out.println(normalName1 == normalName2);
        System.out.println(normalName1.equals(normalName2));
        System.out.println(normalName1.compareTo(normalName2));

        System.out.println("С NULL");
        String normalName3 = "str";
        String normalName4 =null;
        System.out.println(normalName3 == normalName4);
        System.out.println(normalName3.equals(normalName4));
        //System.out.println(normalName3.compareTo(normalName4));

        String proizvolStr = "Help me!";
        String []strArr = proizvolStr.split(" ");
        System.out.println(strArr[0]+"\n"+ strArr[1]);

        boolean mb = proizvolStr.contains("me");
        System.out.println(mb);
        System.out.println(proizvolStr.hashCode());
        System.out.println(proizvolStr.indexOf("e"));
        System.out.println(proizvolStr.length());
        proizvolStr = proizvolStr.replace("!","@@@@");
        System.out.println(proizvolStr);


        //g
        char[][] c1 = new char[3][4];
        char[] c2[];
        char c3[][];

        c1[2][1] = 'q';
        System.out.println(c1.length);
        System.out.println(c1[0].length);

        c2 = new char[][]{{'q','w'},{'e','r'}};
        c3 = new char[][]{{'t','y'},{'a','b'}};
        boolean comRez = c2==c3;
        System.out.println(comRez);
        c2 = c3;
        System.out.println(c3[0][0]);
        c3 = new char[][]{{'S','w','e','e'},{'t',' ','D','r'},{'e','a','m','s'}};
        for(char[] s: c3){
            System.out.print(s);
        }
       // System.out.println(c3[4][5]);
        System.out.println();
        //h
        WrapperString wrapperString = new WrapperString("First");
        wrapperString.replace('F','l');
        System.out.println(wrapperString);

        WrapperString wrapstr = new WrapperString("Second"){
            public void replace(char oldchar,char newchar){
                System.out.println("newNAme");
            }
            public void delete(char newChar){
                System.out.println("Delete");
            }
        };
        wrapstr.replace('p','o');
        wrapstr.delete('o');

        //i
        /**коментарий*/

    }
    static int sint;

    public static  final int cons2 = 22;
}
