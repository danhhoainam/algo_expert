# O(n) time
# O(n) space
def two_number_sum(array, target_sum):
  map_items = {}
  for item in array:
    other = target_sum - item
    if other in map_items:
      return [item, other]
    else:
      map_items[item] = True
  return []

print(two_number_sum([1, 3, 4, 222, 5], 6))
