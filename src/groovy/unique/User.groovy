package unique

//@Validateable
class User {

  String username;
  long id;
  
   static constraints = {
    username blank: false, unique: true 
   }
}
