var findContentChildren = function(g, s) {
    count = 0;
    gSort = g.sort((a, b) => a - b);
    sSort = s.sort((a, b) => a - b);
    gSort.map(x => {
        let ix = sSort.findIndex(y => y >= x);
        if (ix == -1) return;
        count++;
        sSort = [...sSort.slice(0, ix), ...sSort.slice(ix + 1)];
    });
    return count;
};
