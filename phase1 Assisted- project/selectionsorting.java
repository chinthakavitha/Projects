package com;

public class selectionsorting {
	public static void customerSort(int num[],int size) {
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
public static void main(String[] args) {
		int num[]= {3,1,6,4,9,7,6};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+"");
		}
		selectionsorting.customerSort(num,num.length);
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+"");
		
		}
	}
}