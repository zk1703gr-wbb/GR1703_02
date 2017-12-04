package practic;

public class stringutil {

	public static char CharAt(String str,int i){
		char arr[]=str.toCharArray();
		return arr[i];
	}
			
	public static String subString(String str ,int a,int b){
		
	     char arr[]=str.toCharArray();
		String result="";
		for(int i=a;i<b;i++){
			result =result+arr[i];
		}
		return result;
		
		
	}
		
	public static int indexof(String str,String intsert){
		char arr[]=str.toCharArray();
		char arr2[]=intsert.toCharArray();
		boolean c=true;int t=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr[0]){
				int a=i;int b=0;
				while(b<intsert.length()){
					a++;b++;
					if(arr[a]!=arr2[b]){
						c=false;
						break;
					}
				}
				if(c){
					 t=i;
				}
			}
			
		}
		return t;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
			
}
