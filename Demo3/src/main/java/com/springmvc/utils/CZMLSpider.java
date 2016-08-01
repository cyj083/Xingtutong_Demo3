package com.springmvc.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CZMLSpider {
	
	public static String getCZMLData(URL url) throws IOException {
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		InputStream inputStream = conn.getInputStream();   //通过输入流获得网站数据
		byte[] getData = readInputStream(inputStream);     //获得网站的二进制数据
		String data = new String(getData, "gb2312");
		inputStream.close();		
		return data;
	}

	public static byte[] readInputStream(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[1024];
		int len = 0;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while((len = inputStream.read(buffer)) != -1) {
			bos.write(buffer, 0, len);
		}
		bos.close();
		return bos.toByteArray();
	}
}
