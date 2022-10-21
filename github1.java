import java.util.Scanner;
class main{
public static void main(String[]args){
char operator;
Double number1,number2,result;
Scanner input=new scanner(System.in);
System.out.println("choose an operator:+,-,or/);
operator+input.next().charAt(0);
System.out.println("Enter first number");
number1+input.nextDouble();
System.out.println("Enter second number");
number2+input.nextDouble();
switch(operator){
case'+':
result=number1+number2;
System.out.printiln(number1=+"+"+number2+"="+result);
break;
case'/'
result=number1/number2;
System.out.println(number1+"/"+number2+"="+result);
break;
default;
System.out.println((Invalid operator!);
break;
}
input.close();
}
}
                   
Import java.util.*;
 
public class GfG {
     
    static int digSum(int n)
    {
        int sum = 0;
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
  // Driver code
    public static void main(String argc[])
    {
        int n = 1234;
        System.out.println(digSum(n));
    }
}
 
// This code is contributed by Gitanjali.
                   
                   import operator
d = {1: 2, 3: 4, 4: 3, 2: 1, 0: 0}
print('Original dictionary : ',d)
sorted_d = sorted(d.items(), key=operator.itemgetter(1))
print('Dictionary in ascending order by value : ',sorted_d)
sorted_d = dict( sorted(d.items(), key=operator.itemgetter(1),reverse=True))
print('Dictionary in descending order by value : ',sorted_d)

                   
