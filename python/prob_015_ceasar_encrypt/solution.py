def ceasar_encrypt(str, key):
  result = ""
  for char in str:
    new_pos = (ord(char) + key - 97) % 26 + 97
    result += chr(new_pos)
  return result

print(ceasar_encrypt("abcxyz", 3))