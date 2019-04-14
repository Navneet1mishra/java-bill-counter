import java.util.Scanner;
class Food
{ int item_no;
int amount=100;
int sum;
int t;
void discount()
{
System.out.println("Enter day you want to visit");
System.out.println("1.Monday  ||2. TUESDAY|| 3.WEDNESSDAY ||4.THURSDAY||5.FRIDAY");

Scanner a=new Scanner(System.in);
int t=a.nextInt();
if(t==3)
{
System.out.println("Enter number of food items you want to purchase");
int item_no=a.nextInt();
System.out.println("Each food item=Rs 100");
sum=(100*item_no)-100*item_no/5;
System.out.println("After discount your price is"+sum);}
else
{

System.out.println("You will get discount on wednessday");}

}}

class Shoes
{
int item;
int amount=500;
int add;
int y;
void price()
{
System.out.println("Enter day you want to visit");
System.out.println("1.Monday  ||2. TUESDAY|| 3.WEDNESSDAY ||4.THURSDAY||5.FRIDAY");
Scanner p=new Scanner(System.in);
int y=p.nextInt();
if(y==3)
{
System.out.println("Enter number of Shoes items you want to purchase");
int item=p.nextInt();
System.out.println("Each shoes is of Rs 500");
add=(500*item)-500*item/5;
System.out.println("After discount your price is"+add);}
else
{
System.out.println("You will get discount on wednessday");}

}}

class Clothes
{
int item1;
int amount2=500;
int adds;
int m;
void price1()
{
System.out.println("Enter day you want to visit");
System.out.println("1.Monday  ||2. TUESDAY|| 3.WEDNESSDAY ||4.THURSDAY||5.FRIDAY");

Scanner p1=new Scanner(System.in);
int m=p1.nextInt();
if(m==3)

{
System.out.println("Enter number of Clothes items you want to purchase");
int item=p1.nextInt();
System.out.println("Each Cloth is of Rs 500");
adds=(500*item)-500*item1/5;
System.out.println("After discount your price is"+adds);
}
else
{
System.out.println("You will get discount on wednessday");}

}}

class Jewellery
{
int item2;
int amount3=500;
int addd;

void price2()
{

Scanner p2=new Scanner(System.in);

System.out.println("Enter number of Jewellery items you want to purchase");
int item=p2.nextInt();
System.out.println("Each Jewellery is of Rs 50000");
addd=(50000*item)-50000*item2/5;
System.out.println("After discount your price is"+addd);
}

}

class Ca
{
public static void main(String [] args)

{

Scanner sc=new Scanner(System.in);
System.out.println("enter your choice");
System.out.println("1.FOOD ITEMS");
System.out.println("2.SHOES");
System.out.println("3.CLOTHES");
System.out.println("4.JEWELLERY");
int i=sc.nextInt();
Food obj=new Food();
Shoes ob=new Shoes();
Clothes o=new Clothes();
Jewellery oj=new Jewellery();
if (i==1)
{
obj.discount();
}
else if(i==2) 
{
ob.price();
}
else if(i==3)
{
o.price1();
}
else
{
oj.price2();
}





}
}
