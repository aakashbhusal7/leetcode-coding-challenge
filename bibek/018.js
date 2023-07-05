g = x => {
    q = x, str = '', arr = [];
    while (q > 0) {
        if (q == 26) {
            arr.push(q);
            return arr;
        }
        r = q % 26;
        if (r == 0) q--;
        arr.push(r || 26);
        q = Math.floor(q / 26);
    }
    return arr;
};

convertToTitle = x => g(x).reverse().map(x => String.fromCharCode(64 + x)).join``;
