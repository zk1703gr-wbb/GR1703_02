package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class system {
//	1、录入通讯录信息包含姓名、性别、电话
//	2、显示所有通讯录信息则显示已录入的信息包含姓名、性别、电话
//	3、姓名搜索可以输入姓名查询对应的信息包含姓名、性别、电话
//	4、性别搜索可以输入性别并查询出所有此性别的信息
//	5、电话搜索可以输入电话查询对应的信息包含姓名、性别、电话
//	6、退出功能可以退出系统
	public static void main(String[] args) {
		
		while(true){
			System.out.println("请输入按照提示输入数字 123456");
			Scanner sc=new Scanner(System.in);
			String a =sc.next();
			List<infor> list=new ArrayList<infor>();
			if(a.equals("1")){
				infor ifo=new infor();
				System.out.println("请输入姓名,性别,电话:例如：张三,男,01234567890");
				String str = sc.next();
				String arr[]=str.split(",");
				ifo.setName(arr[0]);
				ifo.setSex(arr[1].charAt(0));
				ifo.setName(arr[3]);
				list.add(ifo);
				System.out.println("录入完成");
			}else if(a.equals("2")){
				for(infor i:list){
					i.information();
				}
			}else if(a.equals("3")){
				System.out.println("");
			}else if(a.equals("4")){
				System.out.println("");
			}else if(a.equals("5")){
				System.out.println("");
			}else if(a.equals("6")){
				System.out.println("程序结束！感谢您的使用！");
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
