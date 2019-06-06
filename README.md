# Week1Daily2
Find Duplicates: The task was to create a function that could find duplicates among a list of strings.
I decided to use Hashset because Hashsets do not allow duplicate elements. 
If when an element is added to the hashset return a value of false, I would be able toe determine that said element was 
a duplicate. 

Palindrome: A palindrome is a set of characters that written forward or backwards are the same.
The task was to create a function that check if a string is a palindrome. The first then to check was to see 
if the string was more than one character in length. If 1 return true, otherwise compare the first char with the last char. 
If this was true, it would invoke recusion on the substring compare the next to char moving towards the center of the string
where it would eventual terminate either by returning false or the length of the substring would be less than 2.

Divisible: The task was create a function that would print a certain string if a number was divisble by 3, 5, or both.
The function would take an integer as a parameter. Next it would create 2 variables based on the modulus of 3 and 5. 
It check if the two created variables were 0. If true it would print fizzbuzz. IF not, it would check if either of the variables
was 0. If mod3 was 0, it would print fizz and if mod5 waws 0 it would print buzz. If neither were 0, it print that the number
was not divisble by 3 or 5.

Anagrams: An anagram is two strings that contains the same characters although spelled different. The task was to create a function
that would check if two strings were anagrams. The function would take 2 strings as parameters. The strings would then be converted
to char arrays. If the two arrays were not the same length, it would return false. If the same length, the char arrays would be
sorted. The corresponding indices would be compared. Only if all the elements in the indices were the same would the function return
true.
