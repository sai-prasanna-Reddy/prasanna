class EncapsulationD
{
  public static void main(String args[])
  {
    Employee e=new Employee();
    e.setEmpId(3);
    e.setEmpName("prasanna");
    System.out.println(e.getEmpName());
    }
}
class Employee
{
  private int empId;
  private String empName;
  public int getEmpId(){
    return empId;
  }
  public void setEmpId(int empId){
   this.empId=empId;
  }
  public String getEmpName(){
   return empName;
   }
 public void setEmpName(String empName)
 {
   this.empName=empName;
  }
}