class Printer
{
 public void print(Paper p)
 {
   p.setText("Get in to this paper");
  }
}
class Paper
{
 String text;
 public void setText(String t)
 {
   text=t;
 }
 public String getText()
 {
   return text;
 }
}
class Playprint
{
 public static void main(String args[])
 {
  Paper p=new Paper();
  p.setText("hello world");
  System.out.println(p.getText());
  Printer hp=new Printer();
  hp.print(p);
  System.out.println(p.getText());
 }
}