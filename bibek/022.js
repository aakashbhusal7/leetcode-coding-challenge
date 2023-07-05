var minimumCost = cost => {
    arr = cost.sort((a, b) => b - a);
    i = -1;
    tot = 0;
    while (i++ < arr.length) {
        tot += (arr[i++] || 0) + (arr[i++] || 0);
    }
    return tot;
}
