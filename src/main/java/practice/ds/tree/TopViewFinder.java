package practice.ds.tree;

import java.util.LinkedList;
import java.util.List;

public class TopViewFinder {

    private static List<Integer> output = new LinkedList<>();
    private static int maxLeft = 0;
    private static int maxRight = 0;

    public static List<Integer> printTopView(final TreeNode root) {

        output.add(root.getValue());
        doGetTopView(root.getLeft(), 1, -1);
        doGetTopView(root.getRight(), -1, 1);
        return output;
    }

    private static void doGetTopView(final TreeNode root, final int leftDist, final int rightDist) {

        if (root == null) {
            return;
        }

        if (leftDist > maxLeft) {
            maxLeft = leftDist;
            output.add(root.getValue());
        }
        if (rightDist > maxRight) {
            maxRight = rightDist;
            output.add(root.getValue());
        }

        doGetTopView(root.getLeft(), leftDist + 1, rightDist - 1);
        doGetTopView(root.getRight(), leftDist - 1, rightDist + 1);


    }
}
