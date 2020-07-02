def is_palindrome(str):
  length = len(str)
  middle = int(length / 2)
  for i in range(0, middle):
    if str[i] != str[length - i - 1]:
      return False
  return True

print(is_palindrome("abccba"))
print(is_palindrome("abcdcba"))
print(is_palindrome("a"))
print(is_palindrome("abc"))