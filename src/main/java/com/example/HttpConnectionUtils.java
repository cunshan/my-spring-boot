package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnectionUtils {
  public static String sendJson(String destUrl, String postData, String type) throws Exception {
    String recString = "";
    URL url = null;
    HttpURLConnection urlconn = null;
    url = new URL(destUrl);
    urlconn = (HttpURLConnection) url.openConnection();
    urlconn.setRequestProperty("Content-Type", "application/json");
    urlconn.setRequestMethod(type);
    urlconn.setDoInput(true);
    urlconn.setDoOutput(true);
    urlconn.setConnectTimeout(5000);
    OutputStream out = urlconn.getOutputStream();
    out.write(postData.getBytes("UTF-8"));

    out.flush();
    out.close();

    BufferedReader rd = new BufferedReader(new InputStreamReader(urlconn.getInputStream(), "UTF-8"));
    StringBuffer sb = new StringBuffer();
    int ch;
    while ((ch = rd.read()) > -1) {
      sb.append((char) ch);
    }
    recString = sb.toString();
    rd.close();
    urlconn.disconnect();

    return recString;
  }

}