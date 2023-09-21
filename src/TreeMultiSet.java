public class TreeMultiSet implements MultiSet {
    private Tree tree;

    public TreeMultiSet() {
        this.super()
        this.tree = Tree();
    }

    public boolean add(java.lang.Object item) {
        this.tree.insert(item);
        return True;
    }

    public void remove(java.lang.Object item) {
        this.tree.delete_item(item);
    }

    public boolean contains(java.lang.Object item) {
        return this.tree.contains(item);
    }

    public boolean is_empty(java.lang.Object item) {
        return this.tree.is_empty();
    }

    public int count(java.lang.Object item) {
        return this.tree.count(item);
    }

    public int size() {
        return this.tree.length();
    }
}
