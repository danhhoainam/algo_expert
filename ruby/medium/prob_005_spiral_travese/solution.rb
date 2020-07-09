def deep_clone(object)
  Marshal.load(Marshal.dump(object))
end

def spiral_traverse(array)
  result = []
  new_array = deep_clone(array)

   # Lambdas to execute depending on the current case. In summary, they will do the following:
  # top    -> remove the first array, which is the first row.
  # right  -> for each row, remove the last element (last column) and return all of them packed (map).
  # bottom -> remove the last array, which is the last row. The result must be reversed.
  # left   -> for each row, remove the first element (first column) and return all of them packed (map). The result must be reversed.
  actions = { 
    top:    lambda{ new_array.shift                       },
    right:  lambda{ new_array.map { |f| f.pop }           },
    bottom: lambda{ new_array.pop.reverse                 },
    left:   lambda{ new_array.map { |f| f.shift }.reverse }
  }

  # `cases` will iterate the above hash keys like following: top, right, bottom, left, top, right, ...
  cases = actions.keys.cycle

  # Repeat until the matrix is empty (this will call the lambdas from the hash of above).
  result.concat actions[cases.next].call() until new_array.empty?

  # Return output array.
  return result.compact
end

test_1 = spiral_traverse([[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]])
p test_1

test_2 = spiral_traverse([[1]])
p test_2

test_3 = spiral_traverse([[1, 2, 3], [12, 13, 4], [11, 14, 5], [10, 15, 6], [9, 8, 7]])
p test_3