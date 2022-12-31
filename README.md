# RomanToInteger
Convert Roman Numerals to Integers.

First, the code defines a function called ``romanToInt`` that takes a string as an input and returns an integer. The function begins by defining two arrays: ``values`` and ``numerals``. The values array contains the integer values for each of the Roman numerals, in the order that they should be processed. The numerals array contains the Roman numerals themselves, also in the order that they should be processed.

Next, the code initializes three variables: ``result``, ``i``, and ``j``. ``result`` will hold the final integer result, ``i`` is an index that will be used to iterate through the characters in the input string, and ``j`` is an index that will be used to iterate through the values and numerals arrays.

The code then enters a while loop that will continue as long as ``i`` is less than the length of the input string and ``j`` is less than the size of the ``values`` array. Inside the loop, it uses the ``startsWith`` function to check if the character at index ``i`` in the input string is the start of a valid Roman numeral. If it is, the code adds the corresponding value from the values array to the result and advances the ``i`` index by the length of the numeral. If the character is not the start of a valid numeral, the code increments the ``j`` index to move on to the next numeral in the list.

Finally, the code returns the result when the loop completes.
