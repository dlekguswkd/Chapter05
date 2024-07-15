package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {
	
	//읽는방법이 달라서 오류뜸
	
	public static void main(String[] args) throws IOException {
	
		Reader fr=new FileReader("C:\\javaStudy\\MS949.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while(true) {
			
			String str=br.readLine();
					
			if(str==null) {
				System.out.println("파일읽기 끝");
				break;
			}
			System.out.println(str);
		}
		
	
	
		br.close();
		System.out.println("프로그램 종료");
	}

}
