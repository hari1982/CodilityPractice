package lesson9;

import common.Solution;

public class MaxProfit implements Solution{

	public int solution(int[] A) {
		int gain = 0;
		if(A.length==0)
		    return 0;
		int maxValue= A[0];
		int minValue = A[0];
		for(int i=1;i<A.length;i++){
			if(A[i]<minValue && i!=A.length-1){
				minValue = A[i];
				maxValue = A[i+1];
			}else if(A[i]>maxValue){
			    maxValue = A[i];
			}
			if(maxValue-minValue>gain)
			    gain = maxValue-minValue;
		}
		return gain;
	}

}
