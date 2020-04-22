package com.ArrayList;
public class CheckArrayHasConsecutiveNos {
		public Boolean WihtOutAuxArray(int [] arrA){
			//this method with work if numbers are non negative
			int max = findMax(arrA);
			int min = findMin(arrA);
			if(arrA.length!=max-min+1) return false;
			for(int i = 0;i<arrA.length;i++){
				arrA[i] = arrA[i]-min+1;
			}
			for(int i = 0;i<arrA.length;i++){
				int x  = Math.abs(arrA[i]);
				if(arrA[x-1]>0){
					arrA[x-1] = arrA[x-1]*-1;
				}
				else{
					return false;
				}
			}
			return true;
		}
		public Boolean withAuxArray(int [] arrA){
			// this method with work even if numbers are negative
			int []  aux = new int [arrA.length];
			int max = findMax(arrA);
			int min = findMin(arrA);
			if(arrA.length!=max-min+1) return false;
			for(int i = 0;i<arrA.length;i++){
				arrA[i] = arrA[i]-min;
				aux[i] = 0;
			}
			for(int i = 0;i<arrA.length;i++){
				if(aux[arrA[i]]==0){
					aux[arrA[i]]=1;
				}
				else{
					return false;
				}
			}
			//If we have reached till here means , we satisfied all the requirements
			return true;
		}
		public int findMax(int [] arrA){
	// find the maximum in array
			int max = arrA[0];
			for(int i = 1;i<arrA.length;i++){
				if(max<arrA[i]){
					max = arrA[i];
				}
			}
			return max;
		}
		public int findMin(int [] arrA){
	// find the minimum in array
	

			int min = arrA[0];
			for(int i = 1;i<arrA.length;i++){
				if(min>arrA[i]){
					min = arrA[i];
				}
			}
			return min;
		}
		public static void main (String[] args) throws java.lang.Exception
		{
			int [] arrA = {21,24,22,26,23,25};
			CheckArrayHasConsecutiveNos i = new CheckArrayHasConsecutiveNos();
			System.out.println(i.withAuxArray(arrA));
			int [] arrB = {11,10,12,15,13};
			System.out.println(i.WihtOutAuxArray(arrB));
			int [] arrC = {11,10,14,13};
			System.out.println(i.WihtOutAuxArray(arrC));
	

		}
	}

