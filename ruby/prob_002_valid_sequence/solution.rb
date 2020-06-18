def valid_sequence(array, sequence)
  sequence_index = 0

  array.each do |number|
    if sequence_index == sequence.length
      return true
    end

    if sequence[sequence_index] == number
      sequence_index = sequence_index + 1
    end
  end

  sequence_index == sequence.length
end

puts valid_sequence([5, 1, 22, 25, 6, -1, 8, 10, 9], [1, 6, -1, 10])
puts valid_sequence([5, 1, 22, 25, 6, -1, 8, 10, 9], [5, 1, 22, 777, 10])