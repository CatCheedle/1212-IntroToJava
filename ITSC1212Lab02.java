public class ITSC1212Lab02 {
    public static void main(String[] args) {
         short x = 0;
         short y = 2000;
         int z = 100000;

         System.out.println(x + y + z);
         /*  The Answer was 102000 and you 
         would need an int to store the remaining value.*/
         char a = 'a';
         char b = 'b';
         System.out.println(a);
         System.out.println(b);
         System.out.println(a + b);
         /*
          * The reason that it prints the number 195 is because
          the unicode for a = 97 and the unicode for b = 98 and 
          97 + 98 = 195
          */
    }
}
