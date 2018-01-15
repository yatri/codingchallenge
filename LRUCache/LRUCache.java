import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	Node head = null;
	Node tail = null;
	int capacity;
	int len=0;
	Map<Integer, Node> nodeHashmap = new HashMap();
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}
	
	
	public void setValue(int key, int value){
		if(nodeHashmap.containsKey(key)){
			Node node = nodeHashmap.get(key);
			node.data = value;
			remove(node);
			setHead(node);
		}else{
			if(len<capacity){
				Node node= new Node(key, value);
				setHead(node);
				len = len+1;
				nodeHashmap.put(key, node);
			}else{
				nodeHashmap.remove(tail.key);
				remove(tail);
				Node node = new Node(key,value);
				setHead(node);
				nodeHashmap.put(key, node);
			}
		}
	}
	
	public int getValue(int key){
		if(nodeHashmap.containsKey(key)){
			Node n = nodeHashmap.get(key);
			remove(n);
			setHead(n);
			return n.data;
		}
		return -1;
	}
	
	private void setHead(Node n){
		if(head == null){
			head = n;
			tail =n;
		}else{
			head.prev = n;
			n.next = head;
			head = n;
		}
	}
	private void remove(Node n){
		Node pre = n.prev;
		Node post = n.next;
		if(pre==null)
			head = post;
		else
			pre.next = post;

		if(post == null)
			tail = pre;
		else
			post.prev=pre;
	}
	
	
	class Node{
		int key;
		int data;
		Node prev=null;
		Node next =null;
		public Node(int key, int data){
			this.data = data;
			this.key = key;
		}

		public int getKey(){
			return key;
		}
	}
}
