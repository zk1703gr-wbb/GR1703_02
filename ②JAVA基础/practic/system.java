package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class system {
//	1��¼��ͨѶ¼��Ϣ�����������Ա𡢵绰
//	2����ʾ����ͨѶ¼��Ϣ����ʾ��¼�����Ϣ�����������Ա𡢵绰
//	3������������������������ѯ��Ӧ����Ϣ�����������Ա𡢵绰
//	4���Ա��������������Ա𲢲�ѯ�����д��Ա����Ϣ
//	5���绰������������绰��ѯ��Ӧ����Ϣ�����������Ա𡢵绰
//	6���˳����ܿ����˳�ϵͳ
	public static void main(String[] args) {
		
		while(true){
			System.out.println("�����밴����ʾ�������� 123456");
			Scanner sc=new Scanner(System.in);
			String a =sc.next();
			List<infor> list=new ArrayList<infor>();
			if(a.equals("1")){
				infor ifo=new infor();
				System.out.println("����������,�Ա�,�绰:���磺����,��,01234567890");
				String str = sc.next();
				String arr[]=str.split(",");
				ifo.setName(arr[0]);
				ifo.setSex(arr[1].charAt(0));
				ifo.setName(arr[3]);
				list.add(ifo);
				System.out.println("¼�����");
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
				System.out.println("�����������л����ʹ�ã�");
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
