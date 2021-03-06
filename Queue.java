class TestQueue{
	
	private int maxsize;
	private long [] array;
	private int front;
	private int end;
	private int no_item;
	
	
	public TestQueue(int size){
		this.maxsize=size;
		this.array=new long[maxsize];
		this.front=0;
		this.end=-1;
		this.no_item=0;
		
	}
	
	public void insert(int data)
	{
		if(end==maxsize-1)
		{
			end=-1;  //if it reaches the last element then last ement will be added the front
		}
		end++; //-1 goes to 1
		array[end]=data; // item inserted
		no_item++; 
	}
	
		public long remove(){
		long old=array[front]; //first element will be store
		front++; // then goes to next element
		if(front==maxsize)
		{
			front=0;  // if only one item is added and try to remove that item then it show null queue
		}
		return old;
		
		
	}
	
	public boolean isEmpty(){
	return (no_item==0);
	
	}
	public boolean isFull(){
		return(no_item==maxsize);
	}
	

	
	
	
	public void display(){
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ " " ); // O(n) // display all element
			
		}
		
	}
}
class Queue{
	
	public static void main (String[] args)
	{
		
		TestQueue queue=new TestQueue(5); //defining total size of queue
		queue.insert(20);
		queue.insert(50);
		queue.insert(90);
		queue.insert(100);
		
		while(!queue.isEmpty()){
			queue.display();
				break;
		}
	}
	
}
