function two_number_sum(array, target_sum) {
  map = {};

  for (var i = 0; i < array.length; i++) {
    item = array[i];
    other = target_sum - item;
    if (map[other]) {
      return [item, other];
    } else {
      map[item] = true;
    }
  }

  return [];
}

console.log(two_number_sum([1,3,4,5,2,24,11], 4));