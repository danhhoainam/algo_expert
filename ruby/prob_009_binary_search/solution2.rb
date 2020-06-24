def binary_search(array, target)
  search(array, target, 0, array.length - 1)
end

def search(array, target, left, right)
  while left <= right
    middle = (right - left) / 2
    potential_match = array[left + middle]
    
    if target > potential_match
      left = left + middle + 1
    elsif target < potential_match
      right = left + middle - 1
    else
      return left + middle
    end
  end

  -1
end

puts binary_search([1, 3, 4, 5, 6, 66, 111], 111)