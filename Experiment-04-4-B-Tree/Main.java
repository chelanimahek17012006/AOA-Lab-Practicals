import java.util.*;
class BPlusTree {
    static final int ORDER = 3;
    static class Node {
        int[] keys = new int[ORDER];
        Node[] child = new Node[ORDER+1];
        int n=0;
        boolean leaf=true;
        Node next;
    }
    Node root=new Node();
    Node findLeaf(int k) {
        Node p=root;
        while(!p.leaf) {
            int i=0;
            while(i<p.n && k>=p.keys[i]) i++;
            p=p.child[i];
        }
        return p;
    }
    boolean search(int k) {
        Node p=findLeaf(k);
        for(int i=0;i<p.n;i++) if(p.keys[i]==k) return true;
        return false;
    }
    void insert(int k) {
        if(search(k)) { System.out.println("Duplicate key ignored."); return; }
        if(root.leaf) {
            insertLeaf(root,k);
            if(root.n==ORDER) splitRootLeaf();
            return;
        }
        Node leaf=findLeaf(k);
        insertLeaf(leaf,k);
        if(leaf.n==ORDER) splitLeaf(leaf);
    }
    void insertLeaf(Node p,int k) {
        int i=p.n-1;
        while(i>=0 && p.keys[i]>k) { p.keys[i+1]=p.keys[i]; i--; }
        p.keys[i+1]=k; p.n++;
    }
    void splitRootLeaf() {
        Node old=root, right=new Node();
        right.n=1; right.keys[0]=old.keys[2];
        old.n=2; old.next=right;
        Node nr=new Node(); nr.leaf=false; nr.n=1;
        nr.keys[0]=right.keys[0]; nr.child[0]=old; nr.child[1]=right;
        root=nr;
    }
    void splitLeaf(Node leaf) {
        // Split a full leaf and insert its separator into its parent.
        // This teaching implementation supports one root level.
        Node right=new Node();
        right.n=1; right.keys[0]=leaf.keys[2];
        leaf.n=2; right.next=leaf.next; leaf.next=right;
        if(root==leaf) {
            Node nr=new Node(); nr.leaf=false; nr.n=1;
            nr.keys[0]=right.keys[0]; nr.child[0]=leaf; nr.child[1]=right; root=nr;
        } else {
            Node parent=root;
            int idx=0;
            while(idx<=parent.n && parent.child[idx]!=leaf) idx++;
            for(int j=parent.n;j>idx;j--) {
                parent.keys[j]=parent.keys[j-1];
                parent.child[j+1]=parent.child[j];
            }
            parent.keys[idx]=right.keys[0]; parent.child[idx+1]=right; parent.n++;
        }
    }
    void display() {
        Node p=root;
        while(!p.leaf) p=p.child[0];
        System.out.print("B+ Tree Leaf Sequence: ");
        while(p!=null) {
            for(int i=0;i<p.n;i++) System.out.print(p.keys[i]+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BPlusTree t=new BPlusTree();
        while(true) {
            System.out.println("\\nB+ TREE MENU\\n1. Insert\\n2. Search\\n3. Display\\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            if(ch==1) { System.out.print("Enter key: "); t.insert(sc.nextInt()); }
            else if(ch==2) { System.out.print("Enter key to search: "); int k=sc.nextInt();
                System.out.println(t.search(k)?"Key found":"Key not found"); }
            else if(ch==3) t.display();
            else if(ch==4) break;
            else System.out.println("Invalid choice");
        }
        sc.close();
    }
}
