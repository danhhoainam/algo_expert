class BinaryTree
  attr_reader :value
  attr_accessor :left, :right

  def initialize(value)
    @value = value
    @left = nil
    @right = nil
  end
end

def init_tree(seeds)
  insert_nodes(seeds, nil, 0)
end

def insert_nodes(seeds, node, index)
  if index < seeds.length
    temp_node = BinaryTree.new(seeds[index])
    node = temp_node
    node.left = insert_nodes(seeds, node.left, index * 2 + 1)
    node.right = insert_nodes(seeds, node.right, index * 2 + 2)
  end
  node
end

def inorder_traversal(node)
  if node != nil
    inorder_traversal(node.left)
    puts node.value
    inorder_traversal(node.right)
  end
end

tree = init_tree([1,2,3,4,5,6,7,8,9])
inorder_traversal(tree)

def solution(root)
  sum_tree_depth(root, 0)
end

def sum_tree_depth(node, depth)
  if node == nil
    return 0
  end

  sum_left = sum_tree_depth(node.left, depth + 1)
  sum_right = sum_tree_depth(node.right, depth + 1)

  depth + sum_left + sum_right
end

puts solution(tree)