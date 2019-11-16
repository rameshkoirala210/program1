
public class Student extends Teacher {
   private int retrieveID;
   private String name;
   private String address;
   private double salary;
   private double marks;
   
   public Student(){
      retrieveID = 0;
      name = "";
      address = "";
      salary = 0.0;
      marks = 0.0;      
   } 
   
   public Student(int retrieveID, String name, String address, double salary, double marks){
      super(retrieveID, name, address, salary);
      this.marks = marks;
   } 
   
   public void setretrieveID(int retrieveID) {
      super.setretrieveID(retrieveID); 
      this.retrieveID = retrieveID;
   }
   
   public int getretrieveID() {
      return retrieveID;
   }
   public void setName(String name) {
      super.setName(name);
      this.name = name; 
   }
   public String getName() {      
      return name;
   }
   public void setAddress(String address) {
    super.setAddress(address);
    this.address = address; 
   }
   public String getAddress() {
    return address;
   }
   public void setSalary(double salary) {
      super.setSalary(salary);
      this.salary = salary; 
   }
   public double getSalary() {
      return salary;
   }
   public String toString(){
      return super.toString() + "," + this.marks;
    }   

}
