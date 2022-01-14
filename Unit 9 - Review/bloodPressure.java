public class bloodPressure{
   private String name;
   private int Systolic;
   private int Diastolic;
   private String category;
   
   public bloodPressure(String nameIn, int SysIn, int DiasIn){
   name = nameIn;
   Systolic = SysIn;
   Diastolic = DiasIn;
   }
   
   public bloodPressure(){
   }
   
   public void setName(String nameIn){
   name = nameIn;
   }
   
   public void setSys(int SysIn){
   Systolic = SysIn;
   }
   
   public void setDias(int DiasIn){
   Diastolic = DiasIn;
   }
   
   public String getName(){
   return name;
   }
   
   public String getCat(){
   if (Systolic < 120 && Diastolic < 80)
   category = "normal blood pressure";
   if ((Systolic >= 120 && Systolic <= 139) || (Diastolic >= 80 && Diastolic <= 89))
   category = "prehypertension"; 
   if ((Systolic >=  140 && Systolic <= 159 ) || (Diastolic >= 90 && Diastolic <= 99))
   category = "high blood pressure stage 1"; 
   if ((Systolic > 160) || (Diastolic > 100 ))
   category = "high blood pressure stage 2"; 
   
   return category;
   }
   
   
   
}