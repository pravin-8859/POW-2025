package problem2;
import java.util.concurrent.atomic.AtomicInteger;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CountUnivalSubtrees {

    private AtomicInteger count;

    public int countUnivalSubtrees(TreeNode root) {
        count = new AtomicInteger(0);
        isUnivalHelper(root);
        return count.get();
    }

    private boolean isUnivalHelper(TreeNode node) {
       
        if (node == null) {
            return true;
        }

        boolean isLeftUnival = isUnivalHelper(node.left);
        boolean isRightUnival = isUnivalHelper(node.right);
        if (!isLeftUnival || !isRightUnival) {
            return false;
        }
        if (node.left != null && node.left.val != node.val) {
            return false;
        }
        if (node.right != null && node.right.val != node.val) {
            return false;
        }

        count.incrementAndGet();
    
        return true;
    }

   
    public static void main(String[] args) {
     
        TreeNode root = new TreeNode(0,
            new TreeNode(1),
            new TreeNode(0,
                new TreeNode(1,
                    new TreeNode(1),
                    new TreeNode(1)),
                new TreeNode(0)
            )
        );

        CountUnivalSubtrees solution = new CountUnivalSubtrees();
        int univalSubtreeCount = solution.countUnivalSubtrees(root);

        System.out.println("The number of unival subtrees is: " + univalSubtreeCount);
    }
}
