public class BooleanZen{

   public static void main(String[] args)
   {
   //#1
      int  a = 3, b = 12, c = 10;
      System.out.println(b+" is a multiple of "+ a+ "\t"+ multiple(a,b));// true
      System.out.println(c+" is a multiple of "+ a+ "\t"+ multiple(a,c));// false
      System.out.println("//");
   //#2
      int bb=85, cc=2, dd=9; 
      System.out.println(a+" is not greater than the square root of "+bb+"\t"+squareRoot (a,bb));
      System.out.println(a+" is not greater than the square root of "+cc+"\t"+squareRoot (a,cc));
      System.out.println(a+" is not greater than the square root of "+dd+"\t"+squareRoot (a,dd));
      System.out.println("//");
   //#3
      int a1=13, a2=8, a3=-13, a4=-32; 
      System.out.println("abs value of "+a1+" is  greater than abs value of "+a2+"\t\t"+magnitude(a1, a2));
      System.out.println("abs value of "+a3+" is  greater than abs value of "+a4+"\t"+magnitude(a3, a4));
      System.out.println("abs value of "+a2+" is  greater than abs value of "+a3+"\t"+magnitude(a2, a3));
      System.out.println("abs value of "+a4+" is  greater than abs value of "+a1+"\t"+magnitude(a4, a1));
      System.out.println("//");
   //#4
      int x1=3, x2=13, x3=-4, x4=0, x5=-12 ; 
      System.out.println(x1+" is a nonnegative one-digit number\t"+oneDigit(x1));
      System.out.println(x2+" is a nonnegative one-digit number\t"+oneDigit(x2));
      System.out.println(x3+" is a nonnegative one-digit number\t"+oneDigit(x3));
      System.out.println(x4+" is a nonnegative one-digit number\t"+oneDigit(x4));
      System.out.println(x5+" is a nonnegative one-digit number\t"+oneDigit(x5));
      System.out.println("//");
   //#5
      int d=13, e=13, f=-13, g=45 ; 
      System.out.println(d+" is opposite to "+e+"\t"+opposite(d, e));
      System.out.println(d+" is opposite to "+f+"\t"+opposite(d, f));
      System.out.println(f+" is opposite to "+d+"\t"+opposite(f, d));
      System.out.println(f+" is opposite to "+g+"\t"+opposite(f, g));
      System.out.println("//"); 
      //#6
      String str1="Sam", str2="One", str3="Onetwo", str4="ON" ; 
      System.out.println(str1+" is longer than "+str2+"\t"+longer(str1, str2));
      System.out.println(str1+" is longer than "+str4+"\t"+longer(str1, str4));
      System.out.println(str1+" is longer than "+str3+"\t"+longer(str1, str3));
      System.out.println(str4+" is longer than "+str3+"\t"+longer(str4, str3));
      System.out.println("//");
      //#7
      String s1="sun", s2="sunny", s3="moon"; 
      System.out.println("\""+s1+"\" is a substring of \""+s2+"\"\t"+part(s1, s2));
      System.out.println("\""+s2+"\" is a substring of \""+s1+"\"\t"+part(s2, s1));
      System.out.println("\""+s1+"\" is a substring of \""+s3+"\"\t"+part(s1, s3));
      System.out.println("//");  
      //#8
      char n1='Z', n2=' ', n3='8', n4='b'; 
      System.out.println(n1+" is a whiteSpace or a digit\t"+check(n1));
      System.out.println(n2+" is a whiteSpace or a digit\t"+check(n2));
      System.out.println(n3+" is a whiteSpace or a digit\t"+check(n3));
      System.out.println(n4+" is a whiteSpace or a digit\t"+check(n4));
      System.out.println("//");      
   }
   
   public static boolean multiple (int x, int y){
   return (y/x-y%x == y/x);
   }
   
   public static boolean squareRoot(int x, int y) {
return (x<Math.sqrt(y));
}
public static boolean magnitude (int x, int y) {
return (Math.abs(y)<Math.abs(x));
}
public static boolean oneDigit (int x) {
return (x>=0 && x<10);
}
public static boolean opposite (int x, int y) {
return ((Math.abs(y)==y && Math.abs(x) != x) || (Math.abs(x)==x && Math.abs(y) != y));
}
public static boolean longer (String str1, String str2) {
return (str1.length() > str2.length());
}
public static boolean part (String str1, String str2) {
return (str2.indexOf(str1) != -1);
}
public static boolean check (char given) {
return ((Character.isLetter(given) == false) || given == ' ');
}
}
