//Jackson Clayton
//pd 6
//10/5/18

public class Armstrong {
      public static void main(String[] args) {
         int cube1 = 1;
         int cube2 = 1;
         int cube3 = 1;
         int c = 1;
         int b =1;
         int cubed = (cube1 + cube2 + cube3);
         int result = ((cube1*100)+(b*10)+(c));
         for (int a=1; a<=9; a++){   
            for (b=0; b<=9; b++){  
               for (c=0; c<=9; c++){
               cube1=((a*a)*a);
               cube2=((b*b)*b);
               cube3=((c*c)*c);
               cubed = (cube1 + cube2 + cube3);
               result = ((a*100)+(b*10)+(c));
               if (cubed==result) {
                    System.out.println(cubed);}
               }
            }
         }
       }
}