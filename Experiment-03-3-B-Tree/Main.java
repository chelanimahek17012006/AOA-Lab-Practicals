import java.util.*;
class BTree {
    static final int T = 2; // minimum degree
    static class Node {
        int[] key = new int[2*T-1];
        Node[] child = new Node[2*T];
        int n = 0;
        boolean leaf;
        Node(boolean leaf) { this.leaf = leaf; }
    }
    Node root = new Node(true);
    void traverse(Node x) {
        int i;
        for (i=0; i<x.n; i++) {
            if (!x.leaf) traverse(x.child[i]);
            System.out.print(x.key[i] + " ");
        }
        if (!x.leaf) traverse(x.child[i]);
    }
    boolean search(Node x, int k) {
        int i=0;
        while (i<x.n && k>x.key[i]) i++;
        if (i<x.n && x.key[i]==k) return true;
        return !x.leaf && search(x.child[i], k);
    }
    void splitChild(Node x, int i, Node y) {
        Node z = new Node(y.leaf);
        z.n = T-1;
        for (int j=0; j<T-1; j++) z.key[j]=y.key[j+T];
        if (!y.leaf)
            for (int j=0; j<T; j++) z.child[j]=y.child[j+T];
        y.n=T-1;
        for (int j=x.n; j>=i+1; j--) x.child[j+1]=x.child[j];
        x.child[i+1]=z;
        for (int j=x.n-1; j>=i; j--) x.key[j+1]=x.key[j];
        x.key[i]=y.key[T-1];
        x.n++;
    }
    void insertNonFull(Node x, int k) {
        int i=x.n-1;
        if (x.leaf) {
            while (i>=0 && k<x.key[i]) { x.key[i+1]=x.key[i]; i--; }
            x.key[i+1]=k; x.n++;
        } else {
            while (i>=0 && k<x.key[i]) i--;
            i++;
            if (x.child[i].n==2*T-1) {
                splitChild(x,i,x.child[i]);
                if (k>x.key[i]) i++;
            }
            insertNonFull(x.child[i],k);
        }
    }
    void insert(int k) {
        if (search(root,k)) { System.out.println("Duplicate key ignored."); return; }
        Node r=root;
        if (r.n==2*T-1) {
            Node s=new Node(false); root=s; s.child[0]=r;
            splitChild(s,0,r); insertNonFull(s,k);
        } else insertNonFull(r,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BTree t=new BTree();
        while (true) {
            System.out.println("\\nB-TREE MENU\\n1. Insert\\n2. Search\\n3. Traversal\\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            if(ch==1) { System.out.print("Enter key: "); t.insert(sc.nextInt()); }
            else if(ch==2) { System.out.print("Enter key to search: "); int k=sc.nextInt();
                System.out.println(t.search(t.root,k)?"Key found":"Key not found"); }
            else if(ch==3) { System.out.print("B-Tree Traversal: "); t.traverse(t.root); System.out.println(); }
            else if(ch==4) break;
            else System.out.println("Invalid choice");
        }
        sc.close();
    }
}
