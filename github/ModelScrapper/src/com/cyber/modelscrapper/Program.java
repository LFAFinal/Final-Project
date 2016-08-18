/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyber.modelscrapper;

import com.cyber.modelscrapper.command.CyberScrapper;
import com.cyber.modelscrapper.command.MusicScrapper;
import com.cyber.modelscrapper.command.Scrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scrapper scrapper=new MusicScrapper();
        
        try{
            String link="http://new.downloadming1.com/audio%20songs/bollywood%20mp3/Deewaar%20(1975)/05%20Meine%20Tujhe%20Maanga%20-%20www.downloadming.com.mp3";
            scrapper.downloadImage(link,"manga.mp3");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }

}
