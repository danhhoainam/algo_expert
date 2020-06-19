from binary_tree import BinaryTree


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
