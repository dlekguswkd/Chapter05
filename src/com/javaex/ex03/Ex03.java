package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {
	
	//MS949 읽어서 응용해보기

	public static void main(String[] args) throws IOException{
		
		//읽기 스트림
		InputStream in=new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr =new InputStreamReader(in, "MS949");	//isr ->  InputStreamReader
		BufferedReader br=new BufferedReader(isr);
		
		
		/*
		//쓰기 스트림
		OutputStream out=new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStreamWriter osw= new OutputStreamWriter(out, "MS949");
		BufferedWriter bw= new BufferedWriter(osw);
		
		//bw.write(str);
		//bw.newLine();		//줄바꿈
		 //bw.close();
		*/
					
		//  String str=br.readLine();
		//  System.out.println(str);
		//String[] sArray=str.split("#");	//콤마를 기준으로 나누기
		//for(int i=0; i<sArray.length; i++) {
		//	System.out.println(sArray[i]);	
		//}			
		
		while(true) {
			
			String str=br.readLine();
			System.out.println(str);
			if(str==null) {
				System.out.println("읽기끝");
				break;
			}
		
		//ArrayList<Person> pList=new ArrayList<Person>();
		
		Person p01=new Person("이정재", "010-2222-2222","(주)열심히");
		Person p02=new Person("정우성", "010-0000-23451","잘하자(주)");
			
		
		
		br.close();
		System.out.println("프로그램 종료");
		
		
		
		/*
		 리스트를 만든다
		 
		 MS949읽어서
		 "이정재#010-2222-2222#(주)열심히"
		 읽어데이트를 자른다 (#으로 split하기 (자르기))
		 
		 Person 클래스에 담는다(Person클래스가 있어야한다)
		 
		 Person
		 -name	: 이정재
		 -hp	: 010-222-222
		 -company: (주)열심히
		 
		 리스트에 Person을 담는다
		 
		 리스트를 이용해서 출력한다
		 
		 -------
		 이름: 이정재
		 전화: 010-
		 회사: (주)열심히
		 */
		}
		
		
	}

}
