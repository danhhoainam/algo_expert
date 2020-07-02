def three_number_sum(array, target_sum):
  new_arr = sorted(array)
  result = []
  length = len(new_arr)
  for i in range(0, length - 2):
    left = i + 1
    right = length - 1
    while left < right:
      current_sum = new_arr[i] + new_arr[left] + new_arr[right]
      if current_sum == target_sum:
        result.append([new_arr[i], new_arr[left], new_arr[right]])
        left = left + 1
        right = right - 1
      elif current_sum > target_sum:
        right = right - 1
      else:
        left = left + 1
  return result

print(three_number_sum([12,3,1,2,-6,5,-8,6], 0))