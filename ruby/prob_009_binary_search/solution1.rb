def binary_search(array, target)
  search(array, target, 0, array.length - 1)
end

def search(array, target, left, right)
  if left > right
    return -1
  end

  middle = (right - left) / 2
  potential_match = array[left + middle]
  if target > potential_match
    return search(array, target, left + middle + 1, right)
  elsif target < potential_match
    return search(array, target, left, left + middle - 1)
  else
    return left + middle
  end
end

puts binary_search([1, 3, 4, 5, 6, 66, 111], 111)