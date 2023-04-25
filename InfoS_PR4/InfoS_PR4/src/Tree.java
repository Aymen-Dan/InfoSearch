import princeton.lib.BTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Tree {
    public BTree<String,ArrayList<Integer>> tree;
    private Index index;

    public Tree(Index i){
        index= i;
        tree = new BTree();

        ArrayList<String> res_list = new ArrayList(index.matrix.keySet());
        Collections.sort(res_list);

        for(String s: res_list){
            tree.put(s,index.matrix.get(s));
        }

    }

    public ArrayList<Integer> search(String key) {
        return tree.get(key);
    }

    //to string
    public String toString() {
        return "SORRY! I am  unable to print out the tree!";
    }

}
