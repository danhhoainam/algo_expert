def product_sum(array, level = 1)
  total = 0
  array.each do |element|
    if element.is_a?(Array)
      total += product_sum(element, level + 1)
    elsif element.is_a?(Integer)
      total += element
    end
  end

  total * level
end

puts product_sum([5,2,[7,-1],3,[6,[-13,8],4]])