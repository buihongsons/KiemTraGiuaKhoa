import java.util.HashMap;

public class HappyNumber {
    public boolean isHappy(int n)
    {
        HashMap<Long,Boolean> map=new HashMap();
        if(n==1)
            return true;
        map.put((long)n,true);
        while(true)
        {
            long val=0;
            while(n>0)
            {
                val=val+((n%10)*(n%10));
                n=n/10;
            }
            n=(int)val;
            if(val==1)
                return true;
            if(map.get(val)!=null)
                return false;
            map.put(val,true);
        }
    }
}
