# O(n) time
# O(n) space
def two_number_sum(array, target_sum)
  map = {}
  array.each do |item|
    other = target_sum - item
    if map.include?(other)
      return [item, other]
    else
      map[item] = true
    end
  end

  return []
end

puts two_number_sum([1,2,5,6,-9], 117)