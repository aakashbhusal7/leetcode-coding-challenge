romanToInt = s => {
    vals = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000,
    };
    return s.split``.reduce((a, b, i) => a + ((vals[s[i + 1]] && vals[s[i + 1]] > vals[b]) ? (-vals[b]) : vals[b]), 0);
};
