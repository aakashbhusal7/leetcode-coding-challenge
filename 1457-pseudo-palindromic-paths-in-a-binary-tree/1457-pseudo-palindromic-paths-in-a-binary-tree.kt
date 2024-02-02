/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun pseudoPalindromicPaths (root: TreeNode?): Int {
        fun checkPseudoPalindrome(root: TreeNode?, set: MutableSet<Int>): Int{        
            if(root == null) return 0
            
            if(set.contains(root.`val`)){
                set.remove(root.`val`)
            }else{
                set.add(root.`val`)
            }
            
            if(root.left == null && root.right == null){
                return if(set.size < 2) 1 else 0
            }
            
            return checkPseudoPalindrome(root.left, HashSet(set)) + 
                   checkPseudoPalindrome(root.right, HashSet(set))
         
        }
        return checkPseudoPalindrome(root,mutableSetOf<Int>())
    }
}