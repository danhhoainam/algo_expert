class BinaryTree:
  def __init__(self, value):
    self.value = value
    self.left = self.right = None

def init_tree(seeds):
  return insert_node(seeds, None, 0)

def insert_node(seeds, node, index):
  if index < len(seeds):
    currentNode = BinaryTree(seeds[index])
    node = currentNode

    node.left = insert_node(seeds, node.left, index * 2 + 1)
    node.right = insert_node(seeds, node.right, index * 2 + 2)
  return node

def inorder_traversal(node):
  if node is not None:
    inorder_traversal(node.left)
    print(node.value)
    inorder_traversal(node.right)

def solution(root):
  return sum(root, 0)

def sum(node, depth):
  if node is None:
    return 0
  sumLeft = sum(node.left, depth + 1)
  sumRight = sum(node.right, depth + 1)
  return depth + sumLeft + sumRight

tree = init_tree([1,2,3,4,5,6,7,8,9])
print(solution(tree))