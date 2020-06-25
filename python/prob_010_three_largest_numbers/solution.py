def three_largest_numbers(array):
  max_arr = [None, None, None]
  for number in array:
    find_max(max_arr, number)
  return max_arr

def find_max(max_arr, number):
  if max_arr[2] is None or number > max_arr[2]:
    shift_max_arr(max_arr, number, 2)
  elif max_arr[1] is None or number > max_arr[1]:
    shift_max_arr(max_arr, number, 1)
  elif max_arr[0] is None or number > max_arr[0]:
    shift_max_arr(max_arr, number, 0)

def shift_max_arr(max_arr, number, index):
  for i in range(index + 1):
    if i == index:
      max_arr[i] = number
    else:
      max_arr[i] = max_arr[i + 1]

print(three_largest_numbers([1, 42, 12, 3, -2, 222, 9]))