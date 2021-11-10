/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai20;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author KimAnh
 */
public class TreeDemoModel implements TreeModel {
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        rootNode = buildTree("CarAndMotor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode();
        //Xay dung cac nut con cho root
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        //them vao roots
        root.add(car);
        root.add(motor);
        
        //Xay dung cac nu con cho motor
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        motor.add(yamaha);
        motor.add(honda);
        //Xay dung cac nu con cho car
        DefaultMutableTreeNode  vinfast = new DefaultMutableTreeNode("Vinfast");
        DefaultMutableTreeNode audi = new DefaultMutableTreeNode("Audi");
        
        car.add(audi);
        car.add(vinfast);
        
        return root;
        
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
