package Abstract_class_Challenge;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem item){
        this.root = item;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //new item is greater and move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else{
                    //there is no next, so insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                if(currentItem.previous() == null){
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    this.root = newItem;
                } else {
                    //new item is less, insert before
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }
                return true;
            } else{
                System.out.println("The item " + newItem.getValue() + " already in the list.");
                return false;
            }
        }
        return false; //this stage should not reach
    }

    @Override
    public boolean removeItem(ListItem newItem) {
        if(newItem != null){
            System.out.println("Deleting" + newItem.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison == 0){
                if(currentItem == this.root){
                    this.root = this.root.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else{
                System.out.println("The item to be deleted is not in the list.");
                return false;
            }
        }
        return false; //this stage should not be reached
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty.");
        }else{
            while(root != null){
                System.out.print(root.getValue());
                root = root.next();
            }
            System.out.println();
        }
    }
}
