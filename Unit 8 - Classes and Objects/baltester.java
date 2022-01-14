//Jackson Clayton
//4/25/19
//Unit 8 Quiz
public class baltester{
   public static void main(String [] args) {
      Balance bal = new Balance(100.0, 70.0, "g");
      System.out.println(bal);//A balance with left side 100.0 g and right side 70.0 g
      bal.setLeft(8.0);
      bal.setRight(7.0);
      bal.setUnits("kg");
      System.out.println(bal); //A balance with left side 8.0 kg and right side 7.0 kg
      System.out.println(bal.calcDifference()); //1.0
      System.out.println(bal.getLeft()); //8.0
      System.out.println(bal.getUnits()); //kg
      System.out.println(bal.getRight()); //7.0
      Balance empty = new Balance();
      System.out.println(empty); //A balance with left side 0.0 kg and right side 0.0kg
      System.out.println(empty.getLeft()); //0.0
   }
}