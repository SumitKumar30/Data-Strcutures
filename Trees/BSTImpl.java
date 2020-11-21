// Binary Search Tree Implementation. Operations: Insertion, Deletion & Traversal
class BSTImpl{

  // insertion
  static Node insertBST(Node root, int data){

          // if root is null --> first time
          if(root == null){
              Node newNode = new Node(data);
              root = newNode;
              return root;
          }

            // if the data value is less than root node, move left
              if(data < root.data){
                  root.left = insertBST(root.left, data);
              }
              else{
                  root.right = insertBST(root.right, data);
              }

            return root;
  }

  // Deletion
  static Node deleteBST(Node root, int key){
      // temp will search for the element
      Node temp = root;
      // parent will point to the parent node of current node
      Node parent = null;

      // search the key that you want to delete
      while(temp != null && temp.data != key){
            parent = temp;

            // if key is less that the current node, go to the left subtree
            if(key < temp.data){
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
      }

      // At this line, temp will point to the search key & parent will point to the parent node
      // Case 1: if the node to be deleted is a leaf node
      if(temp.left == null && temp.right == null){
            //  if the node to be deleted is not a root node, then set its parent's
            //  left or right child as null
            if(temp != null){
                  if(parent.left == temp){
                    parent.left = null;
                  }
                  else{
                    parent.right = null;
                  }
            }

            // if the tree has only root node, delete it and set root to null
            else{
                root = null;
            }

      }

      // Case 2: if the node has a single child
      if(temp.left == null || temp.right == null){
        // first search for child node
        Node childNode = null;
        if(temp.left != null){
          childNode = temp.left;
        }
        else{
          childNode = temp.right;
        }
        // if the node to be deleted is not a root node, then replace that node with its child
        if(temp != root){
            if(temp == parent.right){
                parent.right = childNode;
            }
            else{
                parent.left = childNode;
            }
        }
        else{
          root = childNode;
        }
      }
      return root;
  }

  // Traversal
  static void inorderBST(Node root){
    if(root == null)
          return;

    // first visit the left subtree
    inorderBST(root.left);
    // Print the data value
    System.out.println(root.data+" ");
    // third visit the right subtree
    inorderBST(root.right);
  }

  public static void main(String[] args){
      Node root = null;
      int[] values = {15, 10, 20, 8, 12, 18, 7};

      for(int value: values){
          root = insertBST(root, value);
      }

      System.out.println("Inorder Traversal is: ");
      inorderBST(root);

      deleteBST(root, 8);

      System.out.println("Updated BST is: ");
      inorderBST(root);
  }
}
