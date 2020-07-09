def spiral_traverse(array):
  result = []
  start_row, end_row = 0, len(array) - 1
  start_col, end_col = 0, len(array[0]) - 1

  while start_row <= end_row and start_col <= end_col:
    for col in range(start_col, end_col + 1):
      result.append(array[start_row][col])

    for row in range(start_row + 1, end_row + 1):
      result.append(array[row][end_col])

    for col in reversed(range(start_col, end_col)):
      if start_row == end_row:
        break
      result.append(array[end_row][col])

    for row in reversed(range(start_row + 1, end_row)):
      if start_col == end_col:
        break
      result.append(array[row][start_col])

    start_col += 1
    end_col -= 1
    start_row += 1
    end_row -= 1

  return result

test_1 = spiral_traverse([[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]])
print(test_1)

test_2 = spiral_traverse([[1]])
print(test_2)

test_3 = spiral_traverse([[1, 2, 3], [12, 13, 4], [11, 14, 5], [10, 15, 6], [9, 8, 7]])
print(test_3)