checkRecord = s => {
    let i = -1, a = 0;
    while (i++ < s.length) {
        a+= s[i] == 'A';
        if (s.substring(i - 3, i) == 'LLL' || a == 2) return false;
    }
    return true;
};
