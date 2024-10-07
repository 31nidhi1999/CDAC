public class pqdemo{
static void swap(int[]a,int x,int y){
int temp=a[x];
a[x]=a[y];
a[y]=temp;
}
static void heapify(int[]a,int[]pq,int n,int i){
	int largest=i;
	int l=2*i+1;
	int r=2*i+2;
if(l<n&&a[l]>a[largest]) largest=l;
if(r<n&&a[r]>a[largest]) largest=r;
if(largest!=i){
	swap(a,largest,i);
	swap(pq,i,largest);
	heapify(a,pq,n,largest);
	}
}
static void maxpq(int []a,int[] pq){
	int n=a.length;
	for(int i=n/2-1;i>=0;i--){
		heapify(a,pq,n,i);
	}
	for(int i=n-1;i>=0;i--){
		swap(a,i,0);
		swap(pq,i,0);
		heapify(a,pq,i,0);
	}
}
static void display(int[] a){
for(int i:a) System.out.print(i+" ");
System.out.println();
}
public static void main(String[] args){
int[] a = {3,10,5,6,7}; // 6,3,7,10,5
int[] pq = {2,4,6,1,3}; // 5
display(a);
display(pq);
display(pq);
maxpq(a,pq);
display(a);
display(pq);
}
}