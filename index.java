public class index {
    
    int data;
    index next;
    public index(int data){
        this.data=data;;
        this.next=null;
    }
    public class linked {
        index head;
        public void add(int data){
            index newNode = new index(data);
            newNode.next=head;
            head=newNode;
        }
        public void print(){

            index curr =head;
            while(curr !=null){
                System.out.println(curr.data + " ");
                curr =curr .next;

            }
        }
    }


    public static void main(String[] args) {
        
        

    }
}
