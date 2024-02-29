import java.util.Scanner;

class Cpu
{
	int price=34000; //global variable
	
	class Processor
	{
	 String manufacturer="intel";
	 int no_of_cores=4;
	 void display()
	 {
	   System.out.println("no_of_cores :"+no_of_cores);
	   System.out.println("manufacturer:"+manufacturer);
	 }
        }
        void display()
        {
         Processor p=new Processor();
         p.display();
         System.out.println("price:"+price);
        }
        static class RAM
        {
         int mem=250;
         String manufacturer="croseir";
         void display()
         {
         System.out.println("memory :"+mem);
         System.out.println("manufacturer:"+manufacturer);
         }
        }
     }
     class Cpus // main class
     {
      public static void main(String [] args)
      {
       Cpu c1=new Cpu();
       c1.display();
       Cpu.RAM r1=new Cpu.RAM();
       r1.display();
       }
      }         	
	   
	   
