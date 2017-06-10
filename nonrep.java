import java.util.*;
class nonrep
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(ch[i]!=ch[i+1])
{
System.out.print(ch[i]);
}
}
}
}
