public class  decimaltobinary
{
public static int dtob(int d)
    {
        int power=0;
        int rem;
        int b=0;
      while(d>0)
      {
        rem=d%2;
        b=b+ rem *(int)Math.pow(10,power);
        d=d/2;
        power++;
      }
      return b;

    }

public static int btod(int b)
    {
        int power=0;
        int last;
        int d=0;
      while(b>0)
      {
        last=b%10;
        d=d + last *(int)Math.pow(2,power);
        b=b/10;
        power++;
      }
      return d;

    }
    public static void main(String args[])
    {
        System.out.println(dtob(9));
        System.out.println(btod(1111));
    }

}