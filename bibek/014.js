var isPalindrome = (s, t = s.replace(/[\W_]/g, '').toLowerCase()) => t == t.split``.reverse().join``;
