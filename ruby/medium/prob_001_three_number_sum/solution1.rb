def three_number_sum(array, target_sum)
  array.sort.combination(3).filter{|x,y,z| x+y+z==target_sum}
end

puts three_number_sum([12,3,1,2,-6,5,-8,6], 0)