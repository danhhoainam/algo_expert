def product_sum(array, level = 1):
  total = 0

  for element in array:
    if type(element) is list:
      total += product_sum(element, level + 1)
    elif type(element) is int:
      total += element

  return total * level

print(product_sum([1,2,3,[4,5],6,[7,8,[9,10,-200]]]))