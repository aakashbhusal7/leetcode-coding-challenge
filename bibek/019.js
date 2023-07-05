var eq = (x, y) => x != y && x.toLowerCase() == y.toLowerCase();

var f = str => {
    let i = -1;
    res = '';
    while (i++ < str.length) {
        if (eq(str[i] || '', str[i + 1] || ''))
            i ++;
        else
            res += str[i] || '';
    }
    return res;
};

var makeGood = str => {
    let curr = '', prev = str;
    while (true) {
        curr = f(prev);
        if (curr == prev) return curr;
        prev = curr;
    }
};
