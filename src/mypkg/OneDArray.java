package mypkg;

public class OneDArray {
	
	int size;
	int arr[];
	int index=-1;
	OneDArray(int size){
		this.size=size;
		this.arr= new int[size];
	}
	
	int getIndexEle(int i) {
		if(i>index||i<0)return -1;
		
		return arr[i];
	}
	void add(int ele) {
		if(index==size) {
			return;
		}
		index++;
		arr[index]=ele;
		
	}
	
	int delete() {
	int val= arr[index];
		index--;
		return val;
	}
	int length() {
		if(index==-1)
			return -1;
		return this.index;
	}
	void print() {
	int newArr[] =this.arr; 
	int size= this.length();
	for(int i=0;i<=size;i++)
		System.out.print(newArr[i]+" ");
	System.out.println();
	}
	public static void main(String args[]) {
		OneDArray  arr = new OneDArray(10);
		OneDArray  narr = new OneDArray(10);
		
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(4);
		arr.add(9);
		arr.print();
		arr.delete();
		arr.print();
		System.out.println("element at index 3 is "+arr.getIndexEle(3));
		narr.add(1);
		narr.add(2);
		narr.add(12);
		narr.add(42);
		narr.add(9);
		narr.print();
		narr.delete();
		narr.print();
	}

}
