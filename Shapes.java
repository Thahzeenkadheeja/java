import java.util.*;
//area of square
class Shapes
{
int area(int l) 
{
return l*l;
}

//area of rectangle
int area(int l, int b)
{
return l*b;
}

//area of cuboid
int area(int l, int b, int h)
{
return ((2*l*b) + (2*l*h) + (2*h*b ));
}
public static void main(String[] args)
{
Shapes s = new Shapes();
System.out.println("area of square:"+s.area(3));
System.out.println("area of rectanle:" + s.area(2,4));
System.out.println("area of cuboid:"+ s.area(3,4,6));
}
}
