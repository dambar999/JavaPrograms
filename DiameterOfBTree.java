package Tree;

public class DiameterOfBTree {

	
		static Node root ;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         root= new Node(1);
	         root.left = new Node(2); 
	         root.right = new Node(3); 
	         root.left.left = new Node(4); 
	         root.left.right = new Node(5); 
	         root.right.right = new Node(8); 
	         root.right.left = new Node(8); 
	         root.right.right.left = new Node(6); 
	         root.right.right.right = new Node(7); 
	         System.out.println(findDiameter(root));
		}

		public static int findDiameter(Node node) {
			if(node==null) {
				return 0;
			}
			int leftDiameter= findDiameter(node.left);
		    int rightDiameter= findDiameter(node.right);
			int left = findDiameter(node.left);
			int right= findDiameter(node.right);
			int height = Math.max(left, right)+1;
			int diameter = Math.max(leftDiameter, rightDiameter);
			return Math.max(height, diameter);
			
		}
}
