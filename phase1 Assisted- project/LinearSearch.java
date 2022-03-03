package com;

public class linearsearch {
	public static void customeSort(int num[],int size) {
		for(int i=0;i<size-1;i++) {
			int min=i;
			for(int j=i+1;j<size;j++){
				if(num[j]>num[min]) {
					min=j;
				}
			}
			int temp=num[i];
					num[i]=num[min];
			num[min]=temp;
		}
	}
public static int linearsearch(int num[],int size,int searchelement) {
	for(int i=0;i<size;i++) {
		if(num[i]==searchelement) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) { 
	int num[]= {3,1,6,9,7,6};
	int i=linearsearch(num,num.length,6);
	if(i>0) {
		System.out.println("element found at position "+i);
	}else {
		System.out.println("elements is not present");
	}
}
}
