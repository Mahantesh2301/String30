package arraystopic;

public class BuyAndSell {
	public static void main(String[] args) {
	    int a[]= {5,3,10,29,100};
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]<min)
	    	{
	    		min=a[i];
	    	}
	    	if(a[i]-min>max)
	    	{
	    		max=a[i]-min;
	    	}
	    }
	    System.out.println("Max Value= "+max);
		}

}
