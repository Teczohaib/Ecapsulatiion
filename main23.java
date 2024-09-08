//main23.java
class A{
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
class main23{
    public static void main(String[] args){
        A a=new A();
        a.setname("Ahmed");
        System.out.println("name is:" + a.getname());
    }
}