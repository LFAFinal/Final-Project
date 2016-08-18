/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyber.modelscrapper.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class CyberScrapper extends Scrapper {

    @Override
    public void scrap(String link) throws IOException {
        String baseURL="http://cybersansar.com/";
        
        String content=getContent(link);
        
        String modelRegEx = "graphics/model/(.*?)/thumb/(.*?)\\.jpg";
        Pattern pattern = Pattern.compile(modelRegEx);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {

            String fullURL = (baseURL + matcher.group(0)).replace("/thumb", "").replace(" ", "%20");
            String[] tokens = fullURL.split("/");
            String folderName = matcher.group(1);
            File folder = new File(folderName);

            if (!folder.isDirectory()) {
                folder.mkdir();
            }

            // System.out.println(fullURL);
            
            System.out.println(folder + "/" + tokens[tokens.length - 1]);
            downloadImage(fullURL, folder + "/" + tokens[tokens.length - 1]);
        }

    }
}
