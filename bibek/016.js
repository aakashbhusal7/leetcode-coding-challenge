addStrings = (a, b) => {
    aa = a.split``.reverse();
    bb = b.split``.reverse();
    i = 0, c = 0;
    ss = [];
    while (a.length > i || b.length > i) {
        sum = +(aa[i] || 0) + +(bb[i++] || 0) + c;
        c = Math.floor(sum / 10);
        ss.push(sum % 10);
    }
    if (c) ss.push(c);
    return ss.reverse().join``;
}
