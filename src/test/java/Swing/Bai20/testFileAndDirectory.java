/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai20;

import java.io.File;

/**
 *
 * @author nguye
 */
public class testFileAndDirectory {
    public static void main(String[] args) {
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
        //File[] content = fo.getDirectoryCOntent("D:\\Code\\Java\\JavaCoBan");
        //System.out.println(fo.displayContent(content));
        
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sach cac tap tin con la:");
//        System.out.println(fo.displayContent(taptin));

        fo.getContentRecursively("D:\\PhanMemVaCacMonHoc\\HKI20212022");
    }
}  
