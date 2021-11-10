/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai20;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author nguye
 */
public class FileTreeModel implements TreeModel{
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public FileTreeModel(String rootDir) {
        //Khoi tao nut goc
        rootNode = new DefaultMutableTreeNode(new File(rootDir));
        
        buildDirectoryTree(rootNode, rootDir);
        tree = new DefaultTreeModel(rootNode);
        
    }
    
    public void buildDirectoryTree(DefaultMutableTreeNode node, String rootDir) {
        
        File curDir = new File(rootDir);
        DefaultMutableTreeNode roor = new DefaultMutableTreeNode(curDir);
        
        if(!curDir.isDirectory()) {
            return;
        }
        
        File[] list = curDir.listFiles();
        for (int i = 0; i < list.length; i++) {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
            node.add(child);
            buildDirectoryTree(child, rootDir + File.separator + list[i].getName());
            
        }
                
    }
    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    
    @Override
    public Object getRoot() {
        return this.rootNode;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}