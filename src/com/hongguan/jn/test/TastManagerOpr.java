package com.hongguan.jn.test;
import java.util.ArrayList;

public class TastManagerOpr {
	
	public static void main(String[] args) {
		int [] taskArr = {0,30,155,1,80,255,170,40,99};
		ArrayList system_task = new ArrayList();
		ArrayList user_task = new ArrayList();
		secheduler(taskArr,taskArr.length,system_task,user_task);
		System.out.println("system_task="+system_task+" user_task="+user_task);
		System.out.println("OK111");
	}
	
	static void secheduler(int[] task,int taskn,ArrayList a,ArrayList b){
		int tindex = 0;
		for(int i=0;i<taskn;i++){
			tindex = 0;
			for(int j=1;j<taskn;j++){
				if(task[tindex]>task[j]){
					tindex=j;
				}
			}
			
			if(task[tindex]<50){
				a.add(tindex);
			}else if(task[tindex]<=255){
				b.add(tindex);
			}else{
				continue;
			}
			task[tindex]=256;
		}
		
		a.add(-1);
		b.add(-1);
	}
}
