def binary_search(array, target):
  return search(array, target, 0, len(array))

def search(array, target, left, right):
  if left > right:
    return -1

  middle = int((right - left) / 2)
  potential_match = array[left + middle]
  if target > potential_match:
    return search(array, target, left + middle + 1, right)
  elif target < potential_match:
    return search(array, target, left, left + middle - 1)
  else:
    return left + middle

print(binary_search([1,2,3,5,7,19,22], 19))