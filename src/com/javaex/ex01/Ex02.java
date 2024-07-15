package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	
	//Ex01은 오래걸리고 빨리 하는 방법 (묶어서해주기) 1024로 묶어서 빨리함

	public static void main(String[] args) throws IOException{
		
		InputStream in=new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out=new FileOutputStream("C:\\javaStudy\\byteBuffimg.jpg");

		byte[] buff=new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			
			//int data=in.read();
			int data = in.read(buff);
			System.out.println(data);
			
			if (data==-1) {
				System.out.println("복사끝");
				break;
			}
			
			out.write(buff);
		}
		out.close();
		in.close();
		System.out.println("프로그램끝");
	}

}
