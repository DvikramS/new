package test1;

public class newt {

	public static int x[]={1,8,4,6,0,3,5,2,7,9,11,12,13}; 
	public static int y[]=new int[x.length];
	public static void main(String[] args) {

sort(0,x.length-1);
for(int i=0;i<x.length;i++)
	System.out.println(x[i]);

		
	}
	public static void merging(int low, int mid, int high){
		int l1,l2,i;
		for(l1=low,l2=mid+1,i=low;l1<=mid&&l2<=high;i++){
			if(x[l1]<x[l2]){
				y[i]=x[l1++];
			}else{
				y[i]=x[l2++];
			}
		}
		while(l1<=mid){
			y[i]=x[l1++];
		}
		while(l2<=high){
			y[i]=x[l2++];
		}
	}
	public static void sort(int low , int high){
		int mid=0;
		if(low<high){
			mid=(low+high)/2;
		
		sort(low,mid);
		sort(mid+1,high);
		merging(low,mid,high);
		}
	}
	
	
}


