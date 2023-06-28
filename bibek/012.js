common = (a, b) => { 
    let i = 0, cmn = '';
    while (a[i] == b[i] && i < a.length && i < b.length) {
        cmn += a[i++];
    }
    return cmn;
};

longestCommonPrefix = strs => strs.reduce((a, b) => common(a, b), strs[0]);
