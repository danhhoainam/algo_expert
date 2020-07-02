def three_number_sum(array, target_sum):
  new_arr = sorted(array)
  result = []
  length = len(new_arr)
  for i in range(0, length - 2):
    for j in range(i + 1, length - 1):
      for k in range(j + 1, length):
        if new_arr[i] + new_arr[j] + new_arr[k] == target_sum:
          result.append([new_arr[i], new_arr[j], new_arr[k]])
  return result

print(three_number_sum([12,3,1,2,-6,5,-8,6], 0))