/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai20;

import java.awt.PageAttributes;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author KimAnh
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    
    
    //Thao tac 1: lien ket tat ca cac thu muc va tap tin trong thu muc hien tai
    
    public File[] getDirectoryCOntent(String folder) {
        File directory = new File(folder);
        
        if(directory.isFile()) {
            return null;
        }
        
        File[] results = directory.listFiles();
        return results;
    }
    
    public String displayContent(File[] content) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length; i++) {
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
            
        }
        return sb.toString();
    }
    
    public File[] getSubDirectories(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isDirectory()) {
                result.add(content[i]);
            }     
        }
        
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    public File[] getFiles(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isFile()) {
                result.add(content[i]);
            }     
        }
        
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac duyet de quy xuat ta ca cac tap tin va thu muc
    public void getContentRecursively(String folder) {
        File content = new File(folder);
        //dieu kien dung
        if(content.isFile()) {
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //Cau goi de quy trong stack
        System.out.println("Thu muc " + folder);
        File[] sub = content.listFiles();
        for (int i = 0; i < sub.length; i++) {
            getContentRecursively(folder + File.separator + sub[i].getName());
            
        }
    }
    
    //Thao tac 4: Doc ghi file van ban
    public String readTextFile(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            //Mo file
            FileReader fr = new FileReader(filename);
            
            //Dung bo nho dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
        } catch (FileNotFoundException ex) {
            return "Khong tim thay file" + filename;
        } catch (IOException e) {
            return "Khong the doc File" + filename;
        }
        
        return content.toString();
    }
    
    //Thao tac luu tap tin van ban
    
    public boolean writeTextFile(String filename, String content) {
        boolean flag = true; //luu thanh cong
        try {
            //mo file
            FileWriter fw = new FileWriter(filename);
            //dung bo nho dem
            BufferedWriter bw = new BufferedWriter(fw);
            //Ghi file
            bw.write(content);
            //Dong file
            bw.flush();
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            return false;
        } 
        return flag;
    }
}

