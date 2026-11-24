class UserRegistration{
  void register(String name,int userId){
    System.out.println("Registered User: "+name+" with ID: "+userId);
  }
  void register(int userId,String name){
    System.out.println("Registered ID: "+userId+" for user: "+name);
  }
}

public class Overload {
  public static void main(String[] args) {
    UserRegistration reg=new UserRegistration();
    reg.register("swetha", 234);
    reg.register(456,"Keerthana");
  }
}
