def binary_search(array, target):
  return search(array, target, 0, len(array))

def search(array, target, left, right):
  while left <= right:
    middle = int((right - left) / 2)
    potential_match = array[left + middle]

    if target > potential_match:
      left = left + middle + 1
    elif target < potential_match:
      right = left + middle - 1
    else:
      return left + middle
  return -1

print(binary_search([1,2,3,5,7,19,22], 19))