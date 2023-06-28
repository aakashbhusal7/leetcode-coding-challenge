let f = s => {
    let map = {}, i = 1;
    return s.split``.map(x => {
        if (!map[x]) map[x] = i++;
        return map[x];
    });
};
var isIsomorphic = (s, t) => '' + f(s) == ('' + f(t))
