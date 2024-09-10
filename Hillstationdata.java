class Hilstation{
    void location(){
        System.out.println("location is ");
    }
    void famousfor(){
        System.out.println("famous for ");
    }
}
class newmurrey extends Hilstation{
   void location(){
        System.out.println("newmuree is a hilstation in murrey");
   }
   void famousfor(){
    System.out.println("newmuree is famousfor its chair ifts and snowfall");
   } 
}
class babusartop extends Hilstation{
   void location(){
        System.out.println("babusartop is a hilstation in kashmir");
   }
     void famousfor(){
    System.out.println("babusartop is famous for its natural beautiful views");
     }
}
class Hillstationdata{
    public static void main(String[] args){
        newmurrey A = new newmurrey();
        babusartop B = new babusartop();
        A.location();
        A.famousfor();

    }
}
