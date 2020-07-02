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
  result = []
  branch_sum(root, result, 0)
  return result

def branch_sum(root, result, running_sum):
  if root is None:
    return

  new_sum = root.value + running_sum
  if root.left is None and root.right is None:
    result.append(new_sum)
    return

  branch_sum(root.left, result, new_sum)
  branch_sum(root.right, result, new_sum)

tree = init_tree([1,2,3,4,5,6,7,8,9,10])
print(solution(tree))
