def ceasar_encrypt(str, key)
  str.chars.map { |c| ((c.ord + key - 97) % 26 + 97).chr }.join("")
end

puts ceasar_encrypt("xyz", 3)