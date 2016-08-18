/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyber.modelscrapper.command;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author USER
 */
public abstract class Scrapper {
    
    public String getContent(String link)throws IOException{
                URLConnection conn = new URL(link).openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\r\n");
        }
        reader.close();
        return content.toString();
    }

    public abstract void scrap(String link)throws IOException;

    public void downloadImage(String url, String fileName) throws IOException {
        FileOutputStream os = new FileOutputStream(fileName);

        byte[] data = new byte[1024*10];
        int i = 0;
        InputStream is = new URL(url).openConnection().getInputStream();
        while ((i = is.read(data)) != -1) {
            os.write(data, 0, i);
        }
        os.close();
        is.close();
    }
}
