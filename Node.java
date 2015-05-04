import java.util.ArrayList;
import java.util.List;

public class Node<E>{
    public E data;
    public List<Node<E>> children;
    
    /**
     * Default ctor.
     */
    public Node() {
        super();
    }

    /**
     * Convenience ctor to create a Node<T> with an instance of T.
     * @param data an instance of T.
     */
    public Node(E data) {
        this();
        setData(data);
    }
	

    /**
     * Return the children of Node<E>. The Tree<E> is represented by a single
     * root Node<E> whose children are represented by a List<Node<E>>. Each of
     * these Node<E> elements in the List can have children. The getChildren()
     * method will return the children of a Node<E>.
     * @return the children of Node<E>
     */
    public List<Node<E>> getChildren() {
        if (this.children == null) {
            return new ArrayList<Node<E>>();
        }
        return this.children;
    }

    /**
     * Sets the children of a Node<E> object. See docs for getChildren() for
     * more information.
     * @param children the List<Node<E>> to set.
     */
    public void setChildren(List<Node<E>> children) {
        this.children = children;
    }
 
    /**
     * Returns the number of immediate children of this Node<E>.
     * @return the number of immediate children.
     */
    public int getNumberOfChildren() {
        if (children == null) {
            return 0;
        }
        return children.size();
    }
     
    /**
     * Adds a child to the list of children for this Node<E>. The addition of
     * the first child will create a new List<Node<E>>.
     * @param child a Node<E> object to set.
     */
    public void addChild(Node<E> child) {
        if (children == null) {
            children = new ArrayList<Node<E>>();
        }
        children.add(child);
    }
     
    /**
     * Inserts a Node<E> at the specified position in the child list. Will     * throw an ArrayIndexOutOfBoundsException if the index does not exist.
     * @param index the position to insert at.
     * @param child the Node<E> object to insert.
     * @throws IndexOutOfBoundsException if thrown.
     */
    public void insertChildAt(int index, Node<E> child) throws IndexOutOfBoundsException {
        if (index == getNumberOfChildren()) {
            // this is really an append
            addChild(child);
            return;
        } else {
            children.get(index); //just to throw the exception, and stop here
            children.add(index, child);
        }
    }
     
    /**
     * Remove the Node<E> element at index index of the List<Node<E>>.
     * @param index the index of the element to delete.
     * @throws IndexOutOfBoundsException if thrown.
     */
    public void removeChildAt(int index) throws IndexOutOfBoundsException {
        children.remove(index);
    }
 
    public E getData() {
        return this.data;
    }
 
    public void setData(E data) {
        this.data = data;
    }
     
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(getData().toString()).append(",[");
        int i = 0;
        for (Node<E> e : getChildren()) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(e.getData().toString());
            i++;
        }
        sb.append("]").append("}");
        return sb.toString();
    }
	
}