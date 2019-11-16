
public class Teacher {
   private int retrieveID;
   private String name;
   private String address;
   private double salary;
   
   public Teacher (){
     retrieveID = 0;
     name = "";
     address = "";
     salary = 0.0; 
   } 
   public Teacher (int retrieveID, String name, String address, double salary){
    this.retrieveID = retrieveID;
    this.name = name;
    this.address = address;
    this.salary = salary;
   }
    
   public void setretrieveID(int retrieveID) {
    this.retrieveID = retrieveID; 
   }
   public int getretrieveID() {
    return retrieveID;
   }
   public void setName(String name) {
    this.name = name; 
   }
   public String getName() {
    return name;
   }
   public void setAddress(String address) {
    this.address = address; 
   }
   public String getAddress() {
    return address;
   }
   public void setSalary(double salary) {
    this.salary = salary; 
   }
   public double getSalary() {
    return salary;
   }

   public String toString(){
      return retrieveID + ", " + name +  ", " + address +  ", " + salary; 
   }


}
