def valid_sequence(array, sequence):
  sequence_index = 0
  for number in array:
    if sequence_index == len(sequence):
      return True
    if number == sequence[sequence_index]:
      sequence_index = sequence_index + 1
  return sequence_index == len(sequence)

print(valid_sequence([5, 1, 22, 25, 6, -1, 8, 10, 9], [1, 6, -1, 10]))
print(valid_sequence([5, 1, 22, 25, 6, -1, 8, 10, 9], [5, 1, 22, 777, 10]))