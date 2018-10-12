package com.zh.webcrawler.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CrawlerUtil {
	public static void getUrlsOfPage(String address) {
		try {
			URL url = new URL(address);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setDoOutput(true);
			
//			String contentType = httpUrlConnection.getContentType();
//			System.out.println(contentType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getConnection(String address, File file) {
		StringBuffer stringBuffer = new StringBuffer();
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		try {
			//建立网络连接
			URL url = new URL(address);
			System.out.println(url.getPath());
			//打开网络连接
			URLConnection urlConnection = url.openConnection();
			//获取url的编码格式charSet
			String contentType = urlConnection.getContentType();
			String charSet = contentType.substring(contentType.indexOf("charset=")+"charset=".length());
			//文件的输出
			InputStream inputStream = urlConnection.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream, charSet);
			//缓冲流
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			OutputStream outputStream = new FileOutputStream(file);
			outputStreamWriter = new OutputStreamWriter(outputStream, charSet);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			//创建临时文件
			String temp = null;
			while((temp=bufferedReader.readLine())!=null) {
				bufferedWriter.write(temp+"\r\n");
				stringBuffer.append(temp+"\n");
				System.out.println(temp);
			}
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(stringBuffer.toString());
	}
	public static void main(String[] args) {
		getConnection("http://www.qq.com",new File("G:/1.txt"));
	}
}
