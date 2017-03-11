import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int inp=Integer.parseInt(""+scan.nextInt());
German_Numbers_Conversion obj=new German_Numbers_Conversion();
obj.Conversion(inp);

  }
}

class German_Numbers_Conversion{
private int number;
public String discrete_nums[]={"Null","Ein","Zwei","Drei","Vier","Funf","Sech","Sieben","Acht","Nuen","Zehn","Elf","Zwolf"};
public String twenty="Zwazig";
public String hundred="Hundrert";
public String thausand="Transend";
public String Million="Millionen";
public String and="und";
public String upto99="zig";
//
// German_Numbers_Conversion(int num){
//   number=num;
// }




public  int Conversion(int ab){
number=ab;
  int qu,rm;
if(number<=12){System.out.print (""+discrete_nums[number]);}
if(number==20){System.out.print (""+twenty);}
if(number==100){System.out.print (""+hundred);}
if(number==1000){System.out.print (""+thausand);}
if(number==1000000){System.out.print (""+Million);}

if(number>12 && number<20){
qu=(number/10);
rm=(number%10);
System.out.print(discrete_nums[rm]+discrete_nums[10]);
}

if(number>20 && number<100){
qu=(number/10);
rm=(number%10);
if(rm==0){System.out.print(discrete_nums[qu]+upto99);}
else{
System.out.print(discrete_nums[rm]+and+discrete_nums[qu]+upto99);
}
}
if(number>100 && number<1000){
qu=(number/100);
rm=(number%100);
if(rm==0){System.out.print(discrete_nums[qu]+hundred);}
else{
System.out.print(discrete_nums[qu]+hundred);
System.out.print(Conversion(rm));}
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}


if(number>1000 && number<999999){
qu=(number/1000);
rm=(number%1000);
if(rm==0){System.out.print(Conversion(qu)+thausand);}
else{
System.out.print(Conversion(qu)+thausand);
System.out.print(Conversion(rm));
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}
}

return 1 ;

//Add code
}


}
