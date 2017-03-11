//Created By :Ankur Pandey(AnkDos)

import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
     long inp= scan.nextLong();
German_Numbers_Conversion obj=new German_Numbers_Conversion();
obj.Conversion(inp);

  }
}

class German_Numbers_Conversion{
private  long number;
public String discrete_nums[]={"Null","Ein","Zwei","Drei","Vier","Funf","Sech","Sieben","Acht","Nuen","Zehn","Elf","Zwolf"};
public String twenty="Zwazig";
public String hundred="Hundrert";
public String thausand="Transend";
public String Million="Millionen";
public String Billion="Milliarde";
public String and="und";
public String upto99="zig";
//
// German_Numbers_Conversion( long num){
//   number=num;
// }




public   long Conversion( long ab){
number=ab;
   int qu,rm;
if(number<=12){System.out.print (""+discrete_nums[(int)number]);}
if(number==20){System.out.print (""+twenty);}
if(number==100){System.out.print (""+hundred);}
if(number==1000){System.out.print (""+thausand);}
if(number==1000000){System.out.print (""+Million);}
if(number==1000000000L){System.out.print (""+Billion);}

if(number>12 && number<20){
qu=((int)number/10);
rm=((int)number%10);
System.out.print(discrete_nums[rm]+discrete_nums[10]);
}

if(number>20 && number<100){
qu=((int)number/10);
rm=((int)number%10);
if(rm==0){System.out.print(discrete_nums[qu]+upto99);}
else{
System.out.print(discrete_nums[rm]+and+discrete_nums[qu]+upto99);
}
}
if(number>100 && number<1000){
qu=((int)number/100);
rm=((int)number%100);
if(rm==0){System.out.print(discrete_nums[qu]+hundred);}
else{
System.out.print(discrete_nums[qu]+hundred);
System.out.print(Conversion(rm));}
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}


if(number>1000 && number<=999999){
qu=((int)number/1000);
rm=((int)number%1000);
if(rm==0){System.out.print(Conversion(qu)+thausand);}
else{
System.out.print(Conversion(qu)+thausand);
System.out.print(Conversion(rm));
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}
}

if(number>1000000 && number<=999999999){
qu=((int)number/1000000);
rm=((int)number%1000000);
if(rm==0){System.out.print(Conversion(qu)+Million);}
else{
System.out.print(Conversion(qu)+Million);
System.out.print(Conversion(rm));
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}
}

if(number>1000000000L && number<=999999999999L){
qu=((int)number/1000000000);
rm=((int)number%1000000000);
if(rm==0){System.out.print(Conversion(qu)+Billion);}
else{
System.out.print(Conversion(qu)+Billion);
System.out.print(Conversion(rm));
// German_Numbers_Conversion obj2=new German_Numbers_Conversion();
// obj2.;
}
}



return 1 ;


}


}
