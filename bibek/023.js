var maxDepth = function(root) {
  return maxx(root, 1);
};

maxx = (node, i) => {
  if (!node) return i - 1;
  if (!node.left && !node.right) return i;
  if (!node.left) return maxx(node.right, i + 1);
  if (!node.right) return maxx(node.left, i + 1);
  return Math.max(maxx(node.left, i + 1), maxx(node.right, i + 1));
}
